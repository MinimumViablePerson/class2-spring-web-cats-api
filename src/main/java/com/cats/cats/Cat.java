package com.cats.cats;

import java.util.ArrayList;

public class Cat {
  public static ArrayList<Cat> cats = new ArrayList<>();

  public Integer id;
  public String name;
  public Integer age;
  public Boolean likesCuddles;
  public Integer ownerId;

  static {
    new Cat(1, "Meowy", 4, true, 1);
    new Cat(2, "Fluffy", 5, true, 1);
    new Cat(3, "Scratchy", 2, false, 1);
    new Cat(4, "Ouchy", 1, false, 1);
  }

  public Cat(Integer id, String name, Integer age, Boolean likesCuddles, Integer ownerId) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.likesCuddles = likesCuddles;
    this.ownerId = ownerId;

    Cat.cats.add(this);
  }

  public void displayInfo() {
    String message = "This is %s, who is %s year(s) old. %s %s cuddles!\n";
    System.out.printf(message, this.name, this.age, this.name, this.likesCuddles ? "likes" : "doesn't like");
  }
}