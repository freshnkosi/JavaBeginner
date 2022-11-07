/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter04;

/**
 *
 * @author user
 */
public class LogicalOperators {

    public static void main(String[] args) {
        // The simplest of the logical operators is Not (!).
       /*  int i = 7;
      
      if (i != 4){
          System.out.println("incorrect");
      }
       // System.out.println(i);*/
         

        // Using the & and && operators:
        int salesClass = 6;
        double salesTotal = 1000.0;
        double commissionRate;
        
        if ((salesClass == 1) & (salesTotal >= 10000.0)) {
            commissionRate = 0.025;
            System.out.println(commissionRate);
        }else {
            System.out.println("No commission!!");
        }
 
    }

}
