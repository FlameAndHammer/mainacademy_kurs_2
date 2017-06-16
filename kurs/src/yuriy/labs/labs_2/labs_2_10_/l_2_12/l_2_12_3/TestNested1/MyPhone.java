package yuriy.labs.labs_2.labs_2_10_.l_2_12.l_2_12_3.TestNested1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Ruble on 14.06.2017.
 */
public class MyPhone {
    MyPhoneBook myPhoneBook = new MyPhoneBook();

    public MyPhone() {
    }

    public void swichOn()
    {
        System.out.println("Loading PhoneBook records...........");
        System.out.println();

        for (int i = 0; i < 10; i++)
        {
            myPhoneBook.phoneNumbers[i] = myPhoneBook.addPhoneNumber(myPhoneBook.addName(),myPhoneBook.addPhone());
        }

        myPhoneBook.printPhoneBook();
        System.out.println();
        System.out.println("OK!");
    }

    public void call (int i)
    {
        System.out.print("Calling to: Name: " + myPhoneBook.phoneNumbers[i-1].name +
                " , phone: " + myPhoneBook.phoneNumbers[i-1].phone);

    }

    public class MyPhoneBook
    {

        PhoneNumber [] phoneNumbers = new PhoneNumber [10];



        public PhoneNumber addPhoneNumber (String name, String phone)
        {
            PhoneNumber phoneNumber = new PhoneNumber(name, phone);
            phoneNumber.setName(name);
            phoneNumber.setPhone(phone);
            return phoneNumber;
        }
        public void printPhoneBook()
        {
       /* for (PhoneNumber element : phoneNumbers)
            element.toString();*/
            for (int i = 0; i < phoneNumbers.length; i++)
            {
                System.out.println(" " + (i+1) + ". "  + "\t" +  phoneNumbers[i].toString());
            }
        }

        public String addName ()
        {
            String[] names = {"Sasha", "Vova", "Alex", "Kirill", "Alina", "Elena", "Ovanes", "Inna", "Dana", "Arthur", "Max", "Vyacheslav", "Irina", "Natasha"};
            String randomName = names[(int)(Math.random() * 7)];
            return randomName;
        }


        public String addPhone ()
        {
            String[] codePhones = {"039", "050", "063", "066", "067", "068", "091", "092", "093", "094", "095", "096", "097", "098", "099"};
            String randomPhone = codePhones[(int)(Math.random() * 5)] + ((int)(Math.random() * 1500170));
            if (randomPhone.length() < 10)
            {
                int strLength = 10 - randomPhone.length();
                String str = "3";
                for (int i = 0; i < strLength; i++)
                {
                    randomPhone = randomPhone + str;
                }
            }
            return randomPhone;
        }

        public void sortByName()
        {
            Arrays.sort (phoneNumbers, new Comparator()
            {
                @Override
                public int compare(Object obj1, Object obj2) {
                    PhoneNumber phoneNumber1 = (PhoneNumber) obj1;
                    PhoneNumber phoneNumber2 = (PhoneNumber) obj2;
                    return phoneNumber1.getName().compareTo(phoneNumber2.getName());
                }

                @Override
                public boolean equals(Object obj) {
                    return false;
                }
            }); }


        public void sortByPhoneNumber()
        {
            Arrays.sort (phoneNumbers, new Comparator()
            {
                @Override
                public int compare(Object obj1, Object obj2) {
                    PhoneNumber phoneNumber1 = (PhoneNumber) obj1;
                    PhoneNumber phoneNumber2 = (PhoneNumber) obj2;
                    return phoneNumber1.getPhone().compareTo(phoneNumber2.getPhone());
                }

                @Override
                public boolean equals(Object obj) {
                    return false;
                }
            }); }







         class PhoneNumber   // static
        {

            String name;

            String phone;

            public PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "PhoneNumber{" +
                        "name='" + name + '\'' +
                        "," + "\t" + "phone='" + phone + '\'' +
                        '}';
            }
        }
    }



}
