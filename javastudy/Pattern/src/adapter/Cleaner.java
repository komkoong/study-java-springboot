package adapter;

public class Cleaner implements IElectronic220 {

	@Override
	public void connect() {
        System.out.println("220v 청소기 ON");
	}
}
