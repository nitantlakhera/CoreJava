package JavaSe.ExceptionHandling;

import java.io.IOException;

public class Test {
	  void m()throws IOException{  
	    throw new IOException("device error");//checked exception  
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  
	  public static void main(String args[]){  
	   Test obj=new Test();  
	   obj.p();  
	   System.out.println("normal flow...");  
	  }      
}  

class custom extends RuntimeException {
    private static final long serialVersionUID = 1L;
	public custom() {
        super();
    }
    public custom(String s) {
        super(s);
        System.out.println("custom exception " +s);
    }
}