import java.util.Scanner;


public class main {

	//static Boolean turn;
	static String player;
	static String user;
	TTT TTT=new TTT();
	static String AI; 
	boolean human;
	boolean computer;
	int order;



	public void start(){
		Scanner k=new Scanner(System.in);

		System.err.println("choose x or o");	

		Scanner scan=new Scanner(System.in);
		String choose=scan.nextLine();
		if(choose.equals("X")||choose.equals("x")){
			player="x";
			user="x";
			AI="o";
			order=1;
			human=true;
			computer=false;
			//turn=false;
		}else if(choose.equals("O")||choose.equals("o")){
			player="o";
			user="o";
			AI="x";
			order=2;
			human=false;
			computer=true;
			//turn=true;
		}else{
			System.err.println("invalid input!!!!");
			start();
		}
		String[] s = new String[9];
		for(int i = 0; i<9; i++){
			s[i]="_";
		}
		if(player.equals("x")){
			TTT.initial();

			while (true) {
				if(order==1){
					while(human){
						System.err.print( player + " ,choose your location :");
						int input=k.nextInt();
						while (TTT.checkIfLegal(input)) {

							System.err.println("That slot is already taken or out of bounds, please try again .");

							input= k.nextInt();

						} 

						TTT.changeBoard(player, input);

						TTT.print();
						if (TTT.checkIfWinner()) {
							System.err.println("\nThe winner is " + player + " !");
							break;

						}
						if (TTT.checkIfTie()) {
							System.err.println("\nThe game is a tie !");
							break;
						}player = TTT.changePlayer(player);
						order=2;
						human=false;
						computer=true;
						if (TTT.checkIfWinner()||TTT.checkIfTie()) {
							System.err.println("");		
							break;
						}
						//break;
					}//the end of while loop of human
				}//the end of order 1;



				else if(order==2){
					AI ai=new AI();
					//player=TTT.changePlayer(player);
					//System.err.println("player"+player);
					while(computer){
						System.err.print( player + " ,choose your location :");
						int input=ai.FindBestMove(TTT.board);
						System.err.println("input "+input);
						while (TTT.checkIfLegal(input)) {
							System.err.println("That slot is already taken or out of bounds, please try again .");
							input= k.nextInt();
						} 
						TTT.changeBoard(player, input);
						TTT.print();
						if (TTT.checkIfWinner()) {
							System.err.println("\nThe winner is " + player + " !");
							break;
						}
						if (TTT.checkIfTie()) {
							System.err.println("\nThe game is a tie !");
							break;
						}player = TTT.changePlayer(player);
						//System.err.println("pppp");
						order=1;
						human=true;
						computer=false;
					}
				}
				if (TTT.checkIfWinner()||TTT.checkIfTie()) {
					System.err.println("");		
					break;

				}



			}
		}//if player choose x




		else if(player.equals("o")){

			TTT.initial();
			while (true) {
				if(order==1){
					while(human){
						System.err.print( player + " ,choose your location :");
						int input=k.nextInt();


						while (TTT.checkIfLegal(input)) {
							System.err.println("That slot is already taken or out of bounds, please try again .");
							input= k.nextInt();
						} 
						TTT.changeBoard(player, input);
						TTT.print();
						if (TTT.checkIfWinner()) {
							System.err.println("\nThe winner is " + player + " !");
							break;

						}
						if (TTT.checkIfTie()) {
							System.err.println("\nThe game is a tie !");
							break;
						}//player = TTT.changePlayer(player);
						order=2;
						human=false;
						computer=true;
						if (TTT.checkIfWinner()||TTT.checkIfTie()) {
							System.err.println("");		
							break;
						}
						//break;
					}//the end of while loop of human
				}//the end of order 1;

				else if(order==2){
					AI ai=new AI();
					player=TTT.changePlayer(player);
					//System.out.println(player+"***");
					while(computer){
						System.err.print( player + " ,choose your location :");
						int input=ai.FindBestMove(TTT.board);
						System.err.println("input "+input);
						//System.err.println("computer");
						while (TTT.checkIfLegal(input)) {

							System.err.println("That slot is already taken or out of bounds, please try again .");

							input= k.nextInt();

						} 

						TTT.changeBoard(player, input);

						TTT.print();
						if (TTT.checkIfWinner()) {
							System.err.println("\nThe winner is " + player + " !");
							break;

						}
						if (TTT.checkIfTie()) {
							System.err.println("\nThe game is a tie !");
							break;
						}player = TTT.changePlayer(player);

						//System.err.println("pppp");
						order=1;
						human=true;
						computer=false;
					}
				}
				if (TTT.checkIfWinner()||TTT.checkIfTie()) {
					System.err.println("");		
					break;

				}
			}
		}



	}//if player choose o

	public static void main(String[] args) {
		boolean again=true;
		String PlayerChoose;
		Scanner scan=new Scanner(System.in);
		main m=new main();
		while(again){
			m.start();
			System.err.println("Do you want to play again?(Y or N)");
			PlayerChoose=scan.nextLine();
			if(!PlayerChoose.equals("Y")){
				System.err.println( "\n Game Over!!!!");
				again=false;
			}
		}
	}
}
