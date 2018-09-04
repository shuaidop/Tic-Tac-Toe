import java.util.ArrayList;

public class AAI {
	AdvancTTT ATTT=new AdvancTTT();
	int currentboard=0;

	public int score(int boardnum,int depth){
		if(AdvancTTT.checkIfWin()&&AdvancTTT.winner.equals(ADVmain.Auser)){
			return -100+depth;
		}if(AdvancTTT.checkIfWin()&&AdvancTTT.winner.equals(ADVmain.AAI)){
			return 100-depth;
		}if(AdvancTTT.HcheckWin()&&AdvancTTT.winnerh.equals(ADVmain.Auser)){
			return -3;
		}if(AdvancTTT.HcheckWin()&&AdvancTTT.winnerh.equals(ADVmain.AAI)){
			return 3;
		}
		else{
			return 0;
		}

	}

int chooseB;
	public int Aminimax(ArrayList<String []> board, int depth,boolean turn, int alpha, int bata,int numb){

		if(AdvancTTT.checkIfWin()||AdvancTTT.checkIfTie()||cutoffTest(board,depth)){
			chooseB=numb;
			return score(numb,depth);
		}

		if(turn){
			int best =-100000;
			int prebest;
			for(int i=0;i<9;i++){
				if(board.get(numb)[i].equals("_")){
					board.get(numb)[i]=ADVmain.AAI;
					prebest = Math.max( best,Aminimax(board, depth+1, !turn,alpha,bata,i) );
					board.get(numb)[i]="_";
					if(prebest>best) {
						best=prebest;
					}
					if(prebest>=bata) {
						
						return best;
					}
					if(prebest>alpha) {
						alpha=prebest;
					}

				}

			}
			return best;
		}
		else{
			int best=100000;
			int prebest;
			for(int i =0; i<9;i++){
				if(board.get(numb)[i].equals("_")){
					board.get(numb)[i]=ADVmain.Auser;
					prebest=Math.min(best, Aminimax(board,depth+1,!turn,alpha,bata,i));
					board.get(numb)[i]="_";
					if(prebest<best){
						best=prebest;
					}if(prebest<=alpha){
						return best;
					}if(prebest<bata){
						bata=prebest;
					}

				}
			}
			return best;
		}
	}

	public int FindBestMove(ArrayList<String []> board){
		int bestVal=-2000000000;
		int bestMove=-1111111111;
		int alpha=-10000000;
		int bata=100000000;
		for(int i=0;i<9;i++){
			if(board.get(currentboard)[i].equals("_")){
				board.get(currentboard)[i]=ADVmain.AAI;
				int moveValue=Aminimax(board,0,false,alpha,bata,i);
				board.get(currentboard)[i]="_";
				if(moveValue>=bestVal){
					bestMove=i+1;
					bestVal=moveValue;
				}
			}
		}
		return bestMove;
	}


	public boolean cutoffTest(ArrayList<String []> board2, int depth){
		if(depth==5){
			return true;
		}else{
			return false;
		}
	}

}
