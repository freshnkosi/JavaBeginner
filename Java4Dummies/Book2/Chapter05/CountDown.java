/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter05;

/**
 *
 * @author user
 */
public class CountDown {

    public static void main(String[] args) {
        //IN THIS SECTION, WE'RE COUNTING DOWN USING THE FOR LOOP 
        System.out.print("We are go for launch in T minus ");
        for (int count = 10; count >= 0; count--) {
            if (count == 8) {
                System.out.println("Ignition sequence start!");
            } else {
                System.out.println(count + "...");

            }
            System.out.println("All engines running!");
            System.out.println("Liftoff! We have a liftoff!");
        }

    }
}
