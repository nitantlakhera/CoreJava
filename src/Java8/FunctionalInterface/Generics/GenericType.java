package Java8.FunctionalInterface.Generics;

public class GenericType<T> {
  private T t;
  
	public T getT() {
	return t;
}

public void setT(T t) {
	this.t = t;
}

public static void main(String args [] ) {
	 GenericType<String> g = new GenericType<String>();
	 g.setT("elaknit");
	 System.out.println(g.getT());
	 GenericType<Integer> gen = new GenericType<Integer>();
	 gen.setT(10);
	 System.out.println(gen.getT());
  }
}
