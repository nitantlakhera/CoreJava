package JavaSe.DesignPattern.Adapter;

public class school {

	public static void main(String[] args) {
     pen p = new penAdapter();
	 assighnment ass = new assighnment();
     ass.setP(p);
     ass.writeAssignment("hello i am going to writhe this");
	}

}
