Project Eon NPC maker
=====================

**Abstrakt**

Det här är ett post mortem gällande ett tio veckor långt projekt utvecklat i en
”scrum” lik process.  
Projektet utfördes i slutet av första året av studier i Utveckling och drift av
mjukvarusystem på Linnéuniversitetet.  
Ansvarig utvecklare hade innan detta första år ingen tidigare erfarenhet av
utveckling inom någon av språken eller teknikerna som är inblandade.  
Utöver grundläggande kunskaper i programspråket Java och JavaFX så är
ovanstående uttalande även sant när det gäller projektets tidpunkt vilket
resulterade i ett gigantiskt projekt.

Det här dokumentet kommer att behandla utförandet av projektet, resultatet som
det ser ut idag samt reflektioner av sagda projekt med alla dess positiva och
negativa delar.

**Inledning och Bakgrund**

*Syfte*

Projektet benämndes lite komiskt av kursansvariga lektorer som ”Antingen det
värsta eller det bästa projektet i hela er utbildning”. Detta visade sig vara
sant i båda benämningarna.

Meningen med projektet var att ta den kunskap vi hade anskaffat oss under året
och utveckla den för att skapa en programvara/webbsida/applikation efter eget
tycke, med eller utan extern inblandning.

De tekniker som under året hade avhandlats som utnyttjades under projektet var:

-   Java 13 – Programmeringsspråk

-   JavaFX 14– bibliotek till Java för Grafiska gränssnitt

De tekniker som under projektets gång behövde inhämtande av kunskap:

-   Databasteknik – specifikt MS Access och Ucanaccess biblioteket till Java

-   PDFBox – bibliotek för att skicka värden till ett PDF formulär

-   FXML och Scenebuilder – Ett framework och bibliotek för att skapa ett GUI i
    JavaFX

-   Deployment – Att skapa en körbar fil för Windows och Mac

**Mål**

Målsättningen med projektet var att skapa applikationen, i detta fall en
karaktärsskapare till rollspelet EON, skapat av Helmgast, på ett så
professionellt sätt som möjligt och gå igenom samtliga faser av utveckling som
vi tidigare under året gått igenom på ett mer eller mindre textboksmässigt sätt.

Projektet skulle planeras, utvecklas, testas och driftsättas på ett bra och
iterativt sätt.

**Vision**

Visionen med projektet var att skapa ett hjälpmedel för spelledare till
rollspelet EON. Eftersom utvecklaren i avseendet har erfarenhet av både spelande
och spelledande av det här spelet och idkat stora mängder timmar på att skapa
just karaktärer som spelarna på något sätt skulle interagera med så ansågs
behovet i avseendet vara stort.

Ett liknande projekt skapades av Helmgast, en karaktärsgenerator, men det
färdigställdes aldrig riktigt. Dessutom saknades konceptet att faktiskt få en
utskrivbar pdf fil.

**Arbetssätt**  
  
Som nämnt innan så användes ett iterativt arbetssätt och planläggning gjordes i
”scrum” form med visionen och ”user stories”.

Då sprint planning och reviews inte går att genomföra ensam i så stor
utsträckning så utfördes det här arbetet i en grupp med 3 andra elever som alla
utförde sina egna projekt.  
  
Varje vecka fick man gå igenom gångna veckans arbete samt redogöra för vad som
hände veckan som följde.

**Genomförande och tekniker**

Utöver tidigare nämnda tekniker så specificerar jag nedan ytterligare lite
information:

-   IntelliJ – IDE för Java

-   Open JDK 13 – Java JDK/SDK

-   Maven – Framework för att driftsätta ett program till JAR fil

-   CMD och Jpackage – för deployment till .dmg och .exe

**Positiva reflektioner**

Det här projektet var oerhört givande och roligt att genomföra. Att faktiskt få
göra någonting som man själv kommer på, planerar, letar sätt att utföra,
utvecklar, testar och slutligen driftsätter var en nyttig erfarenhet.

Att dessutom skapa något som man känner att man själv behöver gjorde mervärdet
och drivkraften än större, vilket också stundtals behövdes när det kändes som om
man knappt lyckades med något.

En av de största fördelarna med det här projektet var att jag fick erfara
arbetssättet som man läst om mer praktiskt. Man såg vilka tekniker som var
relevanta att använda för projektet och hur pass ingående man behövde göra vissa
saker rent presentationsmässigt.

Det kommer förstås förändras helt när man senare kommer att arbete tillsammans
med andra med samma produkt, men i nuläget så var det oerhört smidigt.

Slutligen så stiger man många erfarenheter, och en mängd tekniker rikare ur den
här processen. Skapandet av den här applikation har påtvingat en riktigt gedigen
inlärningsprocess för att lösa många av de problemen som uppdagades.

**Negativa reflektioner**

Vart ska man börja?

Det här arbetet ställdes inför en hel del negativ inverkan.  
Till att börja med så kan vi ju nämna pandemin som nog vid något tillfälle
hamnat på alla våra läppar.  
För mig personligen innebar det två faktorer, dels sjukdom(inte bekräftat att
det var just Covid-19, men sjuka blev vi) samt att vi på grund av riskfaktorer
hos personer i vår närhet var tvungna att hålla vårt barn hemma. Detta skapade
en hel del påfrestningar för arbetsro och ren effektivitet.

Utöver detta ställdes jag när det var dags för driftsättning för betaversion
inför problemet att Java inte längre 100% stödjer JavaFX och att Jar för just
dessa applikationer inte längre är körbara på konventionellt sätt. Det hela
ledde till en häxjakt efter sätt att driftsätta den här applikationen och
landade slutligen i att faktiskt skapa en .exe installer via Maven + Jpackage.

Utöver detta så gav jag mig själv som mål ganska tidigt att både driftsätta i
Mac och Windows(min hemmaplattform) vilket ledde till ytterligare ett set
problem då de två operativsystemen inte använder samma fil/foldersystem.

**Summering**

Det här projektet har varit, som nämnt tidigare, väldigt givande både personligt
och studiemässigt och jag ångrar inte att jag valde just den här kursen.  
Jag går starkare ur den här processen än jag kom in och känner mig efter det här
ganska väl rustad för de kommande två åren av utbildningen.
