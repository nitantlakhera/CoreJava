package Java8.FunctionalInterface;

public interface FunctionInterface {
	public double squareRoot(int x); 
	default void normalFun() 
	{ 
	   System.out.println("Hello"); 
	}
}
