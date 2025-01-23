import java.util.Scanner;
public class Case {
public static void main(String[] args) {
char ch;
Scanner sc=new Scanner(System.in);
char cod;
int upAsc= (int)'A';
int lowAsc=(int)'a';
int diff=upAsc-lowAsc;
if(diff<0) diff=-1*diff;
do {
System.out.println("please enter a char");
ch=sc.next().charAt(0);
if((ch >='A')&&(ch <='Z')) {
System.out.println("ch is upper case");
ch=(char)(ch+diff);
}
else if((ch >='a')&&(ch <='z')) {
ch=(char)(ch-diff);
System.out.println("ch is lower case");
}
System.out.println("after conversion....ch---->"+ch);
System.out.println("do you want repeat?if yes pls press y otherwise n");
cod=sc.next().charAt(0);
if(cod=='n') cod=0;
else cod=1;
}while(cod==1);
System.out.println("program ends");
		
}
	} 
