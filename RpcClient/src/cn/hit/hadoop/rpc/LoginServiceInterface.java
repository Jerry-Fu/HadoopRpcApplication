package cn.hit.hadoop.rpc;

public interface LoginServiceInterface {
	//Э��汾��
	public static final long versionID=1L;
	public String login(String username,String password);

}
