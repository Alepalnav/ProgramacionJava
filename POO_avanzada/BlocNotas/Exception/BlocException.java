package POO_avanzada.BlocNotas.Exception;

public class BlocException extends Exception {

	public BlocException() {
	}

	public BlocException(String message) {
		super(message);
	}
	
	public BlocException(Throwable cause) {
		super(cause);
	}

	public BlocException(String message, Throwable cause) {
		super(message, cause);
	}

	public BlocException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
