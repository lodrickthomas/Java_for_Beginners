public class Date
{
	public int day;
	public int month;
	public int year;

	public Date(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	
	public Date(int m, int y)
	{
		day = 0;
		month = m;
		year = y;
	}
	
	public Date()
	{
		day = 0;
		month = 0;
		year = 0;
	}

	public String toString()
	{
		return day + "/" + month + "/" + year;
	}

	public int getDay()
	{
		return day;
	}

	public int getMonth()
	{ 
		return month;
	}

	public int getYear()
	{
		return year;
	}

	public void setDay(int d)
	{
		day = d;
	}

	public void setMonth(int m)
	{
		month = m;
	}

	public void setYear(int y)
	{
		year = y;
	}
}