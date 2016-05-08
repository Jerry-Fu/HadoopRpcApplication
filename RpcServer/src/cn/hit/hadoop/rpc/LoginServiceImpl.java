package cn.hit.hadoop.rpc;

public class LoginServiceImpl implements LoginServiceInterface {

	@Override
	public String login(String username, String password) {
		
		return username + " logged in successfully!";
	}

}
