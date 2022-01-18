1)

Använd var istället för string, int, File osv osv. Exempel:

var f = new File(dbDir);

Istället för:

File f = new File(dbDir);

Det gör koden mer lättläst och man slipper upprepa sig själv, finns även en del
exempel där det gör det väldigt mkt mer lättanvänt om t.ex variablen ska vara en
dictionary eller något som kan vara drygt att skriva ut/enkelt att läsa.

Random exempel som inte är taget specifikt från din kod:

Npcs\<String, List\<Raser\>\> xxx = foo();

Jämför detta med exemplet nedan, kompilatorn fattar vad det är för variabel från
kontext:

var xxx = foo();

 

2)

Är det standard att använda ”this.t = t;” i java? I C\# har man gått bort från
det till att ist särskilja dem så man deklararer ex ”private int \_t = 0;” och
sedan i constructorn så sätter man ”_t = t;”

Semantik såklart men det bara stack ut lite så blev nyfiken. På något ställe har
du deklararat int T och i constructorn använt T += t så det är ju inte helt
genomgående i koden heller

3)

printStackTrace. Eftersom jag inte kör java så är jag ju inte 100% säker på vad
detta gör, men min gissning skulle vara att du kastar stacktracen till standard
error-output streamen vilket inte gör det traceable efter systemet stängs ner?
En tanke vore att logga errors till databasen för att kunna tracka dem, att
logga vad systemet gör till db eller till någon tjänst ger stora fördelar även
för annat än bara errors vad gäller att hålla koll på ändringar som gjorts m.m.
på databas-värden exempelvis. Det är ju inget fel i sig utan mer en kommentar om
något att tänka på vilket kanske inte alls var relevant för uppgiften :)

4)

InputFileStream som inte stängs. Exempel från DbConnector.java

Du har en try-catch efter att du deklararet iStream variabeln men den stängs
aldrig vilket kan leda till memory leaks. Ett sätt är att bara slänga in en
finally { if (iStream != null) { iStream.close(); } } men i C\# åtminstone finns
en snyggare lösning vilket är att använda en using-statement som så:

using (var iStream = DbConnector.class.getResourceAsStream("/db/"+dbName)) {

// läs in filen från inputstream här

}

Googlade lite snabbt efter jag skrivit kommentaren hur detta fungerar i java om
alls, och det finns något som heter try-with-resource som fungerar på samma sätt
som c\#'s using och därmed automatiskt stänger ner resursen efter sig. Så i ditt
exempel hade följande kod:

InputStream iStream = DbConnector.class.getResourceAsStream("/db/"+dbName);

try {

Files.copy(iStream, f2.toPath(), StandardCopyOption.REPLACE_EXISTING);

} catch (IOException e) {

e.printStackTrace();

}

kunnat skrivas såhär istället för att automatiskt hantera att resursen stängs:

try (var iStream = DbConnector.class.getResourceAsStream("/db/"+dbName))

{

Files.copy(iStream, f2.toPath(), StandardCopyOption.REPLACE_EXISTING);

}

catch (IOException e)

{

e.printStackTrace();

}

 

Blir lite kass formatering i word men vafan, you get the drift!

5)

Basklass att ärva från för att undvika duplicering? I Hantverk, Kannetecken m.m.
så deklareras private String name, private int t = 0; och private int tMod = 0;
samt metoder för att hämta och setta dessa osv som är samma i alla klasser. En
smidigare lösning hade varit att skapa en basklass som innehåller allt detta och
sedan låta Hantverk, Kannetecken och alla andra klasser som i stort sett är
kopior på varandra ärva från denna. DRY! På det viset behöver du bara skriva ut
det som faktiskt är unikt för varje klass och allt annat bara ärvs ner.
Snyggare, väldigt mycket smidigare och snabbare att göra samt det blir mindre
chans för att du som nu använder getName i vissa filer och getNamn i andra (Been
there done that haha)

Exempel på hur GrundAttribut hade kunnat se ut om du flyttade allt som används
överallt till en basklass (getName, setName, getT, setT osv. Nästa sida för att
få det någotsånär läsligt…

public class GrundAttribut extends SnyggtBasKlassNamn

{

public GrundAttribut (String namn)

{

this.namn = namn;

}

public void reCountValue(){

if(this.getTMod() \> 3){

this.settMod(-4);

this.setT(1);

} else if (this.getTMod() \< 0){

this.settMod(4);

this.setT(-1);

}

}

public void changeT (int t){

this.t = t;

}

 

public void changeTMod (int tMod) {

this.tMod = tMod;

}

}
