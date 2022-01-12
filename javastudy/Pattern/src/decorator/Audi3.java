package decorator;

public class Audi3 extends AudiDecorator {

	public Audi3(ICar audi, String modelName) {
		super(audi, modelName, 1000);
	}
}
