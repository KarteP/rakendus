package com.homework;

public class Main {
  public static void main(String[] args) {

    SumController controller = new SumController();
    controller.sum(1, 3);
    controller.sum(2, 3);
    controller.sum(1, 3);
    controller.sum(2, 3);
    controller.sum(5, 6);
    controller.sumSearch(3, true);
    controller.sumSearch(6, false);
  }
}