Phase2_wba2 Ideenfindung
-----

Verteiltes Quiz Über einen Client werden die Fragen bei allen Teilnehmer gleichzeitig angegeben, diese werden duch Publish Subscribe verteilt. Anmeldung zum Quiz sowie die Beantwortung der Fragen erfolgen durch REST.
Die Frage sind vorgefertigt auf einem Server.Nutzer können selbst ein Quiz erstellen und hochladen.
Die Punkteverteilung ist nach Antworgeschwindigkeit gestaffelt.
Nutzer können selbst Fragen(samt Antworten), in den Fragenpool stellen, nachdem sie von einem moderator überprüft wurden. Veto Recht, wenn niemand eine Antwort weiß, wird die Frage aus dem aktuellen Quiz genommen und ggf. der Schwierigkeitsgrad der Frage bearbeitet.

Joker werden mit gesammelten Punkten bezahlt Joker: (50/50, Hint, richtige Lösung) lokale, Quizbezogene Punkte werden in globale Punkte umgerechnet. Im "Warteraum" haben die wartenden User die Möglichkeit zu chatten. Nutzer können andere Nutzer zu einem Quiz einladen.

Informationen die übertragen werden müssen:

   - Informationen über Nutzer: Bentzernamen, Mitglied seit, beantwortete Fragen, letztes gespieltes Quiz
   
   - Informationsänderung bei Fragen: Zeit, Antworten der Mitspieler, gewonnene Punkte, benutzte Joker

Kommunikation zwischen Client und Server:
LogIn:

-   >Benutzername + Passwort
    
    <Liste der Quizze(samt Informationen zum jeweiligen Quiz) 
    Benutzerinformationen(Benutzernamen, Profilbild, Punkte, Mitgleid seit, zuletzt gespieltes Quiz)

-   Informationen zum Quiz: Name, Beschreibung,Anzahl evtl wartende Teilnehmer, Schwierigkeitsgrad, Bewertung, Themengebiet, ggf Autor, Anzahl der Fragen

-   Quizbeitritt:
-   <wartende Teilnehmer(Basisinfo, Benutzername, Profilbild, Punkte), Chat,
    
    >Chatnachrichten

-   Quizanfang:
-   <Frage + Antwortmöglichkeiten(richtige Antwort),Joker, Medien zu Frage (Bild, Ton)
    
    >gewähle Antwort(ob richtig oder Falsch), Zeit, evtl benutzte Joker
    
    <boolean info, ob Mitspieler geantwortet haben

-   Quizende:
-   <Rangliste nach gewonnenen Punkten


Quzstaffelung nach Schwierigkeit, 
Ein Quiz besteht aus 20 Fragen die aus einem Fragenpool gewählt werden, 
deren Antwortmöglichkeiten eventuell wieder aus einem Antwortpool gewählt werden.

Ressourcen: Quizliste bestehend aus Quizzen bestehend aus Bewertung und Fragen bestehend aus Antworten Benutzerliste bestehend aus Benutzern

