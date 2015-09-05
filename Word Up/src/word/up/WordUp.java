/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.up;

import java.util.ArrayList;
import java.util.Random;

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
//    this(null);
//    this.arrayList = new ArrayList<>();
    this(new ArrayList<>());
  }
  
  public WordUp(ArrayList arrayList) {
    this.arrayList = arrayList;
    this.randomNumber = 5;
    this.printMessage = "";
    arrayList.add("puppy");
    arrayList.add("kitten");
    arrayList.add("duckling");
    arrayList.add("snakelet");
    arrayList.add("larvae");
  }
  
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
  public void setArrayList() {
    setArrayList("");
  }
  
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
    ArrayList l = new ArrayList<>();
    WordUp w = new WordUp(l);
//    WordUp w = new WordUp();
    
    // generate random number
    Random rg = new Random();
    Integer r = rg.nextInt(l.size());
    
    // print array list message
    System.out.printf("Random word: %s%n",l.get(r));
    
    // debugging
    

  }
  
}
