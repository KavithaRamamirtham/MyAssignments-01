package week1;

public class LearnSwitchCase {
	public static void main(String[] args) {
		char browser='c';
		switch(browser) {
		case 'c':System.out.println("open chrome browser");
		break;
		case 'e':System.out.println("open Edge browser");
		break;
		case 'f':System.out.println("open Firefox browse");
		break;
		case 'i':System.out.println("Open IE browser");
		break;
		default:System.out.println("open default browser");
		}
		
	}

}
//remove break statement if i give 'e'
//it will give output is e,f,i