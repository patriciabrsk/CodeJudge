/** 
*
* @author Patricia Bresku
*
* @version 26.10.2021
*/

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Todo {
    // ArrayList<String> Todo();
    // List<Task> Todo = new ArrayList<>();
    private ArrayList<Task> list = new ArrayList<Task>();
    private int total;
    private int priority;
    
    public void addTask(String description, int priority, int minutes) {
        if(priority > 4 || priority < 1) {
            System.out.println(description + " has invalid priority ");
        }
        if(minutes < 0) {
            System.out.println(description + " has invalid workload ");
        }
        // Otherwise, it should add a new task to the Todo with the given parameters.
        list.add(new Task(description, priority, minutes));
        
    }
    
    public void print() {
        System.out.println("Todo:");
        System.out.println("-----");
        for(Task task : list){
        System.out.println(task);
        }
        if(list.size() == 0) {
            System.out.println("You're all done for today! #TodoZero");
            if(total > 0) {
        // else if(total == 0) {
        // for (int i = 0 ; i < 5 ; i++)
            System.out.println(total + " minutes of work done!");
            }
        }
        else if(total > 0) {
            System.out.println(total + " minutes of work done!");
        }
    }
    // public void printTodoList() {
    //     for(Task task : list){
    //        System.out.println(task);
    //     }
    // }
    // Add a method completeTask(int index). 
    // If the index is not valid, it must print: Invalid index. Otherwise the matching task is removed.
    public void completeTask(int index) {
        if(index < 0 || index >= list.size()) {
            System.out.println("Invalid index");
        }
        else {
            total += (list.get(index)).getWorkload();
            list.remove(index);
        }
    // Modify completeTask(int index) so that the workload of each completed task is added to a running total of completed work.        
    }  
       /* followed by all the tasks that have a priority more important than the given limit. 
        E.g., if the limit is 2, only tasks with priority 1 or 2 should be printed. 
        If no tasks are printed in this way, it must print: No tasks with given priority */

    public void printPriority(int limit) {
        System.out.println("Filtered todo:");
        System.out.println("--------------");
        boolean printed = false;
        for(Task task : list) {
            if(task.getPriority()<=limit) {
                printed = true;
                System.out.println(task);
            }
        }
        if(!printed) System.out.println("No tasks with given priority");
    }

    public void printPrioritized() {
        System.out.println("Prioritized todo:");
        System.out.println("-----------------");
        // followed by all tasks first ordered by priority. 
        // If two tasks have the same priority, the task requiring the least amount of work should come first.
        Comparator<Task> comparator = new Comparator<Task>() {
            public int compare(Task task1, Task task2) {
                if(task1.getPriority()<task2.getPriority()) return -1;
                else if (task1.getPriority()>task2.getPriority()) return 1;
                else {
                    if(task1.getWorkload()<task2.getWorkload()) return -1;
                    else if(task1.getWorkload()>task2.getWorkload()) return 1;
                    else return 0;
                }
            };
        };
        ArrayList<Task> sorted = new ArrayList<Task>(list);
        Collections.sort(sorted, comparator);
        for(Task task : sorted) {
            System.out.println(task);
        }
    }
}
