package facade;

public class Ftp {
	 private String host;
	 private int port;
	 private String path;
	 
	 public Ftp(String host, int port, String path) {
		 this.host = host;
		 this.port = port;
		 this.path = path;
	 }
	 
	 public void connect() {
		 System.out.println("FTP " + host + ":" + port + " connected");
	 }
	 	 
	 public void mv() {
		 System.out.println("FTP path: " + path);
	 }

	 public void disConnect() {
		 System.out.println("FTP " + host + ":" + port + " disconnected");
	 }
}
