package inna.labs.l_1_4;

/**
 * Created by ИННА on 05.03.2017.
 */
public class Lesson44 {
    public static void main(String[] args) {
        int preIncr = 10;
        int x =++preIncr;
        int y = ++preIncr;
        System.out.println("preIncr = [" + (preIncr) + "]");
        System.out.println("preIncr (x) = [" + (x)  + "]");
        System.out.println("preIncr (y) = [" + (y)  + "]");
        int postIncr = 10;
        int v = postIncr++;
        int z = postIncr++;
        System.out.println("postIncr = [" + (postIncr) + "]");
        System.out.println("postIncr (v) = [" + (v)  + "]");
        System.out.println("postIncr (z) = [" + (z)  + "]");
        int preDecr = 10;
        int a = -- preDecr;
        int b = -- preDecr;
        System.out.println("preDecr = [" + (preDecr) + "]");
        System.out.println("preDecr (a) = [" + (a)  + "]");
        System.out.println("preDecr (b) = [" + (b)  + "]");
        int postDecr = 10;
        int c =  postDecr--;
        int d =  postDecr--;
        System.out.println("postDecr = [" + (postDecr) + "]");
        System.out.println("postDecr (a) = [" + (c)  + "]");
        System.out.println("postDecr (b) = [" + (d)  + "]");





    }


}
