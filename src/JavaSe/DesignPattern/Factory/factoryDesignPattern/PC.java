package JavaSe.DesignPattern.Factory.factoryDesignPattern;

public class PC extends computer{
   private String ram;
   private String hdd;
   private String cpu;
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}
	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
}