package facade;

/**
 * Facade Class
 * 
 * @author Komkoong
 *
 */
public class SftpClient {
	private Ftp ftp;
	private Writer writer;
	private Reader reader;
	
	public SftpClient (String host, int port, String path, String fileName) {
		ftp = new Ftp(host, port, path);
		writer = new Writer(fileName);
		reader = new Reader(fileName);
	}
	
	public SftpClient (Ftp ftp, Reader reader, Writer writer) {
		this.ftp = ftp;
		this.writer = writer;
		this.reader = reader;
	}
	
	public void connect() {
		ftp.connect();
		ftp.mv();
		writer.connect();
		reader.connect();
	}
	
	public void write() {
		writer.write();
	}
	
	public void read() {
		reader.read();
	}
	
	public void disConnect() {
		reader.disConnect();
		writer.disConnect();
		ftp.disConnect();
	}
}
