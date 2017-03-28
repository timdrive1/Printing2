/**
 * Created by Maxim on 28.03.2017.
 */
public class PaperTray {
    int pages = 0;

    public void addPaper(int count) {
        pages+=count;
    }

    public void usePage() {
        pages--;
    }

    public boolean isEmpty() {
        if (pages == 0) {
            return true;
        } else {
            return false;
        }
    }
}
