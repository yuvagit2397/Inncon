package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks_Example {

	@Before("@feat")
	
	public void before() {
		System.out.println(" before hook & order 3");
	}
	@Before(order=2)
	public void before1() {
		System.out.println(" before1 hook & order 2");
	}
	
	@Before(order=1)
	public void before2() {
		System.out.println(" before2 hook & order 1");
	}
	@After("@feat")
	public void after() {
		System.out.println(" after hook & order 3");
	}
	@After(order=2)
	public void after1() {
		System.out.println(" after1 hook & order 2");
	}
	@After(order=1)
	public void after2() {
		System.out.println(" after2 hook & order 1");
	}
}
