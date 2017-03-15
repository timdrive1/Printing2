/**
 * Created by Тим on 15.03.2017.
 */
public class Printer {
    boolean isOn;
    String modelNumber;

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
        System.out.println(modelNumber+" "+isOn);
    }
    }
    public void print(String string){
        System.out.println(string);
    }
}
