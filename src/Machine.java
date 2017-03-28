/**
 * Created by MUtemov on 22.03.2017.
 */
public class Machine implements IMachine {
    private boolean isOn;
    public void turnOn(){isOn = true;}
    public void turnOff(){isOn = false;}
    public boolean checkIsOn(){
        return isOn;
    }

    public Machine(boolean isOn) {
        this.isOn = isOn;
    }
}
