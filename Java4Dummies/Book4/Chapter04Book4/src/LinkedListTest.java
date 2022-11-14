import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        //Creating the LinkedList
        LinkedList<String> officers = new LinkedList<String>();

// adding items to the Linkedlist
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Tuttle");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println(officers);
// replace Tuttle with Murdock
       /* officers.set(2, "Murdock");
        System.out.println("\nTuttle is replaced:");
        System.out.println(officers);*/
    }
}