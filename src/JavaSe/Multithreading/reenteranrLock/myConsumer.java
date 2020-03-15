package JavaSe.Multithreading.reenteranrLock;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import JavaSe.Multithreading.MultipleThread.Color;

import static JavaSe.Multithreading.concurrentPackage.mainMethod.EOF;
public class myConsumer implements Runnable {
	private String color;
    private List<String> buffer;
    private ReentrantLock lock;
    public myConsumer(List<String> buffer , String color , ReentrantLock lock){
        this .buffer = buffer;
        this .color= color;
        this.lock = lock;
    }
    public void run(){
        while (true) {
                lock.lock();
        		try {
                if (buffer.isEmpty()) {
        			//lock.unlock();
          		     continue;
                  }
                  if (buffer.get(0).equals(EOF)) {
                      System.out.println(color + "Exiting.... ");
                      //lock.unlock();
                      break;
                  } else {
                      System.out.println(color + "Removed " + buffer.remove(0));
                  }
   	    		}finally { 
   	    		  lock.unlock();
        		}
        }
    }
}