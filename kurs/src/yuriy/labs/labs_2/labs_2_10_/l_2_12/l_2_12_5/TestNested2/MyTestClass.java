package yuriy.labs.labs_2.labs_2_10_.l_2_12.l_2_12_5.TestNested2;

/**
 * Created by Ruble on 15.06.2017.
 */
public class MyTestClass {


    static class MyStaticNested
    {
        String myStaticNestedString = "MyStaticNested";
    }

    class MyInner
    {
        String myInnerString = "MyInner";
    }

    void myLocal()
    {
       // MyLocal myLocal = new MyLocal;
        class MyLocal{
            @Override
            public String toString() {
                return "MyLocal";
            }

           /* public  void myLocalMethod(String[] args){
                String myLocalString = "MyLocal";


            }
*/
        }

    };
    public void test()
    {
        System.out.println("test");
    }
}
