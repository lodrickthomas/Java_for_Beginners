public class DateTest
{
	public static void main(String[] args)
	{
		Date today = new Date(23,9,2014);
		Date tomorrow = new Date(9,2014);
		System.out.println("today is " + today.toString());
		System.out.println("tomorrow is " + tomorrow.toString());
		tomorrow.setDay(24);
		System.out.println("tomorrow is " + tomorrow.toString());
		System.out.println("today is again " + today.getDay() + "/" + today.getMonth() + "/" + today.getYear());
	}
}