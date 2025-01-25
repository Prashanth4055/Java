public class SubStringDemo {
	public static void main(String[] args) {
		String name1="Rebel star";
		String name2="Prabhas";
		System.out.println("Before Swapping....");
		System.out.println("name1---->"+name1);
		System.out.println("name2---->"+name2);
		String t;
		name1=name1+name2;
		name2=name1.substring(0,name1.length()-name2.length());
		name1=name1.substring(name2.length());
				
		System.out.println("Ater swapping....");
		System.out.println("name1---->"+name1);
		System.out.println("name2---->"+name2);
		}
}
