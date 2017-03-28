import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by Тим on 15.03.2017.
 */
public class Printer extends Machine implements IMachine {
   // private boolean isOn;
    private String modelNumber;
    public IMachine iMachine;
    PaperTray paperTray = new PaperTray();

    @Override
    public String toString() {
        return "Printer{" +
                /*"isOn=" + isOn +*/
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }

   /* public boolean isOn() {
        return isOn;
    }*/

    @Override
    public void turnOn() {
        System.out.println("Warming up printer");
        super.turnOn();
    }

    private String getModelNumber() {
        return modelNumber;
    }

    public Printer(String modelNumber) {
        super(true);
        this.modelNumber = modelNumber;
    }

    /*public void print() {
        if (isOn) {
            System.out.println("Принтер №" + getModelNumber() + "включен");
        } else {
            System.out.println("Принтер №" + getModelNumber() + "выключен!");

        }
    }*/

    public void print(String string) {
        System.out.println(string);
    }

    public void print(String text, int copies) {
        if (checkIsOn()) {
            while (copies > 0 && !paperTray.isEmpty()){
                System.out.println(text);
                paperTray.usePage();
            }
            if(paperTray.isEmpty()){
                System.out.println("There is no paper");
            }
            /*for (int i = 0; i < copies; i++) {
                System.out.println(text);
            }*/
        } else {
            System.out.println("Принтер №" + getModelNumber() + " " + "выключен!");
        }
    }

    public void loadPaper(int count){
        paperTray.addPaper(count);
    }

    public void printColors() {
        for (Color x : Color.values()) {
            System.out.println(x.colorasString + " " + Integer.toHexString(x.code));
        }

    }

}
