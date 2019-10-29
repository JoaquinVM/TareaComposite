public class Item extends Component {

    private int estimacion;

    public Item(String name, int estimacion) {
        super(name);
        this.estimacion = estimacion;
    }

    public int getEstimacion() {
        return estimacion;
    }

    @Override
    public int calcEstimacion() {
        return estimacion;
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on product");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on product");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\tItem: " + this.getName());
    }
}
