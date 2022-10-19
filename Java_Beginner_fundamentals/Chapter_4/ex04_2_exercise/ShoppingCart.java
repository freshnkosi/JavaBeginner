package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Will Smith";
        String itemDesc = "shirt";
        double price = 45.99;
        double tax = 12.35;
        int quantity = 1;
        double total = price * quantity * tax;
 
        String message = custName+" wants to purchase "+ quantity +" "+itemDesc;
        
       String message2 = "The total cost with tax is :R "+ total;

        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        
        
        // Modify message to include quantity 
        
        
        System.out.println(message+", "+ message2);
        
        // Calculate total and then print the total cost
        

        
    }    
}
