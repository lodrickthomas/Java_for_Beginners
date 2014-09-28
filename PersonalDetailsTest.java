public class PersonalDetailsTest
{
	public static void main(String[] args)
	{
		PersonalDetails Person01 = new PersonalDetails("Unknown",0,"Unknown","Unknown");
		System.out.println(Person01.getFullName() + " " + "|" + " " + Person01.getAge() + " " + "|" + " " + Person01.getBirthDate() + " " + "|" + " " + Person01.getSex());
		Person01.setFullName("Simon", "Alexander", "Butler");
		Person01.setAge(27);
		Person01.setBirthDate(18,12,1986);
		Person01.setSex("male");
		System.out.println(Person01.getFullName() + " " + "|" + " " + Person01.getAge() + " " + "|" + " " + Person01.getBirthDate() + " " + "|" + " " + Person01.getSex());
		PersonalDetails Person02 = new PersonalDetails("Unknown",0,"Unknown","Unknown");
		Person02.setFullName("Sidney", "'The Tough'", "'Ramona-Loving'", "Kerr");
		Person02.setAge(42);
		Person02.setBirthDate(8,9,1972);
		Person02.setSex("No Thanks!");
		System.out.println(Person02.getFullName() + " " + "|" + " " + Person02.getAge() + " " + "|" + " " + Person02.getBirthDate() + " " + "|" + " " + Person02.getSex());
	}
}