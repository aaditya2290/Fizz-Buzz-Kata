package main;

public class FizzBuzz {

	public String convert(int fizzBuzzInput)
	{
		if (fizzBuzzInput<1 || fizzBuzzInput>100)
			return "Please enter input between 1 and 100.";
		else
			if (fizzBuzzInput%15==0)
				return "FizzBuzz";
			else
				if (fizzBuzzInput%3==0)
					return "Fizz";
				else
					if (fizzBuzzInput%5==0)
						return "Buzz";
					else	
						return String.valueOf(fizzBuzzInput);
	}

}
