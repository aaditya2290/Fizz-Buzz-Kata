package main;

public class FizzBuzz {

	public String convert(int fizzBuzzInput)
	{
		if (fizzBuzzInput%3==0)
			return "Fizz";
		else
			if (fizzBuzzInput%5==0)
				return "Buzz";
			else	
				return String.valueOf(fizzBuzzInput);
	}

}
