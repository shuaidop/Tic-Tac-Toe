import java.util.ArrayList;

public class AdvancTTT {
	static ArrayList<String[]> adb = new ArrayList<String[]>(9);
	String palyer;
	public void initial(){
		for(int k=0; k<9;k++){
			String[] c=new String[9];
			for(int a=0;a<9;a++){
				c[a]="_";
			}
			adb.add(k, c);
		}
	}

	public void print(){
		for(int i=0;i<9;i+=3){
			for(int j=0;j<9;j+=3){
				System.err.println(adb.get(i)[j]+adb.get(i)[j+1]+adb.get(i)[j+2]+" "+adb.get(i+1)[j]+adb.get(i+1)[j+1]+adb.get(i+1)[j+2]+" "+adb.get(i+2)[j]+adb.get(i+2)[j+1]+adb.get(i+2)[j+2]);
			}System.err.println(" ");

		}
	}
	static String winner;
	public static boolean checkIfWinner(int i) { 

		// System.err.println(adb.get(i)[0]);
		if (adb.get(i)[0].equals(adb.get(i)[1]) && adb.get(i)[1].equals(adb.get(i)[2]) && (adb.get(i)[1].equals("x") || adb.get(i)[1].equals("o"))) {
			winner=adb.get(i)[0];//

			return true;
		} else if (adb.get(i)[3].equals( adb.get(i)[4]) && adb.get(i)[3].equals(adb.get(i)[5]) && (adb.get(i)[3].equals( "x") || adb.get(i)[3].equals( "o"))) {
			winner=adb.get(i)[3];//System.err.println(winner+2);

			return true;
		} else if (adb.get(i)[6].equals(adb.get(i)[7]) && adb.get(i)[6].equals( adb.get(i)[8]) && (adb.get(i)[6].equals( "x") || adb.get(i)[6].equals("o"))) {
			winner=adb.get(i)[6];//System.err.println(winner+3);

			return true;
		} else if (adb.get(i)[0].equals(adb.get(i)[3]) && adb.get(i)[0].equals(adb.get(i)[6]) && (adb.get(i)[0].equals("x") ||adb.get(i)[0].equals("o"))) {
			winner=adb.get(i)[0];//System.err.println(winner+4);

			return true;
		} else if (adb.get(i)[1].equals(adb.get(i)[4]) && adb.get(i)[1].equals(adb.get(i)[7]) && (adb.get(i)[1].equals("x") || adb.get(i)[1].equals( "o"))) {
			winner=adb.get(i)[1];//System.err.println(winner+5);

			return true;
		}else if (adb.get(i)[2].equals(adb.get(i)[4]) && adb.get(i)[2].equals(adb.get(i)[6]) && (adb.get(i)[2].equals("x") || adb.get(i)[2].equals("o"))) {
			winner=adb.get(i)[2];//System.err.println(winner+6);

			return true;
		} else if (adb.get(i)[0].equals(adb.get(i)[4]) && adb.get(i)[0].equals(adb.get(i)[8]) && (adb.get(i)[0].equals("x") || adb.get(i)[0] .equals("o"))) {
			winner=adb.get(i)[0];//System.err.println(winner+7);

			return true;
		} else if (adb.get(i)[2].equals(adb.get(i)[5]) && adb.get(i)[2] .equals(adb.get(i)[8]) && (adb.get(i)[2].equals( "x") || adb.get(i)[2] .equals( "o"))) {
			winner=adb.get(i)[2];//System.err.println(winner+8);

			return true;
		} else {
			return false;
		}

	}
	static String winnerh;
	public static boolean Hcheck(int i){
		if (adb.get(i)[0].equals("_")&&adb.get(i)[1].equals(adb.get(i)[2]) && (adb.get(i)[1].equals("x") || adb.get(i)[1].equals("o"))) {
			winner=adb.get(i)[1];//

			return true;
		} else if( adb.get(1)[2].equals("_")&&adb.get(i)[0].equals(adb.get(i)[1]) && (adb.get(i)[1].equals("x") || adb.get(i)[1].equals("o"))) {
			winnerh=adb.get(i)[0];//

			return true;

		}
		else if (adb.get(i)[5].equals("_")&&adb.get(i)[3].equals(adb.get(i)[4]) && (adb.get(i)[3].equals( "x") || adb.get(i)[3].equals( "o"))) {

			winnerh=adb.get(i)[3];//System.err.println(winnerh+2);

			return true;
		} 
		else if (adb.get(i)[3].equals("_")&&adb.get(i)[4].equals(adb.get(i)[5]) && (adb.get(i)[4].equals( "x") || adb.get(i)[4].equals( "o"))) {

			winnerh=adb.get(i)[4];//System.err.println(winnerh+2);

			return true;
		} 	        	
		else if ( adb.get(i)[6].equals("_")&&adb.get(i)[7].equals( adb.get(i)[8]) && (adb.get(i)[7].equals( "x") || adb.get(i)[7].equals("o"))) {
			winnerh=adb.get(i)[7];//System.err.println(winnerh+3);

			return true;
		}else if ( adb.get(i)[8].equals("_")&&adb.get(i)[6].equals( adb.get(i)[7]) && (adb.get(i)[7].equals( "x") || adb.get(i)[7].equals("o"))) {
			winnerh=adb.get(i)[7];//System.err.println(winnerh+3);

			return true;
		} 

		else if (adb.get(i)[0].equals("_")&&adb.get(i)[3].equals(adb.get(i)[6]) && (adb.get(i)[3].equals("x") ||adb.get(i)[3].equals("o"))) {
			winnerh=adb.get(i)[3];//System.err.println(winnerh+4);

			return true;
		}
		else if (adb.get(i)[6].equals("_")&&adb.get(i)[0].equals(adb.get(i)[3]) && (adb.get(i)[0].equals("x") ||adb.get(i)[0].equals("o"))) {
			winnerh=adb.get(i)[0];//System.err.println(winnerh+4);

			return true;
		}  
		else if (adb.get(i)[7].equals("_")&&adb.get(i)[1].equals(adb.get(i)[4]) && (adb.get(i)[1].equals("x") || adb.get(i)[1].equals( "o"))) {
			winnerh=adb.get(i)[1];//System.err.println(winnerh+5);

			return true;
		}else if ( adb.get(i)[1].equals("_")&&adb.get(i)[4].equals(adb.get(i)[7]) && (adb.get(i)[4].equals("x") || adb.get(i)[4].equals( "o"))) {
			winnerh=adb.get(i)[4];//System.err.println(winnerh+5);

			return true;
		}
		else if (adb.get(i)[6].equals("_")&&adb.get(i)[2].equals(adb.get(i)[4]) && (adb.get(i)[2].equals("x") || adb.get(i)[2].equals("o"))) {
			winnerh=adb.get(i)[2];//System.err.println(winnerh+6);

			return true;
		}
		else if ( adb.get(i)[2].equals("_")&&adb.get(i)[4].equals(adb.get(i)[6]) && (adb.get(i)[4].equals("x") || adb.get(i)[4].equals("o"))) {
			winnerh=adb.get(i)[4];//System.err.println(winnerh+6);

			return true;
		}

		else if ( adb.get(i)[0].equals("_")&&adb.get(i)[4].equals(adb.get(i)[8]) && (adb.get(i)[4].equals("x") || adb.get(i)[4] .equals("o"))) {
			winnerh=adb.get(i)[4];//System.err.println(winnerh+7);

			return true;
		} 
		else if ( adb.get(i)[8].equals("_")&&adb.get(i)[0].equals(adb.get(i)[4]) && (adb.get(i)[0].equals("x") || adb.get(i)[0] .equals("o"))) {
			winnerh=adb.get(i)[0];//System.err.println(winnerh+7);

			return true;
		} 
		else if (adb.get(i)[8].equals("_")&&adb.get(i)[2] .equals(adb.get(i)[5]) && (adb.get(i)[2].equals( "x") || adb.get(i)[2] .equals( "o"))) {
			winnerh=adb.get(i)[2];//System.err.println(winnerh+8);

			return true;
		}
		else if (adb.get(i)[2].equals("_")&&adb.get(i)[5] .equals(adb.get(i)[8]) && (adb.get(i)[5].equals( "x") || adb.get(i)[5] .equals( "o"))) {
			winnerh=adb.get(i)[5];//System.err.println(winnerh+8);

			return true;
		} else {
			return false;
		}
	}

	static public boolean checkIfWin(){
		boolean win=false;
		for(int i=0; i<9;i++){
			win=checkIfWinner(i);
			if(win){
				break;
			}
		}
		return win;
	}

	static public boolean HcheckWin(){
		boolean win=false;
		for(int i=0;i<9;i++){
			win=Hcheck(i);
			if (win){
				break;
			}
		}
		return win;
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
		// System.err.println("enter the fuction");
		for (int i = 0; i < 9; i++) {
			for(int j=0;j<9;j++){
				//System.err.println("first  "+i);
				//System.out.println(adb.get(i)[j]+"*******" +i+" "+j);
				if (checkIfWinner(i)==true||adb.get(i)[j].equals("_")) {

					return false;
				}
			}
		}
		return true;
	}
	public boolean checkIfLegal(int chooseboard, int chooseposition) {

		if ((chooseboard >9 || chooseboard <= 0)||(chooseposition >9 || chooseposition <= 0 )) {
			return true;
		} else if (adb.get(chooseboard-1)[chooseposition-1].equals("x")||adb.get(chooseboard-1)[chooseposition-1].equals("o")) {
			System.err.println(chooseboard+"and"+chooseboard);
			return true;
		} 

		return false;
	}

	public void changeBoard(String player, int chooseboard, int chooseposition) {
		System.err.println(player+" choose board: "+ chooseboard+" position: "+ chooseposition);
		adb.get(chooseboard-1)[chooseposition-1] = player;

	}

	public static boolean finalcheck(){
		for (int i = 0; i < 9; i++) {
			for(int j=0;j<9;j++){
				if (adb.get(i)[j].equals("_")) {
					return false;
				}
			}
		}
		return true;
	}
}
