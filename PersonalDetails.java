public class PersonalDetails
{
	private String fullName;
	private int ageNum;
	private String birthDate;
	private String sexType;

	public PersonalDetails(String name, int age, String dob, String sex)
	{
		fullName = name;
		ageNum = age;
		birthDate = dob;
		sexType = sex;
	}

	public String getFullName()
	{
		return "Name: " + fullName;
	}

	public String getAge()
	{
		return "Age: " + ageNum;
	}

	public String getBirthDate()
	{
		return "Birth Date: " + birthDate;
	}

	public String getSex()
	{
		return "Sex: " + sexType;
	}

	public void setFullName(String firstName, String middleName1, String middleName2, String lastName)
	{
		fullName = firstName + " " + middleName1 + " " + middleName2 + " " + lastName;
	}

	void setFullName(String firstName, String middleName1, String lastName)
	{
		fullName = firstName + " " + middleName1 + " " + lastName;
	}

	void setFullName(String firstName, String lastName)
	{
		fullName = firstName + " " + lastName;
	}
	
	void setBirthDate(int d, int m, int y)
	{
		birthDate = d + "/" + m + "/" + y;
	}
	
	void setAge(int age)
	{
		ageNum = age;
	}	
	
	void setSex(String sex)
	{
		sexType = sex;
	}	
}