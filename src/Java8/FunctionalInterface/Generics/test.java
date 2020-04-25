package Java8.FunctionalInterface.Generics;

import java.util.ArrayList;
import java.util.List;

public class test {
  public static void main(String args[]) {
	  List list = new ArrayList();
	  list.add("abc");
	  list.add(new Integer(5));
	  for(Object obj : list){
	  	  String str=(String) obj; 
	  }
  }
}
