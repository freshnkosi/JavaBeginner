/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter04;

/**
 *
 * @author user
 */
public class UsingIfStatements {

    public static void main(String[] args) {
        /*
         double commissionRate = 0.0;
        double salesTotal = 15000.00;
        double commission  = salesTotal * commissionRate;
        if (salesTotal > 10000.0) {
            commissionRate = 0.05;
           commission = salesTotal * commissionRate;
        }
        System.out.println(commission); 
*/
        
        //IF-ELSE STATEMENTS:
       /*  double commissionRate;
        double salesTotal = 8000.00;

        if (salesTotal <= 10000.0) {
            commissionRate = 0.02;
        } else {
            commissionRate = 0.05;
        }
        System.out.println(commissionRate);*/
        
        
        //NESTED IF STATEMENTS:
         double commissionRate;
        double salesTotal = 900.00;
        
        if (salesTotal >= 10000.0) {
            commissionRate = 0.05;
        } else if (salesTotal >= 5000.0) {
            commissionRate = 0.035;
        } else if (salesTotal >= 1000.0) {
            commissionRate = 0.02;
        } else {
            commissionRate = 0.0;
        }
        System.out.println(commissionRate);
    }

}
