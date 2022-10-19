

package ex06_2_exercise;

public class ShoppingCart {

     public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item01 = new Item();
        Item item02 = new Item();
        
        item01.desc = "Jacket";
        item02.desc = "Hat";

	

	// Print both item descriptions and run code.
         System.out.println("Item 1: "+item01.desc);
         System.out.println("Item 2: "+item02.desc);

	// Assign one item to another and run it again.
         item01 = item02;
         System.out.println("Item 1: "+item01.desc);
         System.out.println("Item 2: "+item02.desc);

     }
 
} 
