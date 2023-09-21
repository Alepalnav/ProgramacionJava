package elementos;

public class JugadorException extends RuntimeException {

	public JugadorException() {
	}

	public JugadorException(String message) {
		super(message);
	}

	public JugadorException(Throwable cause) {
		super(cause);
	}

	public JugadorException(String message, Throwable cause) {
		super(message, cause);
	}

	public JugadorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
