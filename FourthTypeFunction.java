public class FourthTypeFunction {
	static float anyCountryToIndRupees(String country,int amt) {
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
		int usDollar=100,ukPounds=200,uaeDirhams=50;
		float rupees=anyCountryToIndRupees("USA",usDollar);
		System.out.println("indain rupees------USA:"+rupees);
		rupees=anyCountryToIndRupees("UK",ukPounds);
		System.out.println("indain rupees------UK:"+rupees);
		rupees=anyCountryToIndRupees("UAE",uaeDirhams);
		System.out.println("indain rupees------UAE:"+rupees);


	}

}
