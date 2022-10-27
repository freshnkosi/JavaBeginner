/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter05;

/**
 *
 * @author user
 */
public class UsingLoops {

    public static void main(String[] args) {
      /*  //Understanding the formal format of the for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/

        //here is a counting loop:

    /*    {
            int number = 2;
            while (number <= 20) {
                System.out.print(number + " ");
                number += 2;
            }
            System.out.println();
        } 
        */
         
 
        //Breaking out of a loop:
     /*   {
            int number = 2;
            while (number <= 20) {
                if (number == 12) {
                    break;
                }
                System.out.print(number + " ");
                number += 2;
            }
            System.out.println();
        }*/
         
   //Using the continue statement:
        //Here’s a version of the Dodecaphobia program that uses a continue statement to skip the number 12 rather than stop counting altogether when it reaches 12:
  /*      {
            int number = -2;
            while (number < 20) {
                number += 2;
                if (number == 12) {
                    continue;
                }
                System.out.print(number + " ");
            }
            System.out.println();
        } */
 
        //RUNNING DO-WHILE LOOPS: 
        //In a do-while loop, the condition that stops the loop isn’t tested until after the statements in the loop have executed.
        //Here’s a version of the EvenCounter program that uses a do-while loop instead of a while loop:
   /*     {
            int number = 2;
            do {
                System.out.print(number + " ");
                number += 2;
            } while (number <= 20);
            System.out.println();
        } */
    }
}
