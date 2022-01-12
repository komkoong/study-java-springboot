package observer;

public class Button {
	private String name;
	private IButtonListener listener;
	
	public Button(String name) {
		this.name = name;
	}
	
	public void addListener(IButtonListener listener) {
		this.listener = listener;
	}
		
	public void click(String message) {
		listener.onClick(message);
	}
}
