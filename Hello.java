public class Hello {
	static void pattern(char ch1,char ch2,int num) {
		for(int i=1;i<num;i++) {
			System.out.print(ch1);
		}
		System.out.println("\n");
		for(int i=1;i<num;i++) {
			System.out.print(ch2);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		pattern('*','&',20);
		System.out.println("Welcome");
		pattern('.','%',9);
		System.out.println("Hyderabad");
		pattern('-','#',10);
		System.out.println("St Peters Engineering College....");
		}
}
