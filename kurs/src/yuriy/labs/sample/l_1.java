package yuriy.labs.sample;

/**
 * Created by Ruble on 31.03.2017.
 */
public class l_1 {
    public static void main(String[] args) {
        for (int i = 0; i<35; i++){
            String randColor = "";
            int rand = (int) (Math.random() * 23);
            switch (rand){
                case 0: {randColor = "red"; break;}
                case 1: {randColor = "orange"; break;}
                case 2: {randColor = "yellow"; break;}
                case 3: {randColor = "green"; break;}
                case 4: {randColor = "blue"; break;}
                case 5: {randColor = "purple"; break;}
                case 6: {randColor = "pink"; break;}
                case 7: {randColor = "black"; break;}
                case 8: {randColor = "gray"; break;}
                case 9: {randColor = "brown"; break;}
                case 10: {randColor = "maroon"; break;}
                case 11: {randColor = "white"; break;}
                case 12: {randColor = "amber"; break;}
                case 13: {randColor = "gold"; break;}
                case 14: {randColor = "bronze"; break;}
                case 15: {randColor = "emerald"; break;}
                case 16: {randColor = "aquamarine"; break;}
                case 17: {randColor = "azure"; break;}
                case 18: {randColor = "turquoise"; break;}
                case 19: {randColor = "light blue"; break;}
                case 20: {randColor = "ultramarine"; break;}
                case 21: {randColor = "light pink"; break;}
                case 22: {randColor = "scarlet"; break;}

            }
        System.out.print(rand + "\t");
            System.out.println(randColor);
        }
    }
}
