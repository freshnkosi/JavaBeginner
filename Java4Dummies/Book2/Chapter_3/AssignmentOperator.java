/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter03;

/**
 *
 * @author user
 */
/*
ASSIGNMENT OPERATORS:
The result of an assignment expression is the value that’s assigned to the variable.
The result of the expression a = 5, for example, is 5. Likewise, the result of the
expression a = (b + c) * d is the result of the expression (b + c) * d.
 */
public class AssignmentOperator {

    /*public static void main(String[] args) {
        int a;
        int b;
        a = (b = 3) * 2;

        System.out.println("a = "+a +" ; b = "+b);

        /* The parentheses are important in the previous example because without parentheses,
        the assignment operator is the last operator to be evaluated in Java’s order of precedence. 
         Consider one more example:
       
        
        int a;
        int b = 2;
        a = b = 3 * b; // a is 6, b is 6
         
        System.out.println(" a = "+a +" ; b = "+b);
    }
*/

   
   
    public static void main(String[] args) {
       
   /* USING COMPOUND ASSIGNMENT OPERATORS:
    A compound assignment operator is an operator that performs a calculation and an
    assignment at the same time.*/
       
    int a = 2;
    int b = 3;
   a *= b + 1;
    
       System.out.println(a);
        System.out.println(b);

    
  

    }
   
}

