package JavaSe.DesignPattern.singleton.Test;

public class singleTonDesignePattern {
      private static final singleTonDesignePattern instance = new singleTonDesignePattern();
      private singleTonDesignePattern() {};
      public static singleTonDesignePattern getInstance() {
    	  return instance;
      }
}
