package jwdd;

import java.util.*; 

public class Jwddd {
	/*
	* Cloud Computing, Data Computing Laboratory
	* Department of Computer Science
	* Chungbuk National University
	*/
	
	public static void main(String[] args) throws Exception {
		
		Scanner menu = new Scanner(System.in);
		Scanner id_string = new Scanner(System.in);
		int number = 0;
		
		while(true)
		{
		System.out.println("                                                            ");
		System.out.println("                                                            ");
		System.out.println("------------------------------------------------------------");
		System.out.println("             Amazon AWS Control Panel using SDK             ");
		System.out.println("                                                            ");
		System.out.println(" Cloud Computing, Computer Science Department               ");
		System.out.println("                            at Chungbuk National University ");
		System.out.println("------------------------------------------------------------");
		System.out.println(" 1. list instance             2. available zones            ");
		System.out.println(" 3. start instance            4. available regions          ");
		System.out.println(" 5. stop instance             6. create instance            ");
		System.out.println(" 7. reboot instance           8. list images                ");
		System.out.println("                             99. quit                       ");
		System.out.println("------------------------------------------------------------");
		System.out.print("Enter an integer: ");
		
		menu.nextInt();


		switch(number) {
			case 1:
				//listInstances();
				break;
			case 99:
				System.exit(number);
				break;
		
		}
		}
	}
}
