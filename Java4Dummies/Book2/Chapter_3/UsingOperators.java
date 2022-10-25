/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter03;

/**
 *
 * @author user
 */
//Here's an example on how to use operators with java, and how they work:
public class UsingOperators {

    /* public static void main(String[] args) {
        int a = 32, b = 5;
        int c = a + b; // c is 37
        int d = a - b; // d is 27
        int e = a * b; // e is 160
        int f = a / b; // f is 5 (32 / 5 is 6 remainder 2)
        int g = a % b; // g is 2 (32 / 5 is 6 remainder 2)
        a++; // a is now 33
        b--; // b is now 4
        
        //you can play around with it by adding any declared letter above onto the print statement
        System.out.println(c);
    }*/
    
    //here's how operators work for double values:
    public static void main(String[] args) {
        double x = 5.5, y = 2.0;
        double m = x + y; // m is 7.5
        double n = x - y; // n is 3.5
        double o = x * y; // o is 11.0
        double p = x / y; // p is 2.75
        double q = x % y; // q is 1.5
        x++; // x is now 6.5
        y--; // y is now 1.0
        
        System.out.println(x++);
    }
}
