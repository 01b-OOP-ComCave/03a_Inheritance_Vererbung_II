package com.cc.java;

public class Cat {

  private String firstName;
  private String furColor;
  private int age; 
  private boolean isFemale;

  private int counter;

  private final String ERROR_0 = "Error";
  private final String ERROR_1 = "This is an inappropriate question!";
  private final String ERROR_2 = "I've told you once!";
  private final String ERROR_3 = "Talk to the hand!";
  private final String ERROR_4 = "1#!?&&%";



  public Cat(String firstName, String furColor, int age, boolean isFemale) {
    this.firstName = firstName;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
  }

  public String getStringAttributes(String op) {
    switch (op) {
      case "#name":
        return firstName;
      case "#color":
        return furColor;
      default:
        return ERROR_0;
    }
  }

  public int getAge() throws CatException {
    if (!isFemale) {
      return age;
    } else {
      throw new CatException(checkCompliance());
    }
  }


private String checkCompliance(){

       counter++;

        switch (counter) {
            case 1:
                return ERROR_1; // 1st time
            case 2:
                return ERROR_2; // 2nd time
            case 3:
                return ERROR_3; // 3rd time 
            default:
                return ERROR_4; //4th ++
        }

    }

}
  
class CatException extends Exception {
  public CatException(String message){
    super(message);
  }
}