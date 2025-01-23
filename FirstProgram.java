
public class FirstProgram {
	static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++)
			if(n%i==0)
				count++;
	if (count==2) return true;
	else return false;
		
	}

	public static void main(String[] args) {
		int num=13;
		if(isPrime(num)==true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
