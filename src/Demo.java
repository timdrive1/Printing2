/**
 * Created by Тим on 15.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Printer printer1 = new Printer("1");
        //printer1.print("welcome to the machine",1);
        //printer1.turnOff();
        //printer1.print("welcome to the machine",1);
        //printer1.printColors();
        printer1.turnOn();
        printer1.loadPaper(2);
        printer1.print("Is printing",2);
    }//test inheritance
}
