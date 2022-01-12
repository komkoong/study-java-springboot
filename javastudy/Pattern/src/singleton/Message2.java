package singleton;

public class Message2 {
	private SocketClient socketClient = null;
	
	public Message2() {
		socketClient = SocketClient.getInstance();		
	}
	
	public SocketClient getSocketClient() {
		return socketClient;
	}
}
