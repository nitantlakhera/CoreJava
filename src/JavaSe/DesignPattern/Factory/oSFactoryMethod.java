package JavaSe.DesignPattern.Factory;

public class oSFactoryMethod {
    public OS getInstance(String osType) {
    	if(osType.equals("android")) {
    		return new android();
    	}else if (osType.equals("apple")) {
    		return new apple();
    	}else {
    		return new windows();
    	}
    }
}
