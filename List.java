/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.LinkedList;
/**
 *
 * @author Owner
 */
public class List {
      public static void main(String args[]) { 
      // create a linked list 
      LinkedList stark = new LinkedList(); 
      // add elements to the linked list
      // A Games of Thrones family Stark list.
      stark.add("Robb"); 
      stark.add("Rickon"); 
      stark.add("Bran"); 
      stark.add("Sansa"); 
      stark.add("Arya"); 
      stark.addLast("Ned"); 
      stark.addFirst("Catlyn"); 
      stark.add(1, "Jon"); 
      System.out.println("Original Stark family members : " + stark); 
      
       // remove elements from the linked list 
      stark.remove("Robb"); 
      stark.remove(2); 
      System.out.println("Contents of Stark family after death: " 
       + stark); 
       
      // remove first and last elements 
      stark.removeFirst(); 
      stark.removeLast(); 
      System.out.println("Stark family after deleting first and last: " 
       + stark); 
 
      // get and set a value 
      Object val = stark.get(2); 
      stark.set(2, (String) val + " Changed"); 
      System.out.println("Stark family after change: " + stark); 
   }
}
