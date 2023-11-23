package com.greatlearning.corejava;

public class HealthDriver {
  public static void main(String s[]) {
    Health h = new Health();
    h.age = 38;
    h.weight = 100.5f;
    h.bmi = 30.1f;
    System.out.println("Health stats: " + h.age + h.weight + h.bmi);
  }
}
