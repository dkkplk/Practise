package userhome;

public class GetUserHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userHome = System.getProperty("user.home");
		System.out.println("User Home is : "+userHome);
	}

}
