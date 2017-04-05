package maksim.labs.l_2_4;

/**
 * Created by Пк on 05.04.2017.
 */
public class Calculating {
    public static void main(String[] args) {
        int[] arrA = {13,6,3,65,2,78,0,129};
        int[] arrB = {83,76,3,9,0,234,198,22,456,298,7,16};
        double rad = 17;
        MyMath mm = new MyMath();
        mm.findMin(arrA);
        mm.findMax(arrB);
        mm.areaOfCircle(rad);

    }
}
