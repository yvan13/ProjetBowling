package dcll.fsim;

import java.util.ArrayList;

/**
 * Created by m21508331 on 07/03/2016.
 */
public class Partie {
    ArrayList lancers;
    int score;


    Partie(){
        lancers = new ArrayList<Lancer>();

        for(int i=0;i<10;i++)
        {
            lancers.add(new Lancer());
        }
        if(((Lancer) lancers.get(9)).isSTrike())
        {
            lancers.add(new Lancer());
            lancers.add(new Lancer());
        }
        if(((Lancer) lancers.get(9)).isSpare())
        {
            lancers.add(new Lancer());
        }
        
        score=0;
    }

    public int calculerScore(){
        for(int i=0;i<lancers.size();i++)
        {
            if(((Lancer) lancers.get(i)).isSTrike())
            {
                score += 10 + ((Lancer) lancers.get(i+1)).getSomme();
            }
            else {
                if (((Lancer) lancers.get(i)).isSpare())
                    score += 10 + ((Lancer) lancers.get(i+1)).getVal1()
                else{
                    score += ((Lancer) lancers.get(9)).isSTrike().getSomme();
                }
            }


        }
    }
}
