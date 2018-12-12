package at.ac.fh_kufstein.uebung_05.Classes;

public class Fahrzeug
{
    private short reifen;
    private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;

    public static int anzahl;


    //Konstruktor
    public Fahrzeug(short reifen, String farbe, short ps, short tueren)
    {
        this.reifen = reifen;
        this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = false;
        this.geschwindigkeit = geschwindigkeit;
        //Bei jeder Verwendung eines Konstruktors wird die Zahl um 1 erhöht
        this.anzahl+= 1;
    }

    public void starten()
    {
        this.gestartet = true;
    }

    public void stoppen()
    {
        this.gestartet = false;
    }

    public void beschleunigen(short geschwindigkeit)
    {
        //Hier prüfe ich ob der Motor an ist
        if (this.gestartet == true)
        {
            //Hier prüfe ich ob die addition unter 250 liegt falls ja dann ins if
            if (this.geschwindigkeit + geschwindigkeit <= 250)
            {
                //Dann erhöhe ich meinen Wert bzw. beschleunige
                this.geschwindigkeit += geschwindigkeit;
            }
            //Wir setzen das maximum der Geschwindigkeit auf 250
            else
            {
                this.geschwindigkeit = 250;
            }
        }
    }



    public void bremsen(short geschwindigkeit)
    {
        //Prüfen ob Auto gestartet ist
        if (this.gestartet == true)
        {
            //Wenn die Geschwindigkeit größer 0 ist dann gehe ich ins if
            if (this.geschwindigkeit - geschwindigkeit >=0)
            {
                //Hier bremse ich
                this.geschwindigkeit -=geschwindigkeit;
            }

            //Ansonsten setze ich meine Geschwindigkeit auf 0 da ich schon stehe
            else
            {
                this.geschwindigkeit = 0;
            }
        }

    }

    public short getReifen()
    {
        return reifen;
    }

    public void setReifen(short reifen)
    {
        this.reifen = reifen;
    }

    public String getFarbe()
    {
        return farbe;
    }

    public void setFarbe(String farbe)
    {
        this.farbe = farbe;
    }

    public short getPs()
    {
        return ps;
    }

    public void setPs(short ps)
    {
        this.ps = ps;
    }

    public short getTueren()
    {
        return tueren;
    }

    public void setTueren(short tueren)
    {
        this.tueren = tueren;
    }

    public boolean isGestartet()
    {
        return gestartet;
    }

    public void setGestartet(boolean gestartet)
    {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit()
    {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit)
    {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl()
    {
        return anzahl;
    }

    public static void setAnzahl(int anzahl)
    {
        Fahrzeug.anzahl = anzahl;
    }
}
