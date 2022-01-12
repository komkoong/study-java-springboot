package facade;

public class Writer {
	// file writer
	
	private String fileName;
	
	public Writer(String fileName) {
		this.fileName = fileName;
	}
	
	public void connect() {
		String message = String.format("Writer %s 로 연결 합니다.", fileName);
		System.out.println(message);
	}
	
	public void write() {
		String message = String.format("Writer %s 에 내용을 기록합니다.", fileName);
		System.out.println(message);
	}
	
	public void disConnect() {
		String message = String.format("Writer %s 로 연결 종료합니다.", fileName);
		System.out.println(message);
	}

}
