/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chapter01Book4;

import java.util.Scanner;

/**
 * IN THIS PROGRAM WE COVER MORE ON HOW TO USE THE SPLIT METHOD WHEN SPLITTING A
 * STRING.
 *
 */
public class ListWords {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[] word = s.split("\\s+");
        for (String w : word) {
            System.out.println(w);
        }
    }
}
