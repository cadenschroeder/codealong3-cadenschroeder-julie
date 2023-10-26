package codeAlong4;

import java.util.ArrayList;

public class ArrayExample {

  private int[] numbers;
  private ArrayList<String> coolWords;

  public ArrayExample(){
    this.numbers = new int[10];
    this.populateArray();
    this.coolWords = new ArrayList<>();
    this.coolWords.add("Andy");
    this.coolWords.add("Django");
    this.coolWords.add("CodeAlong");
    hello();
  }

  private void populateArray() {
    for(int i = 0; i < 10; i++) {
      this.numbers[i] = i;
    }
  }

  private void hello(){
    this.coolWords.add("hi");
    this.coolWords.add("hola");
    this.coolWords.add("hello");
  }

  public void printArray() {
    for(int i = 0; i <= 10; i++) {
      System.out.println("numbers[" + i + "] is " + this.numbers[i]);
    }
  }

  public void changeArrayList() {
    for (String word : this.coolWords) {
      System.out.println(word);
      if (word.equals("Andy")) {
        this.coolWords.remove(word);
      }
    }
  }
}
