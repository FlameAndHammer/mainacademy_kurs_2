package _nikulin.serialization;

import java.io.*;

public class MyClassFOrSer extends ParentNoSer implements Externalizable{

    private int x;
    private String str;
    private transient String unnecessaryStr;

    public MyClassFOrSer() {
    }

    public MyClassFOrSer(int x, String str, String unnecessaryStr) {
        this.x = x;
        this.str = str;
        this.unnecessaryStr = unnecessaryStr;
    }

    @Override
    public String toString() {
        return "MyClassFOrSer{" +
                "x=" + x +
                ", str='" + str + '\'' +
                ", unnecessaryStr='" + unnecessaryStr + '\'' +
                "} and from parent : " + getParentstr();
    }

    @Override
    public void writeExternal(ObjectOutput stream) throws IOException {
        stream.writeUTF(str);
        stream.writeInt(x);
        stream.writeUTF(unnecessaryStr);
        stream.writeUTF(getParentstr());
    }

    @Override
    public void readExternal(ObjectInput stream) throws IOException, ClassNotFoundException {
        x = stream.readInt();
        unnecessaryStr = stream.readUTF();
        str = stream.readUTF();
        setParentstr(stream.readUTF());
    }
}
