package com.greatlearning.corejava.health;

public class HealthDriver {
  public static void main(String s[]) {
    Health h = new Health();
    h.age = 38;
    h.weight = 100.5f;
    h.bmi = 30.1f;
    System.out.println("Health stats, age: " + h.age + " Weight: " + h.weight + " BMI: " + h.bmi);
  }
}
