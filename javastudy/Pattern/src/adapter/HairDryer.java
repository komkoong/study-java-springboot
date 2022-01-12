package adapter;

public class HairDryer implements IElectronic110 {
	@Override
	public void powerOn() {
		System.out.println("110v 헤어드라이기 ON");
	}
}
