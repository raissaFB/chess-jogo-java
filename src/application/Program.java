package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
	
		ChessMatch chessMatch = new ChessMatch();
		
		
		while (true) {
		    UI.printBoard(chessMatch.getPieces());
		   System.out.println();
		   
		}
	}
}
