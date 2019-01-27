import java.util.Scanner;

class Xo{
	public static void main(String args[]){
		
		String command = "cls";
		int player, scanner, x, y, w;
		mainClass ob[] = new mainClass[2];
		
		
		System.out.println("Please choose your player 1 or 2");
		Scanner sc = new Scanner(System.in);
		player = sc.nextInt();
		//if(player = 1)	
		ob[0] = new mainClass(player);
		
		System.out.println("Please choose your player 1 or 2");
		player = sc.nextInt();
		ob[1] = new mainClass(player);
		//if(player = 1)
	//this method for appear game field
	ob[1].getValue();
	
	do{
		System.out.println("1st plyer");
		System.out.println("Choose line");
		x = sc.nextInt();
		System.out.println("Choose column");
		y = sc.nextInt();
	    ob[0].setValue(x, y, 1);
		ob[0].getValue();
		if(ob[0].check() == -1)
		break;
	
		System.out.println("2st plyer");
		System.out.println("Choose line");
		x = sc.nextInt();
		System.out.println("Choose column");
		y = sc.nextInt();
	    ob[1].setValue(x, y, 2);
	    ob[1].getValue();
		if(ob[1].check() == -1)
		break;

		}while(!(ob[0].check() == -1) | !(ob[1].check() == -1));	
	}
}