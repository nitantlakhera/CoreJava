package JavaSe.DesignPattern.singleton.Test;

public class threadSafeSingleton {
 private static threadSafeSingleton instance;
 private threadSafeSingleton() {};
 public synchronized static threadSafeSingleton getInstance() {
	 if(instance == null) {
		 instance = new threadSafeSingleton();
	 }
 return instance;
 }
}
