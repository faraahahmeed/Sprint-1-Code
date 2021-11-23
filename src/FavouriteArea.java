import java.util.ArrayList;
import java.util.List;

public class FavouriteArea implements Operations{

    private List<String> list = new ArrayList<String>();

    @Override
    public void save(String area) {
        list.add(area);
    }

    @Override
    public List<String> getList() {
        return (list);
    }

    @Override
    public void delete(String ID) {
        list.remove(ID);
    }
}
