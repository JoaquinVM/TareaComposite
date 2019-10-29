public class Client {
    public static void main(String []args){
        Composite subtask1 = new Composite("subtask1");
        subtask1.add(new Item("Item1", 6));
        subtask1.add(new Item("Item2", 6));

        Composite subtask2 = new Composite("subtask2");
        subtask2.add(new Item("Item3", 6));
        subtask2.add(new Item("Item4", 6));

        Composite subtask3 = new Composite("subtask3");
        subtask3.add(new Item("Item5", 6));
        subtask3.add(new Item("Item6", 6));

        Composite subtask4 = new Composite("subtask4");
        subtask4.add(new Item("Item7", 6));
        subtask4.add(new Item("Item8", 6));

        Composite subtask5 = new Composite("subtask5");
        subtask5.add(new Item("Item9", 6));
        subtask5.add(new Item("Item10", 6));

        Composite subtask6 = new Composite("subtask6");
        subtask6.add(new Item("Item11", 6));
        subtask6.add(new Item("Item12", 6));

        Composite subtask7 = new Composite("subtask7");
        subtask7.add(new Item("Item13", 6));
        subtask7.add(new Item("Item14", 6));

        Composite subtask8 = new Composite("subtask8");
        subtask8.add(new Item("Item15", 6));
        subtask8.add(new Item("Item16", 6));

        Composite subtask9 = new Composite("subtask8");
        subtask9.add(new Item("Item17", 6));
        subtask9.add(new Item("Item18", 6));

        Composite task1 = new Composite("task1");
        task1.add(subtask1);
        task1.add(subtask2);
        task1.add(subtask3);

        Composite task2 = new Composite("task2");
        task2.add(subtask4);
        task2.add(subtask5);
        task2.add(subtask6);

        Composite task3 = new Composite("task3");
        task3.add(subtask7);
        task3.add(subtask8);
        task3.add(subtask9);

        Composite userStory = new Composite("userStory");
        userStory.add(task1);
        userStory.add(task2);
        userStory.add(task3);

        System.out.println("Estimacion " + subtask1.getName() + ": " + subtask1.calcEstimacion());
        System.out.println("Estimacion " + task1.getName() + ": " + task1.calcEstimacion());
        System.out.println("Estimacion " + userStory.getName() + ": " + userStory.calcEstimacion());

    }
}