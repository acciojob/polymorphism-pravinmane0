package com.driver;

public class Main {

  static class Product {
    public int product(int x, int y) {
      return x*y;
    }
    public int product(int x, int y, int z) {
      return x*y*z;
    }
    public double product(double x, double y) {
      return x*y;
    }
  }
   public static void main(String[] args) {
   Product p = new Product();
     
        System.out.println("Product of 2 numbers: " + p.product(5, 4));

        System.out.println("Product of 3 numbers: " + p.product(5, 4, 2));

        System.out.println("Product of 2 doubles: " + p.product(2.5, 4.0));
   }
}
