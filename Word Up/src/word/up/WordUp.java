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
    // set random number after computing it
    Random gen = new Random();
    this.randomNumber = gen.nextInt(this.arrayList.size());
  }
  
  public void setPrintMessage() {
    this.printMessage = (String) arrayList.get(randomNumber); // Cast the object that is returned into String. There are other ways to do this, but this is simplest.
  }
  
  // other methods
  public void randomNumber() {
    setRandomNumber();
    System.out.printf("Number: %s%n",getRandomNumber());
  }

  public void randomMessage() {
//    getPrintMessage();
    setPrintMessage();
    System.out.printf("Word: \t%s%n",getPrintMessage());
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new object(s)
//    ArrayList l = new ArrayList<>();
//    WordUp w = new WordUp(l);
    WordUp w = new WordUp();
    
    // generate random number
    w.randomNumber();
    
    // print word
//    w.setPrintMessage();
//    System.out.printf("Word: \t%s%n",w.getPrintMessage());
    w.randomMessage();
    
    // debugging
    

  }
  
}
