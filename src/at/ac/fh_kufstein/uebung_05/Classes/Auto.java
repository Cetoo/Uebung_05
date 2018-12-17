package at.ac.fh_kufstein.uebung_05.Classes;

public class Auto extends Fahrzeug
{
    private boolean klimaanlage;
    private short airbags;

    public void klimaanlageAn()
    {
        if(this.klimaanlage==true)
        {
            System.out.println("Klimaanlage ist bereits an");

        }
        else
        {
            this.klimaanlage=true;
        }

    }

    public void klimaanlageAus()
    {
        if(this.klimaanlage==false)
        {
            System.out.println("Die Klimaanlage ist bereits aus");
        }
        else
        {
            this.klimaanlage=false;
        }

    }


    //Konstruktor
    public Auto(short reifen, String farbe, short ps, short tueren, short airbags)
    {
        super(reifen, farbe, ps, tueren, (short) 0);
        this.klimaanlage = false;
        this.airbags = airbags;
    }

    //Getter und Setter
    public boolean isKlimaanlage()
    {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage)
    {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags()
    {
        return airbags;
    }

    public void setAirbags(short airbags)
    {
        this.airbags = airbags;
    }


//Aufgabe 6 Überschreiben einer Methode

    @Override
    public String toString()
    {
        return "Mein Auto hat " + this.getPs() + " PS und fährt mit " + this.getGeschwindigkeit() + " km/h";
    }
}
