/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminalassessment;

/**
 * TerminalAssessment.java
 * 30/04/2021
 * @author Alexis Pechon (x19358953)
 */
public class TerminalAssessmentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaring and assigning our ArrayList
        MyArrayList binaryList = new MyArrayList<>(); //ArrayList used to store elements for the Binary Search Algorithm
        MyArrayList linearList = new MyArrayList<>(); //ArrayList used to store elements for the Linear Search Algorithm
        
        for(int i = 0; i < 35000; i++){
            //for loop used to loop the number of values being stored in the ArrayList by a pre-defined amount
           
            //int randomNum = (int)(Math.random()*100000);
            //binaryList.add(new Integer (randomNum));
            
            binaryList.add(new Integer(10));
            binaryList.add(new Integer(25));
            binaryList.add(new Integer(33));
            binaryList.add(new Integer(51));
            binaryList.add(new Integer(66));
            binaryList.add(new Integer(77));
            binaryList.add(new Integer(88));
            binaryList.add(new Integer(99));
            binaryList.add(new Integer(155));
        }
        
        //Purpose of the for loop is to add the same elements from the binaryList to the linearList
        for(int i = 0; i < binaryList.size(); i++){
            linearList.add(i, binaryList.get(i));
        }
        
        
        //*Start of the Binary Search Algorithm*//
        long startTime = System.currentTimeMillis();
        
        Integer searchKey = 69;
        int binaryPosition = binaryList.BinarySearch(searchKey, 0, binaryList.size()-1);
        
        //if else statement to check if the searchKey has been found or not
        if(binaryPosition == -1){
            System.out.println("Search Key: " + searchKey + " has NOT been found!");
        }
        else{
            System.out.println("Search Key: " + searchKey + " HAS been FOUND!");
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("The time it took to performance the binary search was: " + (endTime - startTime) + " Milliseconds\n");       
        //*End of the Binary Search Algorithm*//
        
        //-----BREAK-----//
        System.out.println("=======================================================================================================\n");
        //-----BREAK-----//
        
        //*Start of the Linear Search Algorithm*//
        long linearStartTime = System.currentTimeMillis();
        
        Integer newSearchKey = 420;
        int linearPosition = linearList.SequentialSearch(newSearchKey);
        
        //if else statement to check if the searchKey has been found or not
        if(linearPosition == -1){
            System.out.println("\nThe linear key: " + newSearchKey + " has NOT been found!");
        }
        else{
            System.out.println("\nThe linear key: " + newSearchKey + " has been FOUND!");
        }
        
        long linearEndTime = System.currentTimeMillis();
        
         System.out.println("The time it took to performance the linear search was: " + (linearEndTime - linearStartTime) + " Milliseconds");       
        //*End of the Linear Search Algorithm*//
    }
    
}
