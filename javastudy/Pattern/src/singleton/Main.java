package singleton;

public class Main {

	public static void main(String[] args) {
		Message1 msg1 = new Message1();
		Message2 msg2 = new Message2();
		
		SocketClient client1 = msg1.getSocketClient();
		SocketClient client2 = msg2.getSocketClient();
		
		System.out.println("�� ��ü�� ������? " + client1.equals(client2));
	}
}
