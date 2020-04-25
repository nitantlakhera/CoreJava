package JavaSe.Collections.HashMap.CustomKey;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

public class MainClass {
  @SuppressWarnings("deprecation")
public static void main(String args[]) {
	  HashMap<Employee, String > hashMap = new HashMap<Employee, String>();
	  Employee tcs = new Employee();
	  tcs.setId(1);
	  tcs.setName("Nitant");
	  tcs.setDob(new Date(1987,2,1));
	  tcs.setSalary(new BigDecimal(400000));
	  hashMap.put(tcs, "TCS");
	  
	 
	  Employee cg = new Employee();
	  cg.setId(1);
	  cg.setName("Nitant");
	  cg.setDob(new Date(1987,2,1));
	  cg.setSalary(new BigDecimal(400000));
	  hashMap.put(cg, "TCS");
	  
	  System.out.println(hashMap);
  }
}
