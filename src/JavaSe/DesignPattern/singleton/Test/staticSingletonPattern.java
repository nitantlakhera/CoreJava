package JavaSe.DesignPattern.singleton.Test;

public class staticSingletonPattern {
  private static staticSingletonPattern instance;
  private staticSingletonPattern() {};
  static {
	  try {
		  instance = new staticSingletonPattern();
	  } catch (Exception e) {
		  throw new RuntimeException("Exception occured while creating singleton instance");
	}
  }
  public static staticSingletonPattern getInstance() {
	  return instance;
  }
}
