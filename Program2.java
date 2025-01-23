import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
				char cod;
		do {
			System.out.println("please enter a char");
			ch=sc.next().charAt(0);
			if((ch>='A')&&(ch<='Z')) {
				System.out.println("ch is upper case");
			}
			else if((ch>='a')&&(ch<='z')) {
				System.out.println("lower case");
			}
			System.out.println("Do u want to repeat?if yes plss press y otherwise n");
			cod=sc.next().charAt(0);
		}while(cod=='y');
		System.out.println("ends");

	}

}
