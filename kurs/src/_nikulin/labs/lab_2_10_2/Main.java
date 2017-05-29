package _nikulin.labs.lab_2_10_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(compute((byte) 34, 126));
        System.out.println(compute((byte) -34, 126));
        byte bb = 12;
        int ii = 22;
        System.out.println(compute(bb, ii));

    }

    public static Long compute(Byte valueByte, Integer valueInt) {
            // version 1
//        Long valueLong = Long.valueOf(valueByte + valueInt);
//        return valueLong;

            // version 2
//        long result = valueByte + valueInt;
//        return new Long(result);

            // version 3
        Long res = (long) (valueByte + valueInt);
        return res;
    }
}
