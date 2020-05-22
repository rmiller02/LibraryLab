
import java.util.ArrayList;

public class OverdueList <G extends LibraryItem> {
    ArrayList<Item> overdueItems;

    OverdueList() {
        this.overdueItems = new ArrayList<>();
    }

    public void addOverdueItem (G item){
        overdueItems.add(item);
    }

    public void removeOverdueItem (G item){
        overdueItems.remove(item);
    }
}