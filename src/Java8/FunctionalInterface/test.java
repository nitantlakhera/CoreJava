package Java8.FunctionalInterface;

public class test {
  public static void main(String args[]) {
	  FunctionInterface func = (n) -> (Math.sqrt(n));
	  double result  = func.squareRoot(4);
      System.out.println(result);
  }
} 
