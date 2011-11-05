package org.springframework.project.aj;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.project.aj.AnAspect;
import org.springframework.project.core.Core;

public class AnAspectTests {

	@Test
	public void test() {
		Core core = new Core();
		AnAspect aspect = new AnAspect(core);
		assertTrue(core.equals(aspect.getCore()));
	}

}
