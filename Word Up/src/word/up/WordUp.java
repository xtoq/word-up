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
  private final ArrayList arrayList;
  private Integer randomNumber;
  private String printMessage;
  
  // constructors
  public WordUp() {
    this.arrayList = new ArrayList<>();
    this.randomNumber = 5;
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
  public void setArrayList(String message) {
    // set/put values into the array list
//    arrayList.set(1,"first");
//    this.arrayList = arrayList.asList("One", "Two", "Three");
    this.arrayList.add(message);
  }
  
//public void add(Item i) {
//
//    itemsInGroceryList.add(i);
//}
  
  public void setRandomNumber() {
    setRandomNumber(0,arrayList.size());
  }
  
  public void setRandomNumber(Integer a, Integer b) {
    // set random number after computing it
//    s = arrayList.size();
    a = 0; // Lower bound is the first value. First index in an array list is always 0.
    b = this.arrayList.size() - 1; // Upper bound is the size of the array list - 1.
//    int r = (int) (Math.random() * (b - a + 1)) + a; // where a & b are the lower and upper bounds respectively.
    this.randomNumber = (int) (Math.random() * (b - a + 1)) + a; // where a & b are the lower and upper bounds respectively.
    // int r = (int) (Math.random() * (l.size() + 1)); // Simplified equation. Probably don't want to use this.
  }
  
  public void setPrintMessage(int messageNumber, ArrayList<String> arrayList) {
    // set print message value
    System.out.printf("%s%n",arrayList.get(messageNumber));
    this.printMessage = null;
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
    WordUp w = new WordUp();
    ArrayList l = new ArrayList<>();

    // set array list
    l.add("puppy");
    l.add("kitten");
    l.add("duckling");
    l.add("laser");
    l.add("larvae");
    
//    w.setArrayList("puppy");
//    w.setArrayList("kitten");
    
    // generate random number
    if (l.size() > 0) {
//    s = arrayList.size();
    Integer a = 0; // Lower bound is the first value. First index in an array list is always 0.
    Integer b = l.size() - 1; // Upper bound is the size of the array list - 1.
//    int r = (int) (Math.random() * (b - a + 1)) + a; // where a & b are the lower and upper bounds respectively.
    Integer r = (int) (Math.random() * (b - a + 1)) + a; // where a & b are the lower and upper bounds respectively.
    // int r = (int) (Math.random() * (l.size() + 1)); // Simplified equation. Probably don't want to use this.
    System.out.printf("Number is: %s%n%n",r);
//      w.setRandomNumber();
//      w.getRandomNumber();
//      Integer r = w.getRandomNumber();
      
      System.out.println("RESULTS");
      System.out.printf("List size is %s.%n",l.size());
      
      int order = 1; // Counter for the numbered list.
  //    int order2 = 0;
      for (Object message : l) { // Enhanced for loop is more efficient here.
        System.out.printf("%s. %s%n",String.valueOf(order++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
  //      System.out.printf("%s. %s%n",String.valueOf(order2++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
      }
      System.out.printf("Random number: %s%n",r);
      System.out.printf("Random message: %s%n",l.get(r));
    }
    else {
      System.out.println("RESULTS");
      System.out.printf("List size is %s.%n",l.size());
    }
    // print array list message
    
    // debugging
    

  }
  
}
