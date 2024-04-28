package week1;

public class Learnoperators {
	public static void main(String[] args) {
		//to run->shortcut key->ctrl+f11
		//Arithmatic operators 
		int a=10;
		int b=5;
		System.out.println(a+b);//Addition
		System.out.println(a-b);//Subtraction
		System.out.println(a*b);//multiply
		System.out.println(a/b);//quotient
		System.out.println(a%b);//remainder
		
		//Assignment operators "="
		
		
		//comparison operator
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//Logical operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b&&a<b);//if any condition is false it will false
		System.out.println(a>b||a<b); //if any one is True it will n=be true
		System.out.println(a++); //postincrement a=10
		System.out.println(a);// a=11
		System.out.println(++a);//preincrement a=12
	}

}
