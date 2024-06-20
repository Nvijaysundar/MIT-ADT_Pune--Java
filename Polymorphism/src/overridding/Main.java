package overridding;
class SamsungGen1{
	void call()
	{
		System.out.println("Voice call");
	}
	void email()
	{
		System.out.println("Gmail-Service");
	}
}
class SamsungGen2 extends SamsungGen1{
	void call()
	{
		System.out.println("Voice call & Video Call");
	}
	void camera()
	{
		System.out.println("Can take pictures and videos");
	}
}
public class Main {
	public static void main(String[] args) {
		SamsungGen2 ob = new SamsungGen2();
		ob.call();
	}
}
