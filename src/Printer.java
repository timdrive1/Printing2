import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by Тим on 15.03.2017.
 */
public class Printer {
    private boolean isOn;
    private String modelNumber;

    @Override
    public String toString() {
        return "Printer{" +
                "isOn=" + isOn +
                ", modelNumber='" + modelNumber + '\'' +
                '}';
    }

    public boolean isOn() {
        return isOn;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public Printer(boolean isOn, String modelNumber) {

        this.isOn = isOn;
        this.modelNumber = modelNumber;
    }
    public void print(){
        if(isOn){
        System.out.println("Принтер №"+getModelNumber()+"включен");
    }
    else{
            System.out.println("Принтер №"+getModelNumber()+"выключен!");

        }
    }
    public void print(String string){
        System.out.println(string);
    }
    public  void print(String text, int copies){
        if(isOn){
            for (int i = 0; i < copies ; i++) {
                System.out.println(text);
            }
        }
        else{
            System.out.println("Принтер №"+getModelNumber()+"выключен!");

        }
    }
    public void printColors(){
       /* ArrayList<String> colors = new ArrayList<String>();
        String red = "Red";
        colors.add(red);
        String blue = "Blue";
        colors.add(blue);
        String green = "Green";
        colors.add(green);*/
        for (Color x: Color.values()) {
            System.out.println(x.colorasString + " " + Integer.toHexString(x.code));
        }

    }

}
