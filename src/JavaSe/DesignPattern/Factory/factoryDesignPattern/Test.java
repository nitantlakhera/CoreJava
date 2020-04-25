package JavaSe.DesignPattern.Factory.factoryDesignPattern;

public class Test {
  public static void main(String args[]) {
	  computer pc = factoryClass.getComputer("pc", "2","500" , "2.9 G");
	  computer server = factoryClass.getComputer("server", "5","10000" , "4.10 G");
	  System.out.println(pc);
	  System.out.println(server);
  }
} 
