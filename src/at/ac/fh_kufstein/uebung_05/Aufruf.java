package at.ac.fh_kufstein.uebung_05;

import at.ac.fh_kufstein.uebung_05.Classes.Auto;
import at.ac.fh_kufstein.uebung_05.Classes.Wasserfahrzeug;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Instanzen von Auto und Wasserfahrzeug erstellt
        Auto bmw = new Auto ((short) 4, "Silber",(short) 220, (short) 5, (short) 4);
        Auto audi = new Auto ((short) 4, "schwarz", (short) 180, (short) 5, (short) 8);
        Wasserfahrzeug titanic = new Wasserfahrzeug((short) 0, "blau", (short) 51000, (short)0, (short) 10.54, (short) 3, (double) 100000);


    }
}
