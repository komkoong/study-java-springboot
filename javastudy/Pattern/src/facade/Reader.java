package facade;

public class Reader {
	//file reader

	private String fileName;
	
	public Reader(String fileName) {
		this.fileName = fileName;
	}
	
	public void connect() {
		String message = String.format("Reader %s 로 연결 합니다.", fileName);
		System.out.println(message);
	}
	
	public void read() {
		String message = String.format("Reader %s 의 내용을 읽어옵니다.", fileName);
		System.out.println(message);
	}
	
	public void disConnect() {
		String message = String.format("Reader %s 로 연결 종료합니다.", fileName);
		System.out.println(message);
	}

}
