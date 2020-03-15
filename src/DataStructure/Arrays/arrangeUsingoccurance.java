package DataStructure.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
public class arrangeUsingoccurance {
    
  public static void main(String args []) {
	  int array[] = {1,1,1,1,3,3,3,2,2,5,5,5,5,5};
	  arrange(array);
  }
       
  public static void arrange(int array[]) {
	 StringBuilder string = null;
	 
	 Comparator<String> com = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}   
	 };
	 
	 TreeSet<String> list = new TreeSet<String>(com);
     for(int i = 0 ; i<array.length ; i++) {
    	 string = new StringBuilder();
         for(int j = 0 ; j<array.length ; j ++) {
        	 if(array[j] == array[i]) {
        		 string =  string.append(array[i]);
        	 }
         }
         list.add(string.toString());
     }
     System.out.println(list); 
   }
}