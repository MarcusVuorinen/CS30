package Exercise1;

public abstract class UEmployee 
{
	private String firstName;
	private String lastName;
	
	public UEmployee(String fn, String ln, double sal)
	{
		firstName = fn;
		lastName = ln;
	}
	
	public String toString()
	{
		return (firstName + " " + lastName);
	}
	
	abstract double pay(double period);


}