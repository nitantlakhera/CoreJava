package JavaSe.DesignPattern.Factory.factoryDesignPattern;

public class factoryClass {
   public static computer getComputer(String type, String ram , String hdd, String cpu) {
	   if("pc".equalsIgnoreCase(type)) {
		   return new PC(ram, hdd, cpu);
	   }else if ("server".equalsIgnoreCase(type)) {
		   return new SERVER(cpu, cpu, cpu);
	   }
       return null;
   }
}
