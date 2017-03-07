package maksim.labs.l_1_4;

/**
 * Created by Пк on 05.03.2017.
 */
public class Lab1_4_5 {
    public static void main(String[] args) {
        int a = 0b10111001010;
        System.out.println("decimal \"a\": " + a + ", binary \"a\": " +(Integer.toString(a, 2)));
        System.out.println("decimal \"a >> 4\": " + (a >> 4) + ", binary \"a >> 4\": " + (Integer.toString(a >> 4, 2)));
        System.out.println("decimal \"a << 2\": " + (a << 2) + ", binary \"a << 2\": " + (Integer.toString(a << 2, 2)) );
        System.out.println("decimal \"-a >>> 7\": " + (-a >>> 7) + ", binary \"-a >>> 7\": " + (Integer.toString(-a >>> 7, 2)) );
    }
}
