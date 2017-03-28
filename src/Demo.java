/**
 * Created by Тим on 15.03.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Printer printer1 = new Printer("1");
        //printer1.turnOn();
        //commit
        /*printer1.print("welcome to the machine",1);
        printer1.turnOff();
        printer1.print("welcome to the machine",1);
        printer1.printColors();*/
        //commit
        /*printer1.loadPaper(2);
        printer1.print("Is printing",2);*/
        //commit
        Machine machine = new Machine(false);
        machine.turnOn();
        machine.turnOff();
        /*IMachine printer = new Printer("Machine - printer");
        printer.turnOn();
        printer.turnOff();*/
        printer1.turnOn();
        printer1.loadPaper(2);
        printer1.print("Copy",2);
        printer1.turnOff();


    }//test inheritance
}
