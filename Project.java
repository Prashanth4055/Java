import java.util.Scanner;
public class Project {
	static float m1(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("USA")) {
			res=amt*78.67f;
			}
		else if(country.equalsIgnoreCase("UK")) {
			res=amt*120.56f;
		}
		else if(country.equalsIgnoreCase("UAE")) {
			res=amt*20.56f;
		}
		return res;
	}

	public static void main(String[] args) {
		int rt;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter country....");
		String country=sc.next();
		String cC=getAmtDetails(country);
		System.out.println("please enter"+cC);
		if(cC.equalsIgnoreCase("country not found")) {
			System.out.println("not able to process");
		}
		else {
			int amt=sc.nextInt();
		System.out.println("For this "+country+" for this amt"
				+ "="+amt+"indain amt="+m1(country,amt));
		}
		System.out.println("do you want to repeat the criteria press 1");
		rt=sc.nextInt();
		}while(rt==1);
			System.out.println("Transaction is successfull");
		}
	
	static String getAmtDetails(String country) {
		 String res="";
				 if(country.equalsIgnoreCase("USA")) {
					 res="Dollar";
				 }
					 else if(country.equalsIgnoreCase("UK")) {
						 res="Pounds";
					 }
					 else if(country.equalsIgnoreCase("UAE")) {
						 res="Dirhams";
					 }
					 else {
						 res="country not Found";
						 }
		 return res;
	}
}
