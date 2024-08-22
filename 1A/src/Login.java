
public class Login {
	private static Login instance;
	private Login()
	{
		
	}
	public static Login getInstance()
	{
		if(instance==null)
		{
			synchronized(Login.class)
			{
				if(instance==null)
				{
					instance = new Login();
					
				}
			}
		}
		return instance;
	}
	public void logging(String msg) {
		System.out.println("Login page details : "+msg);
	}

}
