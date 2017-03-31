package _nikulin.additional_homework;

/**
 * Created by nikulin on 3/31/2017.
 */
class Employee2 {
    Salary main;
    Salary additional;
    Employee2(Salary  i, Salary add)  {
        this(i);
        additional = add;
        System.out.println("Good day employee!");
    }
    Employee2(Salary  i){
        main = i;
        System.out.println("Main salary!");
    }
    public void showTotal(){
        int total=0;
        total = main.getSum();
        if(additional != null) {
            total += additional.getSum();
        }
        System.out.println(total);
    }

}
public class Salary {
    private int sum;
    public Salary(int sum){
        this.sum = sum;
    }
    public int getSum(){
        return sum;
    }
  public static void main(String[] args) {
    Employee2 empl = new Employee2(new Salary(100), new Salary(300));
      empl.showTotal();

    Employee2 e1 = new Employee2(new Salary(200));
      e1.showTotal();
  }

}
