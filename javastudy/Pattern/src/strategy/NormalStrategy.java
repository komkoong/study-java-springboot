package strategy;

public class NormalStrategy implements EncodingStrategy {

	@Override
	public String encoding(String message) {
		return message;
	}

}
