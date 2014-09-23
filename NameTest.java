public class NameTest
{
	public static void main(String[] args)
	{
		// instantiation
		Name myName = new Name("Simon", "Alexander", "Butler");
		Name yourName = new Name("Raymond", "Williams");
		/*Name aName = new Name("Kerr");
		System.out.println("myName: " + myName.toString());
		System.out.println("yourName: " + yourName.toString());*/
		Name someName = new Name();
		System.out.println("myName first name: " + myName.getFirst());
		yourName.setLast("Brown");
		System.out.println("yourName: " + yourName.toString());
		someName.setName("Briony", "Seirra", "Harleton");
		System.out.println("someName: " + someName.toString());
	}
}