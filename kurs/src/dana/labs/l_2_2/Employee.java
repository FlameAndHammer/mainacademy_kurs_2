package dana.labs.l_2_2;

/**
 * Created by Dana on 02.04.2017.
 */
public class Employee {

private double totalS;

    public double calcSalary(String str1, double... salary){

        for ( double elem: salary){
            totalS+=elem;
        }
        return totalS;
        //синтаксис Varargs это: тип, троеточие. назв-е массива; потом = созд-е переменной, пребирающей значения и ее return
    }

    public double getTotalS() {
        return totalS;
    }
}

