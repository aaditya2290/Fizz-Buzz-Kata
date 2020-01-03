package test;

import static org.junit.Assert.*;
import main.FizzBuzz;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz;

	@Before
	public void initializeFizzBuzz()
	{
		fizzBuzz=new FizzBuzz();
	}

	@Test
	public void testForOtherNumbers()
	{
		assertEquals(1,fizzBuzz.convert(1));
		assertEquals(2,fizzBuzz.convert(2));
	}

}
