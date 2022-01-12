package decorator;

public class Audi5 extends AudiDecorator {

	public Audi5(ICar audi, String modelName) {
		super(audi, modelName, 3000);
	}

}
