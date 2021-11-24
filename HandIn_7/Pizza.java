/** 
*
* @author Patricia Bresku
*
* @version 22.10.2021
*/

import java.util.*;

// The constructor of the super class must be given the arguments "Pizza" and 45 (dkk).

    /* 
    The constructor should not take any arguments. 
    The list of toppings must be empty for new Pizza objects.
    */

public class Pizza extends Food {
    protected List<String> toppings; // The field toppings must be a List of String, and it must be protected

    public Pizza() {               // public Pizza(String name, int price)
        super("Pizza", 45); // The constructor of the super class must be given the arguments "Pizza" and 45 (dkk). 
        toppings = new ArrayList<String>(); // The list of toppings must be empty for new Pizza objects.
    }

    // The addTopping(String topping) method adds to the list topping  
    public void addTopping(String topping, int price) {
        toppings.add(topping);                                                 // and increases the price by 10 dkk
        super.getPrice(this.price+10);
        
        }
        // boolean toppingAdded;
  

    // public double pizzaCost()							//Method for finding the cost of the pizza.
	// {
	// 	double cost = base.getCost();						//Declares cost and calls get cost method for the pizza base.
	// 	for(PizzaTopping topping : tops)					//For loop for each element in the pizza toping array list.
	// 	{
	// 		cost += topping.getCost();					//Toping cost getter that adds onto the cost variable.
	// 	}
	// 	return cost;								//returns the cost of the pizza.
	// }

    // The class must also override the display() method of the super class to also print the toppings comma separated with curly brackets around. E.g., a Pizza with the three toppings "Pepperoni", "Pineapple", and "Onion" should be printed as
    // 75 kr Pizza { Pepperoni, Pineapple, Onion }
    // or the empty pizza as
    // 45 kr Pizza { }

    public void show() {
        super.display();
        System.out.println();
    }    

    // setName(String name) must set the name of the pizza through the name field of Food.



}


// String[] message = { "hi", "how", "are", "you" };
// String separator = "";  // first, no space
// for (String word : message) {
//     System.out.print(separator);
//     System.out.print(word);
//     separator = " ";    // after first iteration, a space between the words
// }