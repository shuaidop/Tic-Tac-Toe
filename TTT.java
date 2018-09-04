import java.util.Scanner;

public class TTT {
	static String board []=new String[9];
	String palyer;
	public void initial(){
		for(int i=0;i<9;i+=3){
			board[i]="_";
			board[i+1]="_";
			board[i+2]="_";
		}
	}

	public void print(){
		for(int i=0;i<9;i+=3){
			System.err.println(board[i]+board[i+1]+board[i+2]);;
		}
	}
	static String winner;
	public static boolean checkIfWinner() {
		if (board[0].equals(board[1]) && board[1].equals(board[2]) && (board[1].equals("x") || board[1].equals("o"))) {
			winner=board[0];//System.err.println(winner+1);
			return true;
		} else if (board[3].equals( board[4]) && board[3].equals(board[5]) && (board[3].equals( "x") || board[3].equals( "o"))) {
			winner=board[3];//System.err.println(winner+2);
			return true;
		} else if (board[6].equals(board[7]) && board[6].equals( board[8]) && (board[6].equals( "x") || board[6].equals("o"))) {
			winner=board[6];//System.err.println(winner+3);
			return true;
		} else if (board[0].equals(board[3]) && board[0].equals(board[6]) && (board[0].equals("x") ||board[0].equals("o"))) {
			winner=board[0];//System.err.println(winner+4);
			return true;
		} else if (board[1].equals(board[4]) && board[1].equals(board[7]) && (board[1].equals("x") || board[1].equals( "o"))) {
			winner=board[1];//System.err.println(winner+5);
			return true;
		} else if (board[2].equals(board[4]) && board[2].equals(board[6]) && (board[2].equals("x") || board[2].equals("o"))) {
			winner=board[2];//System.err.println(winner+6);
			return true;
		} else if (board[0].equals(board[4]) && board[0].equals(board[8]) && (board[0].equals("x") || board[0] .equals("o"))) {
			winner=board[0];//System.err.println(winner+7);
			return true;
		} else if (board[2].equals(board[5]) && board[2] .equals(board[8]) && (board[2].equals( "x") || board[2] .equals( "o"))) {
			winner=board[2];//System.err.println(winner+8);
			return true;
		} else {
			return false;
		}

	}



	public  String changePlayer(String player) {
		String newTurn = "e";
		if (player == "o") {
			newTurn = "x";
		}
		if (player == "x") {
			newTurn = "o";
		}
		return newTurn;
	}
	public static boolean checkIfTie() {
		for (int i = 0; i < 9; i++) {
			if (checkIfWinner()==true||board[i].equals("_")) {
				return false;
			}
		}
		return true;
	}
	public boolean checkIfLegal(int choose) {

		if (choose >9 || choose <= 0 ) {
			return true;
		} else if (board[choose-1] == "x" || board[choose-1] == "o") {
			return true;
		} 

		return false;
	}

	public void changeBoard(String player, int choose) {
		System.err.println(player);
		board[choose-1] = player;

	}
	public static boolean finalcheck(){
		for(int i =0; i<9;i++){
			if (board[i].equals("_")){
				return false;
			}
		}
		return true;
	}


}



	 

