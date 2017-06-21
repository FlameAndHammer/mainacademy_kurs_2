package yuriy.labs.labs_2.labs_2_10_.l_2_14.l_2_14_1.TestGenerics1;

/**
 * Created by Ruble on 20.06.2017.
 */
public class Main
{
    public static void main(String[] args) {
        MyTuple myTuple1 = new MyTuple( "fdbvd",15, 85768943);
        MyTuple myTuple2 = new MyTuple( 15.5,"dfghjkl", "egdrthfmjbk");

        System.out.println("--------------------------------------------------------------------");
        System.out.println(myTuple1.toString());

        System.out.println(myTuple2.toString());


    }
}
