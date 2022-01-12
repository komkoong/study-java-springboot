package adapter;

/**
 * Adapter Pattern
 * 
 * 실생활에서는 110v를 220v로 또는 그 반대로 변환해주는 돼지코 같은 역할
 * 호한성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 함
 * 
 * SOLID 에서는 OCP(개방폐쇄원칙)을 따름
 * 
 * @author Komkoong
 *
 */
public class ElectronicAdapter implements IElectronic110 {

    private IElectronic220 electronic220;

    public ElectronicAdapter (IElectronic220 electronic220){
        this.electronic220 = electronic220;
    }

    @Override
    public void powerOn() {
    	electronic220.connect();
    }
}