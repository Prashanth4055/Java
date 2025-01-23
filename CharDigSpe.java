import java.util.Scanner;
public class CharDigSpe {

	public static void main(String[] args) {
		char ch;
		Scanner input=new Scanner(System.in);			
		System.out.println("enter a char:");
          ch=input.next().charAt(0);
			if((ch>='A'&& ch<='Z')||(ch>='a'&&ch<='z')){
				System.out.println("this input character is a aplhabet");
			}
				else if((ch>='0')&&(ch<='9')) {
				System.out.println("this input character is a digit");
				}
				else {
					System.out.println("this input character is a special character");
				}
				
	}
}


                            