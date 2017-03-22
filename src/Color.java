/**
 * Created by Тим on 22.03.2017.
 */
public enum Color {
    RED ("Red", 0xff0000) , GREEN("Green", 0x00ff00), BLUE("Blue", 0x0000ff);
    String colorasString;
    int code;


    Color(String colorasString, int code) {
        this.colorasString = colorasString;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorasString='" + colorasString + '\'' +
                ", code=" + code +
                '}';
    }
}
