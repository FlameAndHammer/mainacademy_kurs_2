package olena.labs.l_1_4;
/**
 * Created by elenafostachuk on 2/28/17.
 */
public class LabFourThree {
    public static void main (String[] arg){
    boolean a = true; boolean b = false;
        System.out.println(a | b);
    boolean cows_fly = false; boolean pigs_fly =false;
        System.out.println(cows_fly &  pigs_fly);
    boolean birds_fly = true; boolean birds_walk = true;
        System.out.println(birds_fly || birds_walk);
    boolean people_walk =true; boolean cats_walk = true;
        System.out.println(people_walk && cats_walk);
    boolean me_smart = true; boolean me_stupid =false;
        System.out.println(me_smart ^ me_stupid);
    }
}
