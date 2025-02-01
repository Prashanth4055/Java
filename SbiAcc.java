
public class SbiAcc {
	String name;
	int acctNo;
	String mobile;
	int balance;
	public SbiAcc(String name, int acctNo, String mobile, int balance) {
		super();
		this.name = name;
		this.acctNo = acctNo;
		this.mobile = mobile;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "SbiAcc [name=" + name + ", acctNo=" + acctNo + ", mobile=" + mobile + ", balance=" + balance + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

int generateAccNo() {
	int max = 5000;
    int min = 500;
    int range = max - min + 1;

    int randNo = (int)(Math.random() * range) + min;
      
   return randNo;

}

public String toString1() {
	return "SBIAccount [name=" + name + ", acctNo=" + acctNo + ", mobile=" + mobile + ", balance=" + balance + "]";
}

void deposit(int amt){
	this.balance = this.balance + amt;
	System.out.println("successfully deposited..."+amt);
}

void checkBalance() {
	System.out.println("avl balance----->"+this.balance);
}
void withDraw(int amt) {

	if( this.balance > amt) {
		this.balance = this.balance - amt;
		System.out.println("successfully withDrawn..."+amt);
	}
	else {
		System.out.println("InSufficient Balance.....");
	}
}
}