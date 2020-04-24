package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		// Instanciar uma partida de xadrez e imprimir o tabuleiro
		ChessMatch chessMatch = new ChessMatch();
		// Criar uma funcao para imprimir as pecas
		// UI= User interface 
		UI.printBoard(chessMatch.getPieces());
		
		
		
		
	}

}
