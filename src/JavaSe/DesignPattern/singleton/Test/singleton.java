package JavaSe.DesignPattern.singleton.Test;

public class singleton {
   public static void main(String args []) {
	   singleTonDesignePattern object1 = singleTonDesignePattern.getInstance();
       System.out.println(object1);
       singleTonDesignePattern object2 = singleTonDesignePattern.getInstance();
       System.out.println(object2);
   }
}