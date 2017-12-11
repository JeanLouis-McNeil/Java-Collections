/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;
/**
 *
 * @author Owner
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /** I created an array of numbers to show the HashSet,
         * TreeSet classes inside the Set Collection interfaces.
         */
        
         int count[] = {34,22,10,60,30,22,27,45,98,21,75}; 
         
        // The Set object is created
     Set<Integer> set = new HashSet<Integer>();
     
     //Inside the Try-Catch Exception
     try{ 
         // Going through the array to look for items
        for(int i = 0; i<11; i++){ 
           set.add(count[i]); 
        } 
        System.out.println(set); 
   
        TreeSet sortedSet = new TreeSet<Integer>(set); 
        System.out.println("The sorted list is:"); 
        System.out.println(sortedSet); 
 
        System.out.println("The First element of the set is: "+ 
                          (Integer)sortedSet.first()); 
        System.out.println("The last element of the set is: "+ 
                        (Integer)sortedSet.last()); 
     } 
     catch(Exception e){} 
  }
    }
    
