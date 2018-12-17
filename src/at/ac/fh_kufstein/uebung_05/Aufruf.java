package at.ac.fh_kufstein.uebung_05;

import at.ac.fh_kufstein.uebung_05.Classes.Auto;
import at.ac.fh_kufstein.uebung_05.Classes.Fahrzeug;
import at.ac.fh_kufstein.uebung_05.Classes.Wasserfahrzeug;

import java.util.ArrayList;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Instanzen von Auto und Wasserfahrzeug erstellt
        Auto bmw = new Auto((short) 4, "Silber", (short) 220, (short) 5, (short) 4);
        Auto audi = new Auto((short) 4, "schwarz", (short) 180, (short) 5, (short) 8);
        Wasserfahrzeug titanic = new Wasserfahrzeug((short) 0, "blau", (short) 51000, (short) 0, (short) 10.54, (short) 3, (double) 100000);

        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(titanic);
        System.out.println("________________________________________________________________________");


        //Aufgabe 7

        List<Fahrzeug> a = new ArrayList<>();
        System.out.println("Aufgabe 7");

        a.add(bmw);
        a.add(audi);
        a.add(titanic);
        for (Fahrzeug item : a)
        {
            System.out.println(item);
        }
    }
}
