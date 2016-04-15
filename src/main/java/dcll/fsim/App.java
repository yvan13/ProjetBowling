package dcll.fsim;

import dcll.fsim.Partie;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Lancer> lancers = new ArrayList<Lancer>();

        for(int i=0;i<11;i++)
        {
            lancers.add(new Lancer(10,0));
        }
        lancers.add(new Lancer(9,1));
        Partie p1 = new Partie(lancers);
        System.out.println(p1);
        System.out.println(p1.calculerScore());
        System.out.println("BON ON TEST");
        System.out.println("exigence 1 résolue");

    }
}
