package JavaSe.DesignPattern.Adapter.adapter;

public class IPhoneToAndroidAdapter implements Android {
	Iphone iphone;
	public IPhoneToAndroidAdapter(Iphone iphone) {
	  this.iphone =  iphone;
	}
	public void charge() {
	  iphone.charge();
	}
}
