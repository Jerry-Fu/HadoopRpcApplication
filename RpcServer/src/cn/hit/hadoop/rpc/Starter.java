package cn.hit.hadoop.rpc;

import java.io.IOException;

import org.apache.hadoop.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Builder;
import org.apache.hadoop.ipc.RPC.Server;

public class Starter {

	public static void main(String[] args) throws HadoopIllegalArgumentException, IOException {
		
		//��������
		Builder builder = new RPC.Builder(new Configuration());
		//�������ݣ���ip���˿ڡ�Э�飨�ӿڣ���ʵ�� 
		builder.setBindAddress("192.168.10.92").setPort(10000).setProtocol(LoginServiceInterface.class).setInstance(new LoginServiceImpl());
		//����Socket������
		Server server = builder.build();
		server.start();
		//����ʽ���ȴ�������
	}
	
}


