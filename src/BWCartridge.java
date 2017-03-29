/**
 * Created by Тим on 29.03.2017.
 */
public class BWCartridge implements ICartridge {
    @Override
    public String toString() {
        return "B&W";
    }

    @Override
    public String getFillPercentage() {
        return "100%";
    }
}
