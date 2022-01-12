package singleton;

public class Message1 {
	private SocketClient socketClient = null;
	
	public Message1() {
		socketClient = SocketClient.getInstance();		
	}
	
	public SocketClient getSocketClient() {
		return socketClient;
	}
}
