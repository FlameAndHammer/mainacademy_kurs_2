package slavik.labs.l_1_5;
import java.util.Scanner;
public class Lab152 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner chislo = new Scanner(System.in);
        int x = chislo.nextInt();
        if (x==1) System.out.println("- One");
        else if (x==2) System.out.println("- Two");
        else if (x==3) System.out.println("- Three");
        else if (x==4) System.out.println("- Four");
        else if (x==5) System.out.println("- Five");
        else if (x==6) System.out.println("- Six");
        else if (x==7) System.out.println("- Seven");
        else if (x==8) System.out.println("- Eight");
        else if (x==9) System.out.println("- Nine");
        else System.out.println("- Other");
        switch (x) {
            case 1: System.out.println("- One");
                break;
            case 2: System.out.println("- Two");
                break;
            case 3: System.out.println("- Three");
                break;
            case 4: System.out.println("- Four");
                break;
            case 5: System.out.println("- Five");
                break;
            case 6: System.out.println("- Six");
                break;
            case 7: System.out.println("- Seven");
                break;
            case 8: System.out.println("- Eight");
                break;
            case 9: System.out.println("- Nine");
                break;
            default: System.out.println("- Other");
                break;
        }
    }
}
