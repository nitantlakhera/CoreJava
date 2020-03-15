package JavaSe.DesignPattern.Factory;

public class factorydesighpattern {
  public static void main(String args []){
	  oSFactoryMethod factory = new oSFactoryMethod();
	  OS os = factory.getInstance("apple");
	  os.spac();
  }
}
