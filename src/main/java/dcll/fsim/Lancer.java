package dcll.fsim;

/**
 * Created by 21506032 on 07/03/2016.
 */
public class Lancer {
 // coucou florine
    private int val1,val2;

    public Lancer(int lancer1, int lancer2){
        this.val1 = lancer1;
        this.val2 = lancer2;
    }

    public Lancer(){
        val1 = (int) (Math.random()*(11));
        val2 = (int) (Math.random()*(10-val1));
    }

    public String toString(){
        String chaine = "";
        switch (val1){
            case 0 : chaine+= "_";
                break;
            case 10 : chaine += "X";
                break;
            default : chaine += val1;
        }
        chaine += " ";

        if(val2 == 0 ){
            if(this.isSTrike())
                chaine +="";
            else
                chaine += "_";
        }
        else {
            if (val1 + val2 == 10)
                chaine += "/";
            else
                chaine += val2;
        }
        return chaine;
    }
    public boolean isSTrike(){
        return(val1==10);
    }
    public boolean isSpare(){
        return(val1+val2==10);
    }

    public int getVal1(){
        return val1;
    }

    public int getVal2(){
        return val2;
    }

    public int getSomme(){
        return val1+val2;
    }
}
