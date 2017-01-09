package ch.mgysel.mockito;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoProblem {

	@Mock
	private OrmSupport ormSupport;
	@Mock
	private ValidatorFactory validatorFactory;
	@Mock
	private Validator validator;
	private MainComponent underTest;

	@Before
	public void setUp() throws Exception {
		when(validatorFactory.createValidator()).thenReturn(validator);
		underTest = new MainComponent(validatorFactory, ormSupport);
	}

	@Test
	public void test() {
		// illegal mock instruction, should fail!
		when(ormSupport).thenReturn(null);
		underTest.doSomething();
	}

}
