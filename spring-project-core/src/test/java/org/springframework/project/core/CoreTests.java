package org.springframework.project.core;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.project.core.Core;

public class CoreTests {

	@Test
	public void test() {
		Core core = new Core();
		assertTrue(core.equals(core));
	}

}
