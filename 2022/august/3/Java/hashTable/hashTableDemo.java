/*
 *   Failed to implement. 
*/

import java.util.*;

public class hashTableDemo {
    public static void main(String[] args) {
        // Creating a hash table
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();

       // Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

        h.put(1, "I");
        h.put(2, "II");
        h.put(3, "III");

        // Create a clone or shallow copy of hash table h
        // h1.clone(h);
        //h1 = h;
        // Checking clone h1
        System.out.println("Values in clone: " + h);

        // Clear hash table h
       // h.clear();

        // Checking hash table h
       // System.out.println("after clearing: " + h);
       // System.out.println("values in clone: " + h);
    }
}