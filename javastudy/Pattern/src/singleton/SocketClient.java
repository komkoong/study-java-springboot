package singleton;

/**
 * Singleton Pattern
 * 하나의 객체만 존재하도록 생성자는 private로 선언하고
 * getInstance를 이용하여 SocketClient의 객체를 사용
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
