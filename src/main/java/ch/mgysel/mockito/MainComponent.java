package ch.mgysel.mockito;

public class MainComponent {

	private Validator validator;
	private OrmSupport ormSupport;

	public MainComponent(ValidatorFactory validatorFactory, OrmSupport ormSupport) {
		this.ormSupport = ormSupport;
		validator = validatorFactory.createValidator();
	}

	public void doSomething() {

	}

}
