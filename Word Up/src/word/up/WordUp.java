/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.up;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Smokie Lee
 */
public class WordUp {
  private ArrayList arrayList;
  private Integer randomNumber;
  private String printMessage;
  
  // constructors
  public WordUp() {
    this.arrayList = new ArrayList<>();
    this.randomNumber = 0;
    this.printMessage = "";
  }
  
//  public WordUp(String variable) {
//  }
  
  // getters
  // getArrayList, getRandomNumber, getPrintMessage
  public ArrayList getArrayList() {
    return arrayList;
  }
  
  public Integer getRandomNumber() {
    return randomNumber;
  }
  
  public String getPrintMessage() {
    return printMessage;
  }
  
  // setters
  // setArrayList, setRandomNumber, setPrintMessage
//  public void setArrayList(int numMessages,ArrayList<String> messageListName) {
//  public void setArrayList(String x) {
  public void setArrayList() {
    // set/put values into the array list
//    numMessages = 3;
//    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0.
////      messageListName.add(getUserString()); // Add user input into array list. 
//      messageListName.add("First");
//      messageListName.add("Second");
//      messageListName.add("Third");
//    }
//    this.arrayList.add(x);
    this.arrayList.add("First");
    this.arrayList.add("Second");
  }
  
  public void setRandomNumber() {
    // set random number after computing it
  }
  
  public void setPrintMessage(int messageNumber, ArrayList<String> arrayList) {
    // set print message value
    System.out.printf("%s%n",arrayList.get(messageNumber));
    this.printMessage = null;
    
//    // print array list in readable format
//    int order = 1; // Counter for the numbered list.
//    for (Object message : arrayList) { // Enhanced for loop is more efficient here.
//      System.out.printf("%s. %s%n",String.valueOf(order++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
//    }
  }
  
//  // other methods
//  public void print() {
//    print("");
//  }
  
//  public void print(String x) {
//    System.out.println(x);
//  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new object(s)
//    WordUp w = new WordUp();
    ArrayList l = new ArrayList();

    // set array list
    l.add("puppy");
    l.add("kitten");
    l.add("duckling");
    l.add("laser");
    l.add("larvae");
    
    // generate random number
    int s = l.size();
    int a = 0; // Lower bound is the first value. First index in an array list is always 0.
    int b = s - 1; // Upper bound is the size of the array list - 1.
    int r = (int) (Math.random() * (b - a + 1)) + a; // where a & b are the lower and upper bounds respectively.
//    int r = (int) (Math.random() * (l.size() + 1)); // Simplified equation. Probably don't want to use this.
    
    // print array list message
    
    // debugging
    System.out.println("RESULTS");
    
    int order = 1; // Counter for the numbered list.
    for (Object message : l) { // Enhanced for loop is more efficient here.
      System.out.printf("%s. %s%n",String.valueOf(order++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
    }
    
//    System.out.println("Random number = " + r);
    System.out.printf("Random message: %s (%s)%n",l.get(r),r);
    
//    System.out.printf("%s%n",arrayList.get(messageNumber));
//    this.printMessage = null;
  }
  
}
