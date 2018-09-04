import java.util.Scanner;

public class ADVmain {


	AdvancTTT ATTT=new AdvancTTT();
	static String AAI; 
	boolean Ahuman;
	static String Aplayer;
	boolean Acomputer;
	static String Auser;
	int Aorder;
	int xboard;
	int xPosition;
	int oChooseBoard=-1;
	AAI ai=new AAI();


	public void Astart(){
		Scanner k=new Scanner(System.in);
		System.err.println("choose x or o");
		Scanner scan=new Scanner(System.in);
		String Achoose=scan.nextLine();
		if(Achoose.equals("X")||Achoose.equals("x")){
			Aplayer="x";
			Auser="x";
			AAI="o";
			Aorder=1;
			Ahuman=true;
			Acomputer=false;
		}else if(Achoose.equals("O")||Achoose.equals("o")){
			Aplayer="o";
			Auser="o";
			AAI="x";
			Aorder=2;
			Ahuman=false;
			Acomputer=true;
		}else{
			System.err.println("invalid input!!!!");
			Astart();
		}
		System.err.println("Aplayer "+Aplayer );

		if(Auser.equals("x")){
			ATTT.initial();

			while (true) {
				if(Aorder==1){
					while(Ahuman){
						int inputboard;
						int inputposition;
						if(oChooseBoard==-1){
							System.err.print( Aplayer + " ,choose your location of board: ");
							inputboard=k.nextInt();
							xboard=inputboard;
							System.err.print( Aplayer + " ,choose your location of position: ");
							inputposition=k.nextInt();
							xPosition=inputposition;
							ai.currentboard=inputposition-1;
							System.err.println("board : "+inputboard+" position "+inputposition);
							while (ATTT.checkIfLegal(inputboard,inputposition)) {

								System.err.println("That slot is already taken or out of bounds, please try again .");
								inputboard=k.nextInt();
								xboard=inputboard;
								inputposition=k.nextInt();
								xPosition=inputposition;
								ai.currentboard=inputposition-1;
								System.err.println("board : "+inputboard+" position "+inputposition);
							} 
						}else{
							//System.err.print( Aplayer + " ,choose your location of board: ");
							inputboard=oChooseBoard;
							xboard=inputboard;
							ai.currentboard=inputboard-1;
							System.err.print( Aplayer + " ,choose your location of position: ");
							inputposition=k.nextInt();
							xPosition=inputposition;
							while (ATTT.checkIfLegal(inputboard,inputposition)) {
								System.err.println("That slot is already taken or out of bounds, please try again .");
								inputboard=oChooseBoard;
								xboard=inputboard;
								ai.currentboard=inputboard-1;
								System.out.println("and");
								inputposition=k.nextInt();
								xPosition=inputposition;
								System.err.println("board : "+inputboard+" position "+inputposition);

							
							
							
							}
						}
						ATTT.changeBoard(Aplayer, inputboard,inputposition);
						ATTT.print();
						if (AdvancTTT.checkIfWin()) {
							System.err.println("\nThe winner is " + Aplayer + " !");
							oChooseBoard=-1;
							break;
						}
						if (AdvancTTT.checkIfTie()) {
							System.err.println("\nThe game is a tie !");
							oChooseBoard=-1;
							break;
						}Aplayer =ATTT.changePlayer(Aplayer);
						Aorder=2;
						Ahuman=false;
						Acomputer=true;
						if (AdvancTTT.checkIfWin()||AdvancTTT.checkIfTie()) {
							System.err.println("");
							oChooseBoard=-1;
							break;
						}
					}
				}



				else if(Aorder==2){
					while(Acomputer){
						int inputboard;
						int inputposition;
						System.err.print( Aplayer + " ,choose your location :");
						System.out.println("");
						inputboard=xPosition;
						ai.currentboard=inputboard-1;
						System.out.println(" ");
						inputposition=ai.FindBestMove(AdvancTTT.adb);
						oChooseBoard=inputposition;
						


						ATTT.changeBoard(Aplayer, inputboard,inputposition);
						ATTT.print();
						if (AdvancTTT.checkIfWin()) {
							System.err.println("\nThe winner is " + Aplayer + " !");
							oChooseBoard=-1;
							break;
						}
						if (AdvancTTT.checkIfTie()) {
							System.err.println("\nThe game is a tie !");
							oChooseBoard=-1;
							break;
						}Aplayer = ATTT.changePlayer(Aplayer);
						Aorder=1;
						Ahuman=true;
						Acomputer=false;
					}
				}
				if (AdvancTTT.checkIfWin()||AdvancTTT.checkIfTie()) {
					System.err.println("");		
					oChooseBoard=-1;
					break;

				}



			}
		}//if player choose x



		else if(Auser.equals("o")){
			ATTT.initial();
			while (true) {

				if(Aorder==1){

					while(Ahuman){
						int inputboard;
						int inputposition;
						System.err.print( Aplayer + " ,choose your location: ");

						inputboard=xPosition;
						ai.currentboard=inputboard-1;
						inputposition=k.nextInt();
						oChooseBoard=inputposition;

						System.err.println("board : "+inputboard+" position "+inputposition);

						while (ATTT.checkIfLegal(inputboard,inputposition)) {
							System.err.println("That slot is already taken or out of bounds, please try again .");
							System.out.println("");
							inputboard=xboard;
							System.out.println(" ");
							inputposition=k.nextInt();
							oChooseBoard=inputposition;
							ai.currentboard=inputboard-1;
							System.err.println("board : "+inputboard+" position :"+inputposition);
						} 
						ATTT.changeBoard(Aplayer, inputboard,inputposition);
						ATTT.print();
						if (AdvancTTT.checkIfWin()) {
							System.err.println("\nThe winner is " + Aplayer + " !");
							oChooseBoard=-1;
							break;

						}
						if (AdvancTTT.checkIfTie()) {
							System.err.println("\nThe game is a tie !");
							oChooseBoard=-1;
							break;
						}
						Aorder=2;
						Ahuman=false;
						Acomputer=true;
						if (AdvancTTT.checkIfWin()||AdvancTTT.checkIfTie()) {
							System.err.println("");		
							oChooseBoard=-1;
							break;
						}
						//break;
					}//the end of while loop of human
				}//the end of order 1;


				else if(Aorder==2){

					Aplayer=ATTT.changePlayer(Aplayer);
					while(Acomputer){
						int inputboard;
						int inputposition;

						if(oChooseBoard==-1){
							System.err.print( Aplayer + " ,choose your location: ");
							inputboard=1;
							xboard=inputboard;
							
							System.out.println(" ");
							inputposition=ai.FindBestMove(AdvancTTT.adb);
							xPosition=inputposition;
							ai.currentboard=inputboard-1;
							System.err.println("board : "+inputboard+" position "+inputposition);

						}else{
							System.err.print( Aplayer + " ,choose your location: ");
							inputboard=oChooseBoard;
							xboard=inputboard;
							
							ai.currentboard=inputboard-1;
							inputposition=ai.FindBestMove(AdvancTTT.adb);
							xPosition=inputposition;
							System.err.println("board : "+inputboard+" position "+inputposition);
							/*if (ATTT.checkIfLegal(inputboard,inputposition)) {
								System.err.println("The board is full, so o can choose other board");
								inputboard=ai.chooseB;
								xboard=inputboard;
								ai.currentboard=inputboard-1;
								inputposition=ai.FindBestMove(AdvancTTT.adb);
								System.err.println("board : "+inputboard+" position "+inputposition);
							}*/
						}
						ATTT.changeBoard(Aplayer, inputboard,inputposition);

						ATTT.print();
						if (AdvancTTT.checkIfWin()) {
							System.err.println("\nThe winner is " + Aplayer + " !");
							oChooseBoard=-1;
							break;

						}
						if (AdvancTTT.checkIfTie()) {
							System.err.println("\nThe game is a tie !");
							oChooseBoard=-1;
							break;
						}Aplayer =ATTT.changePlayer(Aplayer);
						Aorder=1;
						Ahuman=true;
						Acomputer=false;
					}
				}
				if (AdvancTTT.checkIfWin()||AdvancTTT.checkIfTie()) {
					System.err.println("");		
					oChooseBoard=-1;
					break;

				}
			}
		}



	}//if player choose o

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean again=true;
		String PlayerChoose;
		Scanner scan=new Scanner(System.in);
		ADVmain m=new ADVmain();
		while(again){
			m.Astart();
			System.err.println("Do you want to play again?(Y or N)");
			PlayerChoose=scan.nextLine();
			if(!PlayerChoose.equals("Y")){
				System.err.println( "\n Game Over!!!!");
				again=false;
			}
		}
	}

}


