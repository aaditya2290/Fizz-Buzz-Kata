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
		assertEquals("1",fizzBuzz.convert(1));
		assertEquals("2",fizzBuzz.convert(2));
	}

	@Test
	public void testForMultiplesOfThree()
	{
		assertEquals("Fizz",fizzBuzz.convert(9));
	}

	@Test
	public void testForMultiplesOfFive()
	{
		assertEquals("Buzz",fizzBuzz.convert(10));
	}

	@Test
	public void testForMultiplesOfThreeAndFive()
	{
		assertEquals("FizzBuzz",fizzBuzz.convert(30));
	}

	@Test
	public void testForInvalidInputs()
	{
		assertEquals("Please enter input between 1 and 100.",fizzBuzz.convert(-3));
		assertEquals("Please enter input between 1 and 100.",fizzBuzz.convert(300));
	}

	@Test
	public void printResultForNumbersFrom1To100()
	{
		for (int i=1;i<=100;i++)
			System.out.println(fizzBuzz.convert(i));
	}

}
