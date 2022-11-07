/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter08;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Console {

    static Scanner sc = new Scanner(System.in);

    public static boolean askYorN(String prompt) {
        while (true) {
            String answer;
            System.out.println("\n" + prompt
                    + "(Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }

}
