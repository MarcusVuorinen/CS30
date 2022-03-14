package Exercise1;
//gf
public class Staff extends UEmployee
{
	private String title;
	
	public Staff(String fn, String ln, double sal, String JobTitle)
	{
		super(fn, ln, sal, JobTitle);
		title = JobTitle;
	}
	

}
