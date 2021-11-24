
public class Main {
    // public static void main(String[] args) {
    //     // ArrayList<String> Todo = new ArrayList<>();
    //     Task task;
    //     Todo todo;
    //     todo = new Todo();
    //     // todo.addTask("Stuff", 2, 15);
    //     todo.addTask("Eat lunch", 1, 1);
    //     // todo.print();
    //     System.out.print("");
    // }
public static void main(String[] args) {
    Task task;
    Todo todo;
    todo = new Todo();
    // System.out.println(new Task("Pickup kids", 1, 15));
    todo.addTask("Pickup kids", 3, 15);
    System.out.println("");
    todo.addTask("Stuff", 2, 15);
    todo.addTask("Smoke weed everyday", 4, 200);
    todo.printPrioritized();
    // todo.print();
    // todo.completeTask(0);
    // System.out.println("");
    todo.print();
    }
}
   