package yuriy.labs.labs_2.labs_2_10_.l_2_12.l_2_12_5.TestNested2;

/**
 * Created by Ruble on 15.06.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        MyTestClass mTestClass = new MyTestClass();
        mTestClass.toString();
        mTestClass.test();
        mTestClass.myLocal();


        MyTestClass.MyInner myInnerObj = new MyTestClass().new MyInner();
        System.out.println(myInnerObj.myInnerString);

        MyTestClass.MyStaticNested myStaticNestedObj = new MyTestClass.MyStaticNested();
        System.out.println(myStaticNestedObj.myStaticNestedString);



    }
}
