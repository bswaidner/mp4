import static org.junit.Assert.*;

import javax.annotation.Nonnull;

import org.junit.Test;

import jenkins.model.IdStrategy;
import jenkins.model.IdStrategy.CaseInsensitive;

public class IDStrategyTest {

	@Test
	public void filenameTest() {
		 IdStrategy caseInsensitive = new CaseInsensitive();
		 assertEquals(caseInsensitive.idFromFilename("[a-z0-9_. -]+"),"[a-z0-9_. -]+");
	}
	
	@Test
	public void outputTest() {
		 IdStrategy caseInsensitive = new CaseInsensitive();
		 assertTrue(caseInsensitive.idFromFilename("~hello") == "~hello");
	}
	
}
