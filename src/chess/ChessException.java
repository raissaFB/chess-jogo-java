package chess;

import boardgame.BoarException;

public class ChessException extends BoarException {
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
