package decorator;

/**
 * Decorator Pattern
 * 
 * 기존 뼈대 클래스는 유지하되 확장이 필요한 경우
 * 상속의 대안으로 활용
 * 
 * SOLID 원칙 중 OCP(개방폐쇄원칙)와 DIP(의존역전원칙) 을 따른다.
 * 
 * @author Komkoong
 *
 */
public class Main {

	public static void main(String[] args) {
		ICar audi = new Audi(1000);
		audi.showPrice();
	
		ICar audi3 = new Audi3(audi, "A3");
		audi3.showPrice();		

		ICar audi4 = new Audi4(audi, "A4");
		audi4.showPrice();		

		ICar audi5 = new Audi5(audi, "A5");
		audi5.showPrice();
	}

}
