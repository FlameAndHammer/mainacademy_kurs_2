package _nikulin.serialization;

import java.io.Serializable;

public class MyClassFOrSer implements Serializable{

    private int x;
    private String str;

    public MyClassFOrSer(int x, String str) {
        this.x = x;
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "MyClassFOrSer{" +
                "x=" + x +
                ", str='" + str + '\'' +
                '}';
    }
}
