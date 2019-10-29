import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<>();

    public Composite(String attribute) {
        super(attribute);
    }


    @Override
    public int calcEstimacion() {
        int suma = 0;
        for(Component comp : list){
            suma += comp.calcEstimacion();
        }
        return suma;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getName());
    }
}
