
public class AI {


	public int minimax(String[] board, int depth,boolean turn){
		//System.err.println(TTT.checkIfTie()+"*****"+TTT.winner);
		if(TTT.checkIfWinner()&&TTT.winner.equals(main.user)){
			return -10;
		}if(TTT.checkIfWinner()&&TTT.winner.equals(main.AI)){
			return 10;
		}if(TTT.checkIfTie()){
			//System.err.println(TTT.checkIfTie()+"*****"+TTT.winner);
			return 0;
		}
		
		if(turn){
			int best =-100000;
			for(int i=0;i<9;i++){
				if(board[i].equals("_")){
				board[i]=main.AI;
				best = Math.max( best,minimax(board, depth+1, !turn) );
				board[i]="_";
				}
			}
			return best;
		}
		else{
			int best=100000;
			for(int i =0; i<9;i++){
				if(board[i].equals("_")){
					board[i]=main.user;
				
					best=Math.min(best, minimax(board,depth+1,!turn));
					board[i]="_";
				}
			}
			return best;
		}
	}

	public int FindBestMove(String board[]){
		int bestVal=-100000;
		int bestMove=-11111;
		for(int i=0;i<9;i++){
			if(board[i].equals("_")){
				board[i]=main.AI;
				int moveValue=minimax(board,0,false);
			//	System.err.println("if move to"+i+" the score is :" + moveValue);
				board[i]="_";
				if(moveValue>bestVal){
					bestMove=i+1;
					bestVal=moveValue;
				}
			}
		}
		return bestMove;
	}


}
