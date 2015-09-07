package word.up;

import java.util.*;

/**
 * Generates an array list & random number, then uses that number to print the corresponding value in the array list.
 * @author Smokie Lee
 */
public class WordUp {
  
  // === Variables ===
  private final ArrayList arrayList;
  private Integer randomNumber;
  private String printMessage;
  
  // === Constructors ===
  /**
   * Create a new WordUp object with new array list.
   */
  public WordUp() {
    this(new ArrayList<>());
  }
  
  /**
   * Create a new WordUp object with an existing array list.
   * @param arrayList Name of array list.
   */
  public WordUp(ArrayList arrayList) {
    this.arrayList = arrayList;
    this.randomNumber = 0;
    this.printMessage = "";
  }
  
  // === Accessors ===
  /**
   * Returns value of arrayList as an array.
   * @return arrayList
   */
    public ArrayList getArrayList() {
    return arrayList;
  }
  
  /**
   * Returns the value of randomNumber.
   * @return randomNumber
   */
  public Integer getRandomNumber() {
    return randomNumber;
  }
  
  /**
   * Returns the value of printMessage.
   * @return printMessage
   */
  public String getPrintMessage() {
    return printMessage;
  }
  
  // === Mutators ===
  /**
   * Set array list values.
   */
    public void setArrayList() {
    setArrayList("");
  }
  
  /**
   * Set array list values.
   * @param word String to add as array list value.
   */
  public void setArrayList(String word) {
    this.arrayList.add(word);
  }
  
  /**
   * Generate & set random number.
   */
  public void setRandomNumber() {
    Random gen = new Random();
    this.randomNumber = gen.nextInt(this.arrayList.size());
  }
  
  /**
   * Set printMessage variable.
   */
  public void setPrintMessage() {
    setPrintMessage(randomNumber);
  }
  
  /**
   * Set printMessage variable.
   * @param messageNumber Index number of array list value.
   */
  public void setPrintMessage(Integer messageNumber) {
    this.printMessage = (String) arrayList.get(messageNumber); // Cast the object that is returned into String, since printMessage is a String variable.
  }
  
  // === Other methods ===
  
  /**
   * Generate & print a random number.
   */
    public void randomNumber() {
    setRandomNumber();
    System.out.printf("Number: %s%n",getRandomNumber());
  }

  /**
   * Print random message.
   */
  public void randomMessage() {
    setPrintMessage(getRandomNumber());
    System.out.printf("Word: \t%s%n",getPrintMessage());
  }
  
  /**
   * Populate/generate the array list.
   */
  public void generateList() {
    setArrayList("antling");
    setArrayList("baby");
    setArrayList("calf");
    setArrayList("chick");
    setArrayList("codling");
    setArrayList("cria");
    setArrayList("cub");
    setArrayList("duckling");
    setArrayList("elver");
    setArrayList("fawn");
    setArrayList("fledgling");
    setArrayList("foal");
    setArrayList("hake");
    setArrayList("hatchling");
    setArrayList("infant");
    setArrayList("joey");
    setArrayList("kit");
    setArrayList("kitten");
    setArrayList("larvae");
    setArrayList("nymph");
    setArrayList("pinkie");
    setArrayList("puggle");
    setArrayList("pup");
    setArrayList("puppy");
    setArrayList("pupae");
    setArrayList("snakelet");
    setArrayList("squab");
    setArrayList("tadpole");
  }

  /**
   * Introduce the user to the program.
   */
  public void welcome() {
    System.out.printf("Welcome to the \"WordUp\" program. Let's print random words!%n");
    System.out.printf("%n\t\tCreated by Smokie Lee");
    System.out.printf("%n\t---------------------------------------%n%n");
  }
  
  /**
   * Thank the user.
   */
  public void thanks() {
    System.out.printf("%n\t---------------------------------------%n");
    System.out.printf("\t\tThanks for playing!%n");
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create new object.
    WordUp w = new WordUp();

    // Welcome the user.
    w.welcome();
    
    // Generate the word list.
    w.generateList();
    
    // Generate the random number.
    w.randomNumber();
    
    // Print the word from the list.
    w.randomMessage();
    
    // Generate the random number.
    w.randomNumber();
    
    // Print the word from the list.
    w.randomMessage();
    
    // Thank the user.
    w.thanks();
  }
  
}
