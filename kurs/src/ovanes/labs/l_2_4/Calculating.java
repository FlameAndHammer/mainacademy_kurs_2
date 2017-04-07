package ovanes.labs.l_2_4;

/**
 * Created by User on 07.04.2017.
 */
public class Calculating {
    public static void main(String[] args) {
        int [] arr_1 = {24,15,48,45,11,18,17,19};
        int [] arr_2 = {555,147,158,196,174,1,825, 156, 148};
        double rad = 8;
        MyMath mm = new MyMath();
        mm.findMin(arr_1);
        mm.findMax(arr_2);
        mm.areaOfCircle(rad);

    }
}
