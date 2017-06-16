package yuriy.labs.labs_2.labs_2_10_.l_2_12.l_2_12_1.TestNested1;

/**
 * Created by Ruble on 13.06.2017.
 */
public class MyPhoneBook
{
    PhoneNumber [] phoneNumbers = new PhoneNumber [10];
    //PhoneNumber [] phoneNumbers = new PhoneNumber {};


    public PhoneNumber addPhoneNumber(String name, String phone)
    {
        PhoneNumber phoneNumber = new PhoneNumber(name, phone);
        phoneNumber.setName(name);
        phoneNumber.setPhone(phone);
        return phoneNumber;
    }
    public void printPhoneBook() //PhoneNumber [] phoneNumbers
    {
       /* for (PhoneNumber element : phoneNumbers)
            element.toString();*/
            for (int i = 0; i < phoneNumbers.length; i++)
            {
                System.out.println(phoneNumbers[i].toString());
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
            String str = "0";
            for (int i = 0; i < strLength; i++)
            {
                randomPhone = randomPhone + str;
            }
        }
        return randomPhone;
    }

    static class PhoneNumber
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
