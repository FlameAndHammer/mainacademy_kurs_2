package _nikulin.labs.lab_1_5_4;

public class Main {
    public static void main(String[] args) {
        int countResult = 0;
        for(int i=1; i<300; i++) {
            if(i % 3 == 0 || i % 4 == 0) {
                countResult++;
                System.out.println(countResult + " divisible by 3 or 4 -> " + i);
            }
            if(countResult >= 10) {
                break;
            }
        }
    }
}
