package boardgame;

public class Board {
	private int rows;
	private int columns;
	// define uma matriz de pecas
	private Piece[][] pieces;
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		// não entendi
		pieces = new Piece[rows][columns];
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	// não entendi as classes abaixo
	public Piece piece(int rown, int column) {
		return pieces[rown][column];
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
		
	}
	
}
