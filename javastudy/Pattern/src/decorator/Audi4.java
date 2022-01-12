package decorator;

public class Audi4 extends AudiDecorator {

	public Audi4(ICar audi, String modelName) {
		super(audi, modelName, 2000);
	}
}
