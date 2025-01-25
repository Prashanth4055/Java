public class SubStringDemoV2 {
	public static void main(String[] args) {
		String name1="Rebel star";
		String name2="Prabhas";
		System.out.println("Before Swapping....");
		System.out.println("name1---->"+name1);
		System.out.println("name2---->"+name2);
		String t;
		name2=name2+name1;
		name1=name2.substring(0,name2.length()-name1.length());
		name2=name2.substring(name1.length());
	    System.out.println("Ater swapping....");
		System.out.println("name1---->"+name1);
		System.out.println("name2---->"+name2);
		}
}


