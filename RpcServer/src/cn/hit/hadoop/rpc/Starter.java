package cn.hit.hadoop.rpc;

import java.io.IOException;

import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Builder;
import org.apache.hadoop.ipc.RPC.Server;

public class Starter {

	public static void main(String[] args) throws HadoopIllegalArgumentException, IOException {
		
		//发布服务
		Builder builder = new RPC.Builder(new Configuration());
		//服务内容，绑定ip、端口、协议（接口）、实例 
		builder.setBindAddress("192.168.10.92").setPort(10000).setProtocol(LoginServiceInterface.class).setInstance(new LoginServiceImpl());
		//启动Socket服务器
		Server server = builder.build();
		server.start();
		//阻塞式，等待被调用
	}
	
}


