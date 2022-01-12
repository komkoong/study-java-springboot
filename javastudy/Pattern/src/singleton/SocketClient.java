package singleton;

/**
 * Singleton Pattern
 * �ϳ��� ��ü�� �����ϵ��� �����ڴ� private�� �����ϰ�
 * getInstance�� �̿��Ͽ� SocketClient�� ��ü�� ���
 * 
 * @author Komkoong
 *
 */
public class SocketClient {
	private static SocketClient socketClient = null;
	private SocketClient() {		
	}
	public static SocketClient getInstance() {
		if(socketClient == null)
			socketClient = new SocketClient();
		return socketClient;
	}
}
