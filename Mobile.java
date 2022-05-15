package week1.day1;

public class Mobile {

	public void makeCall()
	{
		System.out.println("Make a Call");
	}
	
	public void sendMsg()
	{
		System.out.println("Send Text Message");
	}
	
	public static void main(String[] args) {
				
		Mobile moto = new Mobile();
			moto.makeCall();
			moto.sendMsg();
			
	}

}
