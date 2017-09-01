package _nikulin.reflection;

import java.lang.reflect.Field;

public class Main {
  public static void main(String[] args) {

    Class<ReflectionTest> rClass = ReflectionTest.class;
    ReflectionTest rTest = new ReflectionTest(123, "asdf",
            new Double(9643.345));


    Field[] fields = rClass.getDeclaredFields();

    try {
      Field f = rClass.getDeclaredField("d");
      f.setAccessible(true);
      f.set(rTest, Double.valueOf(598.9));
    } catch (NoSuchFieldException | IllegalAccessException e) {
      e.printStackTrace();
    }

    for (Field field : fields){
      try {
        field.setAccessible(true);
        System.out.printf("%s %s %s\n",
                field.getType().getSimpleName(),
                field.getName(),
                field.get(rTest));
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }



  }


}
