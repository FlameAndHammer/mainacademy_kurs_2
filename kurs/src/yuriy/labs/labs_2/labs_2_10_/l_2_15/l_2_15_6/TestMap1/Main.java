package yuriy.labs.labs_2.labs_2_10_.l_2_15.l_2_15_6.TestMap1;

import java.util.Scanner;

/**
 * Created by Ruble on 20.06.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("create","создать");
        myTranslator.addNewWord("new","новый");
        myTranslator.addNewWord("project","проект");
        myTranslator.addNewWord("add","добавить");
        myTranslator.addNewWord("method","метод");
        myTranslator.addNewWord("code","код");
        myTranslator.addNewWord("read","читать");
        myTranslator.addNewWord("string","строка");
        myTranslator.addNewWord("console","консоль");
        myTranslator.addNewWord("special","специальный");
        myTranslator.addNewWord("report","отчет");
        myTranslator.addNewWord("execute","выполнение");
        myTranslator.addNewWord("program","программа");
        myTranslator.addNewWord("number","число");
        myTranslator.addNewWord("print","печать");
        myTranslator.addNewWord("current","текущий");
        myTranslator.addNewWord("element","элемент");
        myTranslator.addNewWord("value","значение");

        //System.out.println(myTranslator.toString());





        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some string in English:");
        String translateString = sc.nextLine();
        String[] words = translateString.split(" "); //[:,]
        for (int i = 0; i < words.length; i++)
        {
            System.out.print(myTranslator.translate(words[i]) + " ");

        }
        System.out.println();


    }

    //"create","new"

    /*




            "code","код"
            "read","читать"
            "string","строка"
            "console","консоль"
            "special","специальный"
            "report","отчет"
            "execute","выполнение"
            "program","программа"
            "number","число"
            "print","печать"
            "current","текущий"
            "element","элемент"
            "value","значение"*/



}
