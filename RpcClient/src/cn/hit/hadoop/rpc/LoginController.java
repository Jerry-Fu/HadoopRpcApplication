package cn.hit.hadoop.rpc;

import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class LoginController {

	public static void main(String[] args) throws Exception {
		//���ɵ�Socket������󣬲�ʵ��ҵ��ӿ�
		LoginServiceInterface proxy = RPC.getProxy(LoginServiceInterface.class, 1L, new InetSocketAddress("192.168.10.92", 10000), new Configuration());
		
		String result = proxy.login("Jerry", "123456");
		
		System.out.println(result);
	}
	
	
}
