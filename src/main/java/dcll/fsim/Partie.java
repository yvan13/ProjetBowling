package dcll.fsim;

/**
 * Created by m21508331 on 07/03/2016.
 */
public class Partie {
    Lancer lancers[] = new Lancer[12];
    int score;
    Partie(){
        for(int i=0;i<10;i++)
        {
            lancers[i]= new Lancer();
        }
        if(lancers[9].isSTrike())
        {
            lancers[10]= new Lancer();
            lancers[11]= new Lancer();
        }
        if(lancers[9].isSpare())
        {
            lancers[10]= new Lancer();
        }
        
        score=0;
    }

    public int calculerScore(){
        for(int i=0;i<9;i++)
        {
            if(lancers[i].isSTrike())
            {
                score += 10 + lancers[i+1].getSomme();
            }
            else {
                if (lancers[i].isSpare())
                    score += 10 + lancers[i + 1].getVal1();
                else{
                    score += lancers[i].getSomme();
                }
            }


        }
    }
}
