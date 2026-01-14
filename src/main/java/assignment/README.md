# Oppgavesett 04

---

## Info

> For å jobbe med oppgavene, skal du plassere koden din i denne `assignment`-mappen. For å teste koden din, finner du testoppsett
i mappen `test/java/assignment/TestAssignment.java`. Der kan du velge å kjøre alle tester samtidig eller kjøre dem en og en.
>
> 
> Lykke til!

---

## Oppgave #1

Lag en ny klasse som heter _Program_

- Denne klassen skal kun ha én metode:
    _runProgram()_ med returtypen _void_
- Metoden skal printe ut «Programmet starter ...» til terminalen

---

## Oppgave #2

Lag en ny kompaktklasse som heter _Computer_
- Denne klassen skal kun ha én statisk main-metode:
- Her skal følgende skje:
- Et objekt av typen _Program_ opprettes
- Via objektet som ble opprettet, kall på _runProgram()_-metoden

---

## Oppgave #3

Lag en ny klasse som heter _Terminal_ med tilhørende konstruktør som initialiserer
  feltet spesifisert i del-oppgaven nedenfor.

### Oppgave #3.1

Denne klassen skal ha følgende felt:
- _ArrayList < String > options_

### Oppgave #3.2

Denne klassen skal ha følgende metoder:
- _public void addOption(String value)_
- Legg til verdien i ArrayList-en

### Oppgave #3.3

- _public void clearOptions()_
- Fjerner alle verdier fra ArrayList-en.

### Oppgave #3.4

- denne klassen skal ha getter og setter metodene:
- _public ArrayList < String >  getOptions()_ 
- _public void setOptions(ArrayList < String > options)_

---

## Oppgave #4
Lag en ny klasse som heter _Word_
- Konstruktøren til denne klasse skal ta imot en String-verdi som er hva ordet faktisk
  er, og lagres i _data_-feltet spesifisert i del-oppgaven under

### Oppgave #4.1

Denne klassen skal ha følgende _private_-felter:
- _String data_ som inneholder verdien for det faktisk ordet.
- _ArrayList < String > synonyms_ som inneholder liste med synonymer tilknyttet ordet.

### Oppgave #4.2
Denne klassen skal ha følgende _public_-metoder:
-  _String getWord()_
- _ArrayList < String > getSynonyms()_
- _void addSynonym(String word)_
---

## Oppgave #5
Endre _runProgram()_-metoden i Program-klassen slik at denne metoden gjør
følgende:
- Oppretter en variabel av type _ArrayList < Word >_ som heter «words»
- Legg til flere objekter av type Word inn i denne ArrayList-en.
Her må du lage dine egne instanser, som vil si at du må lage flere objekter av
type _Word_-klassen ved hjelp av _new_-nøkkelordet.

- Lag en loop som går igjennom alle _Word_-objektene i ArrayList-en som
inneholder _Word_-objekter, og print ut følgende:
   -  Ordet 
   - Tilhørende synonymer 
     - Denne kan være litt knotete å få til, da en fort kan ende opp
med en loop inne i en loop
     - Bruk gjerne følgende kodesnutt for å gå igjennom hvert ord
lagret i listen:
     - ```
       for (Word word : words) {
       // variabelen «word» vil være hvert enkelt ord
       }
       ```
---

### Ekstra-Oppgave #1
- Istedenfor en _ArrayList < String >_ for å holde styr på alle synonymer tilknyttet et ord,
  gjør denne om til å være følgende istedenfor:
  - _ArrayList < Word >_
    - Gjør nødvendige endringer andre steder i koden din slik at _alt_ som har med
    synonymer å gjøre, istedenfor at datatypen _String_ brukes, så skal _Word_ brukes.
    Tilpass _runProgram()_-metoden i _Program_-klassen slik at synonymer opprettes og
    legges til ordene disse er synonymer for.
---


## Informasjon

Bruk følgende link:
https://www.w3schools.com/java/java_arraylist.asp
for å utforske mer av ArrayList

Disse oppgavene krever gjerne litt kartlegging av hva som er mulig med _ArrayList_, hvor det
kan være greit å stille seg selv spørsmålene:
- Hvordan legge noe til i listen?
- Hvordan fjerne én spesifik verdi fra listen?
- Hvordan fjerne alt fra listen?
- Og så videre ...

Bruk kodeeksempler og forsøk deg litt fram. Bruk terminalen for å gi deg selv
  tilbakemeldinger underveis (f.eks. ved å printe ut linjer du bestemmer selv ut til terminalen),
  slik at du forstår mer av hva du forsøker å gjøre underveis.