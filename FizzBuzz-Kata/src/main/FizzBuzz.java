package main;

public class FizzBuzz {

	public String convert(int fizzBuzzInput)
	{
		if (fizzBuzzInput%3==0)
			return "Fizz";
		else	
			return String.valueOf(fizzBuzzInput);
	}

}
