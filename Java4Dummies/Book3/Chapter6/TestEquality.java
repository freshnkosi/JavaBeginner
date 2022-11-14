/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6;

/**
 *
 * @author user
 */
public class TestEquality {

    public static void main(String[] args) {
        Employee emp1 = new Employee(
                "Martinez", "Anthony");
        Employee emp2 = new Employee(
                "Martinez", "Anthony");
        if (emp1 == emp2) {
            System.out.println(
                    "These employees are the same.");
        } else {
            System.out.println(
                    "These are different employees.");
        }

    }
}

