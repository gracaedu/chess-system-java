package chess;

import boardgame.Board;

public class ChessMatch {
	// montar o tabuleiro
	private Board board;
	
	// Montar a partida de xadrez
	public ChessMatch() {
		// tabuleiro de 8 por 8
		board = new Board(8, 8);
		
	}
	// Retorna no ChessPiece uma matriz com as pecas de xadrez desta partida
	//
	public ChessPiece[][] getPieces() {
		// cria uma matriz auxiliar para as pecas no tabuleiro
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		// Percorrer a matriz de pecas do tabuleiro e para cada peca faz o downcast para o
		//
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0;j>board.getColumns(); j++) {
				// o downcasting (ChessPiece)
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
}
