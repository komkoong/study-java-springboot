package adapter;

public class Main {
    public static void connect(IElectronic110 electronic110){
    	electronic110.powerOn();
    }
    
	public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        IElectronic110 cleanerWithAdapter = new ElectronicAdapter(cleaner);
        connect(cleanerWithAdapter);
	}

}
