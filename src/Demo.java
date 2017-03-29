/**
 * Created by Тим on 15.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Printer<ColorCartridge> printer1 = new Printer("1", new ColorCartridge());
        printer1.turnOn();
        printer1.loadPaper(2);
        printer1.print("fsdasd", 2);


    }//test inheritance
}
