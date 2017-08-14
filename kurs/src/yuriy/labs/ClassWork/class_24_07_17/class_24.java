package yuriy.labs.ClassWork.class_24_07_17;

import java.io.Serializable;

/**
 * Created by Ruble on 24.07.2017.
 */
public class class_24 implements Serializable
{
    private int x;
    private String str;

    public class_24(int x, String str) {
        this.x = x;
        this.str = str;
    }

    @Override
    public String toString() {
        return "class_24{" +
                "x=" + x +
                ", str='" + str + '\'' +
                '}';
    }
}
