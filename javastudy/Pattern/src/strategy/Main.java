package strategy;

/**
 * Strategy Pattern
 * 
 * 전략패턴이라 불리며 객체지향의 꽃
 * 유사한 행위를 캡슐화하여 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아닌
 * 전략(Strategy)만 변경하여 유연하게 확장하는 패턴
 * 
 * SOLID 중에서 OCP(개방폐쇄원칙)와 DIP(의존역전원칙)을 따른다.
 * 
 * NormalStrategy, Base64Strategy : Strategy Method를 가진 객체
 * Encoder : 전략객체를 사용하는 Context
 * Main : 전략객체를 생성해 Context에 주입하는 Client
 * 
 * @author Komkoong
 *
 */
public class Main {

	public static void main(String[] args) {
		Encoder encoder = new Encoder();

		//strategy1 : base64
		EncodingStrategy base64 = new Base64Strategy();
		
		//strategy2 : normal
		EncodingStrategy normal = new NormalStrategy();
		
		//strategy3 : append
		EncodingStrategy append = new AppendStrategy();
		
		String message = "hello world";


		encoder.setEncodingStrategy(base64);
		String messageBase64 = encoder.getMessage(message);
		System.out.println("Base64: " + messageBase64);

		encoder.setEncodingStrategy(normal);
		String messageNormal = encoder.getMessage(message);
		System.out.println("Normal: " + messageNormal);

		encoder.setEncodingStrategy(append);
		String messageAppend = encoder.getMessage(message);
		System.out.println("Append: " + messageAppend);
	}

}
