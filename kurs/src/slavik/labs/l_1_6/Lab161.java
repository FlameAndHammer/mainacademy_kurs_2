package slavik.labs.l_1_6;
public class Lab161 {
    public static void main(String[] args) {
        int [] array = new int [15];
        for (int i = 1; i <=15; i++)
            array [i-1] = i*2;
        for (int j : array)
            System.out.println(j);
    }
}
