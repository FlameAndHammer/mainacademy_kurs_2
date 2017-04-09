package dana.labs.l_2_3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by abcd on 008 08.04.17.
 */
public class myWindow {
    private double width;
    private double height;// МОЖНО ИНИЦИААЛИЗИРОВАТЬ ВМЕСТЕ
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public void printFields(){
        System.out.println("myWindow parametres are"+width+height+numberOfGlass+color+isOpen);
    }
}
