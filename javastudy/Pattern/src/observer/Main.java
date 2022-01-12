package observer;

/**
 * Observer Pattern
 * 
 * EvnetListener가 observer pattern의 대표적 예
 * 변화가 일어났을 때 미리 등록된 다른 클래스에 통보해주는 패턴
 * 
 * @author Komkoong
 *
 */
public class Main {

	public static void main(String[] args) {
		Button button = new Button("myButton");
		button.addListener(new IButtonListener() {
			@Override
			public void onClick(String message) {
				System.out.println(message);
			}
			
		});
		button.click("msaage: click1");
		button.click("msaage: click2");
		button.click("msaage: click3");
		button.click("msaage: click4");
	}
}
