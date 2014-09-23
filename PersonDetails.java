public class PersonDetails
{
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int day;
	private int month;
	private int year;
	private String sex;

	public Name(String f, String m, String l)
	{
		firstName = f;
		middleName = m;
		lastName = l;
	}

	public Age(int a)
	{
		age = a;
	}

	public BirthDate(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}

	public Sex(String s)
	{
		sex = s;
	}
}