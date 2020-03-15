package JavaSe.DesignPattern.Factory.factory;

public class mainMethod {
   public static void main(String args[]) {
	   mobiles sony = factoryClass.getMobiles("sony");
	   sony.show();
	   mobiles samsung = factoryClass.getMobiles("samsung");
	   samsung.show();
       mobiles apple = factoryClass.getMobiles("apple");
       apple.show();
   }
}
