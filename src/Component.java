abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int calcEstimacion();

    public  abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void getChild(int position);
}
