package arthur.additional;

/**
 * Created by Arthur on 13.03.2017.
 * Make a sort by digits
 */
public class Laba_Sort {
    public static void main(String[] args) {
        int []m = new int [20];
        for (int j=0; j<=19; j++)  m [j] = (int) (Math.random() * 2001 - 1000); // filling an array[-1000; +1000]
        int temp ;
        for (int k=1; k <=1000; k=k*10){ // k = digit decimal level
        int counter = 1; // bubble counter

            while (counter > 0) { // while there is at least 1 bubble
                counter = 0;
                for (int i = 0; i <= 18; i++) {
                    if ((m[i + 1] / k) % 10 < (m[i] / k) % 10) { // searching for a bubble inside each decimal level(k)
                        temp = m[i];
                        m[i] = m[i + 1]; // bubble mutual replacing
                        m[i + 1] = temp; // bubble mutual replacing
                        counter++; // if there is no any bubble , counter will remain 0
                    }
                }
            }
        }
        for ( int cell: m) System.out.print(" " + cell);
    }
}
