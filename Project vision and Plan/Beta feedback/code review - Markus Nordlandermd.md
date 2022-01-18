Tänk på att jag inte kan Java-snacket så försök att inte fastna på specifika ord
jag valt att använda, försök att se vad jag menar istället. Jag kommer slänga
mig med ord som arv, basklasser, o allt möjligt. Är ganska säker på att alla
koncept finns i Java, men jag är inte säker på att jag använder rätt ord för
Java-världen... så missförstå mig rätt eller fråga vad jag menar!

Tror att allt jag slängt ut mig nu bara är förslag, tankar och mina egna
preferenser… så du får ju själv försöka avgöra värdet i det som sägs och om det
är något du vill ta till dig.

Finns en del kod med, se det som psudo-kod som är tänkt att förklara mina tankar
lite mer tekniskt.

Projektstruktur
---------------

Det är alltid bra med en bra struktur som delar in koden på något sätt, det gör
det lättare att hitta kod, förstå syftet, se relationer mellan klasser/metoder
etc.

Det här projektet är litet så inte så mycket att hålla koll på men det är också
helt platt. Man skulle t.ex. ha kunnat skapa mappen /Models och lagt alla
Expertis.java, Hantverk.java, Karaktar.java etc. där. Kanske en /BusinessLogic
eller /PDF för att gruppera logik.

Det här är ju upp till var och en och det finns en hel drös med
arkitekturmönster att lära sig om, men en röd tråd som finns är att väldigt
många delar upp i ”logik”, ”modeller”, ”presentation” (på något sätt… se t.ex.
MVC, MVVM, MVP)

Projektspråk
------------

Jag gillar inte att koda på andra språk än engelska. Det går att komma med
argument kring läsbarhet, förvaltning, samarbete m.m. men för mig känns det
egentligen bara fel.

Jag tycker att alla klasser, variabler, attribut, funktioner etc. ska vara på
engelska, sen kan man använda t.ex. svenska som *presentationsspråk* så allt som
användaren ser och läser är på svenska.

Kodstandard
-----------

Jag tycker kodstandarden känns lite spretig, så kan vara värt att gå igenom alla
filer en gång till och ”städa upp” koden. Vet inte ifall man kan specificera
sånt med IntelliJ eller liknande och få hjälp med markeringar eller till och med
auto-åtgärdat för att göra det enklare. Men iaf läsbarheten blir bättre ifall du
har en standard och följer den så hårt som möjligt, det kan vara regler som att
ha max två blanka rader i följd, alltid ha fyra space/en tab indentering per
scope-nivå, etc. (borde finnas plugin för sånt här, typ CheckStyle).

Kan också vara värt att gå igenom variabelnamn, metodnamn och sånt en gång till
och försöka ha så bra, beskrivande namn som möjligt. Några exempel:

-   I PdfMigration.java finns \_pdfDocument och \_pdfDocument2 som inte blir
    speciellt tydligt, speciellt när dom ligger som klass-variabler… kan man
    tänka sig att dom kanske är \_pdfTemplate och \_generatedDocument?

-   I PdfExtractor finns variabel f och f2, där den ena syftar på parent-folder
    och den andra är filen. (här skulle man kanske också kunna ändra koden så
    syftet blir tydligare, typ if(Files.isDirectory(dbDir)))

-   I PreviewFullFXMLcontroller.java har du t.ex. flera *rNumber*, jag tycker
    inte att man vinner nått på den förkortningen istället för att skriva ut
    t.ex. randomNumber

Karaktär + Attribut
-------------------

### D6Attribute (eller liknande)

Jag tycker det hade varit snyggt att bryta ut alla eller dom flesta av dessa
karaktärsattribut till en bas-klass, t.ex. *D6Attribute*. Den här hade kunna äga
alla get/set och toString… reCount hade säkert också gått att få in där för att
verkligen samla allt under samma bas. Det här samlar koden, minskar
kod-duplicering m.m.

Sen ser jag två möjliga sätt att använda denna *D6Attribute*-klass alternativ 1
hade kunna vara att fortsätta ha samma uppdelning, alltså att alla befintliga
implementationer finns kvar fast i formatet:

*class Expertis extends D6Attribute*

Eller alternativ 2. Att man bara har klassen D6Attribute och användningen av den
tydliggör innebörden (ifall det är en expertis, hantverk etc.). Jag föredrar
alternativ 2, så länge det inte finns en tydlig mening i att särskilja dom på
klass-nivå (jag har inte orkat värdera vad som är fallet här).

Då hade implementationerna alltså styrts genom själva användningen av klassen i
*Karaktar.java* ungefär så här:

*…*

*private ArrayList\<D6Attribute\> grundAttributsArrayList;*

*private ArrayList\<D6Attribute\> rorFardighetArrayList;*

*…*

### Specificera viktiga/återkommande strängar

Jag gillar att begränsa både utvecklare och användare i starkt typade objekt så
fort det passar (det passar så klart inte alltid!). Jag kan för lite om
applikationen/spelet för att avgöra ifall det här är en bra idé eller inte men
det skulle kunna va nått att titta på.

I konstruktorn för *Karaktar.java* initieras en hel drös av attribut med
strängar, så här:

*…*

*grundAttributsArrayList.add(new GrundAttribut(”Styrka”));*

*…*

Här finns det en risk för felstavning, miss vid ändringar etc. ifall dessa
attribut används på flera ställen (nu eller i framtiden). Så om dessa är kända,
t.ex. om det finns 20 st grundattribut, 50 färdigheter etc. så skulle dessa
kunna specificeras i t.ex. en(eller flera t.ex. *enum BaseAttribute, enum
Skills*) Enum där värdet/strängen finns sparad på ett ställe för hela
applikationen. Det är ju kanske inte så smidigt ifall man enkelt vill att fler
ska komma till i framtiden och sånt, men som sagt skulle kunna vara nått att
fundera på. Vill man att den ska vara öppen för nya attribut men vet att några
verkligen är basattribut för hela spelet (t.ex. Styrka) som antagligen inte
kommer ändras då kan man t.ex. ha två implementationer av *D6Attribute* så här:

*class BaseAttribute extends D6Attribute {*

*public BaseAttribute(BaseAttributeEnum name, int t) {*

*super(name.toString(), t);*

*…*

*}*

och

*class CustomAttribute extends D6Attribute {*

*public CustomAttribute(string name, int t) {*

*super(name, t);*

*…*

*}*

### Get/Set/Change

Jag tycker get-, set-, change-metoderna används lite fel. För mig är GetT() =\>
return T och SetT(newValue) =\> this.T = newValue. Och sen om dessa ska ändras
så har man antingen logik någon annanstans som anropar Get(), gör logik, och sen
Set() med det nya beräknade värdet eller så har man en hjälpmetod (som tydlig
speglar vad den gör), typ IncreaseT(value) =\> this.T += value.

### Karaktar.java toString(), dynamisk genom Reflection

Det här förslaget är antagligen väldigt mycket överkurs men kan vara bra att
känna till att det finns. Det finns en möjlighet att man kan använda reflection
för att förenkla denna metod, kan vara värt att titta på.

Reflection tillåter koden att inspektera och modifiera beteendet hos metoder,
klasser, interfaces, etc. i runtime. Det hade antagligen inneburit mindre kod
men också gjort den dynamisk, så att om t.ex. *Karaktar.java* fick fler
attribut, kanske ArrayList\<Mount\> eller ArrayList\<companion\>, så behöver
inte toString() uppdateras. Genom reflection kommer dom nya attributen plockas
upp och hanteras utan att dom specifikt nämns i toString().

I väldigt grov psudo-kod skulle det innebära att man nog kan göra något sånt
här:

var characterAsString = “”;

var characterProperties = this.GetProperties();

foreach(var property in characterProperties) {

var propertyString = property.Name.toString() + ”: ”;

if (property.GetType() == typeOf(ArrayList\<D6Attribute\>)) {

propertyString += ”\\n”;

foreach(var item in property.Value) {

propertyString += item.getName() + “ ” + item.getT() + “D6+” + item.getTMod() +
“\\n”

}

}

else if (property.GetType() == typeOf(ArrayList\<string\>)) {

propertyString += ”\\n”;

foreach(var item in property.Value) {

propertyString += item + “\\n”

}

}

else if (property.GetType() == typeOf(string) \|\| property.GetType() ==
typeOf(int)) {

propertyString += item + “\\n”

}

characterAsString += propertyString;

}

return characterAsString;

Men som sagt kanske överkurs och kanske inte värt besväret, men oavsett alltid
bra att känna till att det finns. Passar kanske inte i det här läget, men man
brukar springa in i den typen av problem lite till och från… att man i runtime
vill plocka fram ”meta-data” om klassen.

PreviewFullFXMLcontroller.java
------------------------------

### Kod-/Projektstruktur

Återkommer till den här punkten. Bara storleken på filen gör det svårt att följa
allt som händer, så här blir det tydligt vad en bra uppdelning av koden kan ge.
Som namnet säger så är det en controller, min åsikt är att en controller ska
vara (jämförelsevis) slimmad. Jag kan inte påstå att jag kan citera
SOLID-principerna, men kärnan av vad dom vill förmedla är bra att ha i
bakhuvudet… att försöka dela upp och tydliggöra ansvaret i koden.

Identifiera logik i filen som har tydliga syften och se vilka grupperingar som
känns vettiga. Det här är en fråga om smak och tycke men du har t.ex. querys mot
databasen, det skulle kunna brytas ut till en/flera Repository-klasser. Jag har
oftast en repository-klass för varje tabell/datamodell jag arbetar mot.

Du har en hel del metoder calcLivskraft(), calcGrundrustning(),
calcGrundskada(), calcRandomGrundAttribut() (och fler) som känns
karaktärsrelaterat, sånt skulle man säkert kunna samla i en/flera
helpers/services/eller vad man nu vill kalla dom. Det skulle kunna va brett
beskrivet =\> logik för karaktär, eller lite smalare som t.ex. någon form av
initilizehelper, buyskillhelper etc. Kör man smalare så blir varje klass mindre
och syftet mer specifikt, men det behöver inte alltid vara bättre… bra att
försöka hitta en balans som passar situationen.

### Specificera viktiga/återkommande strängar

Även här har du viktiga strängar som styr logiken. Det kan vara värt att samla
hanteringen av dom, men det beror på hur dom används i applikationen. Man
minskar risken för fel men å andra sidan blir man mer inlåst.

Det här behöver ju inte heller vara enum(s) som jag föreslog tidigare, det
skulle kunna vara en statisk/global klass som håller strängarna som attribut
m.m.

### Databasanrop och injection-attacker

Jag vet inte ifall det finns något inbyggt i Statement/.executeQuery() som
skyddar mot detta men du har kommunikationen mot databasen i formen; *”SELECT \*
FROM ”+tableName+” where ID = ”+id*. Även om man litar på sin kod och det inte
finns någon användar-input som följer med ner till anropet så är det som regel
inte rekommenderat att göra så, genom att klistra ihop DB-querys på det här
sättet finns risken att det smyger sig in en attack mot databasen, t.ex. om id
=\> ”1 OR 1=1” så får du hela tabellen, om id =\> ”1; DROP TABLE \<name\>” så
har en tabell raderats.

Ofta brukar det finnas stöd i biblioteken för stored procedures eller liknande
där parametrarna är tydligt specificerade och säkrade för den här typen av
missar.

Känns inte som att det här är något du behöver tänka på, men bra att ha koll på.

### Kodkomplexitet/djup

Jag tar väggen av switch-statements i metoden specialTable() för att få ett
tydligt exempel för vad jag pratar om men jag vet inte, det kanske var något
till ställe som det stämmer in på också.

Jag tycker att ”djupet” på koden, antal indenteringar, brukar vara en ganska bra
måttstock på hur komplex koden har blivit och ifall den skulle behöva brytas ut
till flera mindre metoder. Här ser man hur koden bara växer med switch i en
switch i en switch (det gäller om det hade varit if, for, while, vad som). I
sånna här fall blir det mycket mer läsbart ifall man bryter ut dom olika fallen
i egna hjälpmetoder och gör varje separat del överskådlig, då kan man följa
koden djupare ner i hjälpmetoderna för det fallet man är intresserad av (bonus
är att man ofta hittar sätt att generalisera metoderna längre ner så dom kan
återanvändas, så slipper man duplicerad kod också).

Tar jag specialTable() som exempel skulle det t.ex. kunna se ut så här när man
börjar läsa den:

switch (tableName) {

case ”folkslag”:

handleRace(karaktar, conn, id);

break;

case ”farderaventyr”:

handleTravellAdventures(karaktar, conn, id);

break;

…

…

private void handleRace(Karaktar character, Connection conn, int id) {

switch (id) {

case 6:

dbTableInteract(character, conn, ”jargier”, randomNumber(10));

break;

case 7:

dbTableInteract(character, conn, ”jargier”, randomNumber(10));

break;

}

…

Tja! Testade appen idag, är ju ingen UX:are men några tankar kring den:
Validering saknas på "skapa pdf", jag skapade pdf utan att ha fyllt i namn..
filen "null null" skapades, hade varit nice att blivit blockad/varnad där
istället. Hade varit snyggt om modifiering av tärning+mod kunde ske direkt i
tabellen. Snyggt om både "karaktärs fält" och tabeller sparas medan man ändrar
värdena. Hade nog varit nice med en utökad dialog vid "skapa pdf", t.ex. själv
ange mapp o namn där den sparas
