/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.up;

import java.util.ArrayList;

/**
 *
 * @author Smokie Lee
 */
public class WordUp {
  // initialize variables
  // arrayList, randomNumber, printMessage
  private ArrayList arrayList;
  private Integer randomNumber;
  private String printMessage;
  
  // constructors
  public WordUp() {
    this.arrayList = null;
    this.randomNumber = 0;
    this.printMessage = "";
  }
  
  public WordUp(String variable) {
  }
  
  // getters
  // getArrayList, getRandomNumber, getPrintMessage
  public ArrayList getArrayList() {
    return arrayList;
  }
  
  public Integer getRandomNumber() {
    return randomNumber;
  }
  
  public String printMessage() {
    return printMessage;
  }
  
  // setters
  // setArrayList, setRandomNumber, setPrintMessage
//  public void setArrayList(int numMessages,ArrayList<String> messageListName) {
  public void setArrayList(String x) {
    // set/put values into the array list
//    numMessages = 3;
//    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0.
////      messageListName.add(getUserString()); // Add user input into array list. 
//      messageListName.add("First");
//      messageListName.add("Second");
//      messageListName.add("Third");
//    }
    arrayList.add(x);
  }
  
  public void setRandomNumber() {
    // set random number after computing it
  }
  
  public void setPrintMessage() {
    // set print message value
    int order = 1; // Counter for the numbered list.
    for (Object message : arrayList) { // Enhanced for loop is more efficient here.
      System.out.printf("%s. %s%n",String.valueOf(order++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
    }
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
//    WordUp a = new WordUp();
    ArrayList l = new ArrayList();

    // set array list
//    a.setArrayList("first");
    l.add("first");
    l.add("second");
    l.add("third");
    
    // generate random number
    
    // print array list message
//    a.setPrintMessage();
//    System.out.printf("%s",l);
    int order = 1; // Counter for the numbered list.
    for (Object message : l) { // Enhanced for loop is more efficient here.
      System.out.printf("%s. %s%n",String.valueOf(order++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
    }
  }
  
}
