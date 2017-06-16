package yuriy.labs.labs_2.labs_2_10_.l_2_12.l_2_12_1.TestNested1;

/**
 * Created by Ruble on 13.06.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        MyPhoneBook myPhoneBook = new MyPhoneBook();

        for (int i = 0; i < 10; i++)
        {
            myPhoneBook.phoneNumbers[i] = myPhoneBook.addPhoneNumber(myPhoneBook.addName(),myPhoneBook.addPhone());
        }
        myPhoneBook.printPhoneBook();




    }

}
