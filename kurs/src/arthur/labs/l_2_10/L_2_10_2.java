package arthur.labs.l_2_10;

/**
 * Created by arthk on 31.05.2017.
 * Create new project called WrapperDemo2. Add package “com.brainacad.oop.testwrapper2”. Create class Main with method main().
 * Add to class Main static method compute() that uses as arguments two different numeric wrapper classes, adds the values of the two instances
 * together, and then creates a third numeric wrapper instance whose value is the sum and return it.
 * For example: static method compute(Byte, Integer) witch return Long type. In method main() write code to invoke compute()
 * and print result to console. Execute the program.
 */
public class L_2_10_2 {
    public static void main(String[] args) {
        System.out.println(compute1((byte) 4, 34));
        System.out.println(compute2((byte) 14, 44));
        System.out.println(compute3((byte) 24, 44));
    }

    public static Long compute1(Byte b, Integer i) {
        Long result = (long) (b + i);
        return result;
    }

    public static Integer compute2(Byte b, Integer i) {
       int result = b + i;
        return result;
    }

    public static Long compute3(Byte b, Integer i){
            Long result = Long.valueOf(b + i );
            return result;
    }

}

