/**
 * Created by Тим on 29.03.2017.
 */
public class ColorCartridge implements ICartridge {
    @Override
    public String toString() {
        return "Color";
    }

    @Override
    public String getFillPercentage() {
        return "100%";
    }
}
