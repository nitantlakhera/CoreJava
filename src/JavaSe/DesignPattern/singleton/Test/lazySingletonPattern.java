package JavaSe.DesignPattern.singleton.Test;

public class lazySingletonPattern {
  private static lazySingletonPattern instance;
  private lazySingletonPattern() {};
  public static lazySingletonPattern getInstance() {
	  if(instance == null) {
		  instance = new lazySingletonPattern();
	  }
  return instance;
  }
}
