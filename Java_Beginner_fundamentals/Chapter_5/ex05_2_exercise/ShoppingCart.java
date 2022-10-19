
package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
       // String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String[] products = {"Hoodies","Pants","Sweaters","Golf T-shirts"};
        


        // Change message to show the number of items purchased.
       String message = custName+" wants to purchase "+ products.length;

        System.out.println(message+ " "+products[3]);
        // Print an element from the items array.  
        //System.out.println(products[3]);
        
    }

}
