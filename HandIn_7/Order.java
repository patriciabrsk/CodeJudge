/** 
*
* @author Patricia Bresku
*
* @version 22.10.2021
*/

import java.util.*;

public class Order {
    // The field ordered must be a List of Food, and it must be protected
    protected List<Food> ordered;
    // The constructor must leave the list of ordered food empty
    public Order() {
        ordered = new ArrayList<Food>();
    }
    // The addFood(Food food) must add the given food to the list ordered
    public void addFood(Food food) {
        food.addFood(food);
    }
    // The total() method must return the sum of prices for all food items in the order.
    public int total() {
        return 
    }
    // The display() method must print out all the food ordered, followed by the total for the order. 
    // The output must follow this format:
    // 65 kr Burger
    // 25 kr Coke
    // 75 kr Pizza { Pepperoni, Pineapple, Onion }
    // 165 kr TOTAL
    public void display() {
        System.out.println();

    }
}