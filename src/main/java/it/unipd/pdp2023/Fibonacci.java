package it.unipd.pdp2023;

import java.util.ArrayList;

public class Fibonacci {

  static int fibonacci(int n) {
    if (n==0) return 0;
    else if (n==1) return 1;
    else return fibonacci(n-2)+fibonacci(n-1);
  }

  static int fibonacciSwitch(int n) {
    return switch(n) {
      case 0 -> 0;
      case 1 -> 1;
      default -> fibonacciSwitch(n-1)+fibonacciSwitch(n-2);
    };
  }

  ArrayList<Integer> memo = new ArrayList<>();

  {
    memo.add(0);
    memo.add(1);
  }

  public int fibonacciMemo(int i) {
    if (i<memo.size()) {
      return memo.get(i);
    } else {
      int res= fibonacciMemo(i-1) + fibonacciMemo(i-2);
      memo.add(res);
      return res;
    }
  }
}
