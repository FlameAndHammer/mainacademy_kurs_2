package _nikulin.additional_homework.collections.task2;

import java.util.Date;

/**
 * @author ANikulin
 */
public class Product {
    public String name; // can't be changed
    public Date expirationDate;

    public Product(int i, Date date) {
        this.name = Integer.toString(i);
        this.expirationDate = date;
    }




}
