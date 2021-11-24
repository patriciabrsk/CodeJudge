//import java.util.*;

/*
As an example, to test that the method getName works as intended, you can use the following main method.

public static void main(String[] args) {
   Student stud = new Student("Jesper", 43);
   System.out.println("Testing stud.getName(): " + stud.getName());
}
The output of this program should be: Testing stud.getName(): Jesper.

This main method can then be expanded upon to test more functionality as you progress.

*/

public class Student 
{
    /*
    private String name = "Jesper";
    private int age = 43; 
    */

    private String name;
    private int age; 
    
    //constructor
    public Student(String name, int age) 
    {
        // Student stud = new Student()
        this.setName(name);       // ex. "Jesper"
        this.setAge(age);
    }
    //methods  
    public String getName()
    {
        return this.name;
    }

    public int getAge() 
    {
        return this.age;
    }

    public String toString() 
    {
        return "The name of the student is " + this.getName() + ". The student is " + this.getAge() + " years old.";
        // return toString = "The name of the student is " + name. "The student is " + age " years old.";
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAge(int age) 
    {
        if (age < 16)
        {
            System.out.println("The university does not accept students below 16");
        }
        else if (age > 99) 
        {
            System.out.println("The university does not accept students that are older than 99");
        } 
        else 
        {
            this.age = age;
        }
    }

    /* In the void setAge(int age) it is important to know that the university only admits students between 16 and 99 years old. 
    If the student is too young print "The university does not accept students below 16". 
    If the student is too old print "The university does not accept students that are older than 99". 
    Only set the age, if the age is within the range.
    */
}

// cmd + shift + p -> open search bar
// Clean java language server ...
// Debugger 
