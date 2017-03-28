/**
 * Created by MUtemov on 22.03.2017.
 */
public class Machine implements IMachine {
    public boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("Machine is on!");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Machine is off!");
    }

    public boolean checkIsOn() {
        return isOn;
    }

    public Machine(boolean isOn) {
        this.isOn = isOn;
    }
}
