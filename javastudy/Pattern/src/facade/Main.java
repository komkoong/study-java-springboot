package facade;

/**
 * Facade Pattern
 * 
 * facade: 정면, 표면, 허울
 * 여러 개의 객체와 실제 사용하는 서브 객체의 복잡한 의존관계가 있을 때 중간에 facade 라는 객체를 두고
 * 여기서 제공하는 interface 만을 활용하여 기능을 사용하는 방식
 * facade는 자신이 가지고있는 각 클래스의 기능을 명확히 알아야 한다.
 * 
 * @author Komkoong
 *
 */
public class Main {

	public static void main(String[] args) {
		// not used facade
//		Ftp ftp = new Ftp("localhost", 22, "/home/etc");
//		ftp.connect();
//		ftp.mv();
//		
//		Writer writer = new Writer("test.txt");
//		writer.connect();
//		writer.write();
//		
//		Reader reader = new Reader("test.txt");
//		reader.connect();
//		reader.read();
//		
//		reader.disConnect();
//		writer.disConnect();
//		ftp.disConnect();	

		// use facade
		SftpClient client = new SftpClient("localhost", 22, "/home/etc", "test.txt");
		client.connect();
		client.write();
		client.read();
		client.disConnect();
	}

}
