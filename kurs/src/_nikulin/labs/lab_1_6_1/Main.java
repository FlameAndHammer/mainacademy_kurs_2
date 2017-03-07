package _nikulin.labs.lab_1_6_1;

public class Main {

    public static void main(String[] args) {
        int[] arrayInt = new int[15];

        for(int index = 0, value = 2; value <= 30; index++, value +=2){
            arrayInt[index] = value;
        }

        System.out.println("Array of even numbers:");
        for (int j=0; j<arrayInt.length; j++) {
            System.out.print(arrayInt[j] + " ");
        }
    }
}
