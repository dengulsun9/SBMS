package in.dengulsun9;

public class UserDao {

	public void init()
	{
		System.out.println("Getting db connection....");
	}
	
	public void getData()
	{
		System.out.println("Getting data from db...");
	}
	
	public void destroy()
	{
		System.out.println("Closing db connection....");
	}
}
