package dana.labs.l_2_1;

/**
 * Created by Dana on 30.03.2017.
 */
public class main21 {
    public static void main(String[] args) {
        Computer comp = new Computer();

        Computer[] arrComp = new Computer[5];
        int i;
        float x = 50.6F;

        for (i = 0; i < arrComp.length; i++) {
            arrComp[i] = new Computer();  //по 5 индексам будут созданы 5 компов
            arrComp[i].setManufacturer("compFirmIs" + i);
                    }
        //_________________________________________________
        for (i = 0; i < arrComp.length; i++) {
            arrComp[i].setPrice(x + x * 10 / 100);
            x = x + 1.0F;
        }
        for (Computer elem : arrComp) {
            System.out.println("the price is" + elem.getPrice());
        }
        //___________________________________________________

        for (i = 0; i < arrComp.length; i++) {
            double q = Math.random() * 100;
            int q1 = (int) q;

            arrComp[i].setQuantityCPU(q1);
            arrComp[i].setFrequencyCPU(10+i);
            arrComp[i].setSerialNumber(10000+i);
        }
            for (Computer elem : arrComp) {
                elem.view();
                    }
    }
}
