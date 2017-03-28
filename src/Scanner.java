/**
 * Created by Maxim on 28.03.2017.
 */
public class Scanner implements IMachine {
    IMachine iMachine;
    @Override
    public void turnOn() {
        iMachine.turnOn();
        System.out.println("scanner");
    }

    @Override
    public void turnOff() {
        iMachine.turnOff();
        System.out.println("scanner");
    }

    @Override
    public boolean checkIsOn() {
        if(iMachine.checkIsOn()){
            return true;
        }
        else return false;
    }
}
