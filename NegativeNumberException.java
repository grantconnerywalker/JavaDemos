package fall2012;

public class NegativeNumberException extends Exception {
	private int number;
	public NegativeNumberException() {}
	public NegativeNumberException(String message) {
		super(message);
	}
	public NegativeNumberException(int number) {
		super("Error: value can't be < 0, input = " + number);
		this.number = number;
	}
	public String toString() {
		return "Error: value can't be < 0, input = " + number;
	}
	

}
