package taxcalculator;
//Custom exception for non-Indian employees
public class CountryNotValidException extends Exception{
	
	public CountryNotValidException(String message) {
		super(message);
	}
}
