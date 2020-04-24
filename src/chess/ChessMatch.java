package chess;

import application.UI;
import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	// montar o tabuleiro
	private Board board;
	
	// Montar a partida de xadrez
	public ChessMatch() {
		// tabuleiro de 8 por 8
		board = new Board(8, 8);
		initialSetup();
		
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
	// Inicia a partida de xadrez
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 4));
		
	}
}
