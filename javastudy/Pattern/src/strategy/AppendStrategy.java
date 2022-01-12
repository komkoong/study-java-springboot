package strategy;

public class AppendStrategy implements EncodingStrategy {

	@Override
	public String encoding(String message) {
		return "ABC" + message;
	}

}
