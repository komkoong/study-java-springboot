package singleton;

/**
 * Singleton Pattern
 * 
 * 하나의 객체만 생성하도록 생성자를 private로 선언 
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
