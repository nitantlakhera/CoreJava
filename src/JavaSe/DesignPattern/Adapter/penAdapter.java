package JavaSe.DesignPattern.Adapter;

public class penAdapter implements pen {
   pilotPen pp = new pilotPen();
	public void write(String param) {
		pp.mark(param);
	}

}
