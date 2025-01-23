
public class IncrDecrOrder {

	public static void main(String[] args) {
		int x=900,y=800,z=600;
		if((z>y)&&(y>x)){
			System.out.println("Increasing Orrder!!!!");
		}
		else if((x>y&&(y>z))) {
			System.out.println("Decreasing order");
		}
		else {
			System.out.println("not in order");
		}

	}

}
