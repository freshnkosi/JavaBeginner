/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter05;

/**
 *
 * @author user
 */
public class NestedLoop {
    //To demonstrate the basics of nesting, here’s a simple little program that uses a pair of nested for loops:

    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for (int y = 1; y < 10; y++) {
                System.out.print(x + "-" + y + " ");
            }
            System.out.println();
        }
    }
}
