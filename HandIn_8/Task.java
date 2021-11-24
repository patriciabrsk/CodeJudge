/** 
*
* @author Patricia Bresku
*
* @version 26.10.2021
*/

public class Task {
    private String task;
    private int priority;
    private int workload;

    public Task(String task, int priority, int workload) {
        this.task = task;
        this.priority = priority;
        this.workload = workload;
    }

    public String translatePriority() {
        switch(priority) {
            case 1 :
                return "very important";
            case 2 : 
                return "important";
            case 3 :
                return "unimportant";
            case 4 :
                return "after learn Portuguese";
            default : 
                return "";
        }  
    }

// Create a toString() method for Task, so that:

// new Task("Stuff", 1, 15).toString() will give the String "Stuff takes 15 minutes and has priority very important"
// new Task("Eat lunch", 3, 1).toString() will give the String "Eat lunch takes 1 minutes and has priority unimportant"
    public String toString() {
        return task + " takes " + workload + " minutes " + "and has priority " + translatePriority();
    }
    
    public int getWorkload() {
        return workload;
    }

    public int getPriority() {
        return priority;
    }
}