package Day8_InstanceOfInterface;

public class Samsung implements Phone {
	@Override
	public void call() {
		System.out.println("Calling using Samsung");
	}
	@Override
	public void message() {
		System.out.println("messaging using Smasung");
	}
	

}
