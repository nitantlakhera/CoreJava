package JavaSe.DesignPattern.Factory.factoryDesignPattern;

public abstract class computer {
    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getHDD();
	@Override
	public String toString() {
		return "computer [getRAM()=" + getRAM() + ", getCPU()=" + getCPU() + ", getHDD()=" + getHDD() + "]";
	}	
}
