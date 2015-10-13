package es.uvigo.esei.xcs.mocks;

/**
 * Exception to be thrown when an entity does not have a mandatory id.
 * 
 * @author Miguel Reboiro Jato
 *
 */
public class MissingIdException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new instance of {@link MissingIdException}.
	 *
	 */
	public MissingIdException() {
		super();
	}

	/**
	 * 
	 * Constructs a new instance of {@link MissingIdException}.
     *
     * @param  message the detail message.
     * @param cause the cause.  (A {@code null} value is permitted,
     * and indicates that the cause is nonexistent or unknown.)
     * @param enableSuppression whether or not suppression is enabled
     *                          or disabled
     * @param writableStackTrace whether or not the stack trace should
     *                           be writable
	 */
	public MissingIdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * 
	 * Constructs a new instance of {@link MissingIdException}.
	 *
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A <tt>null</tt> value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
	 */
	public MissingIdException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * 
	 * Constructs a new instance of {@link MissingIdException}.
	 *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
	 */
	public MissingIdException(String message) {
		super(message);
	}

	/**
	 * 
	 * Constructs a new instance of {@link MissingIdException}.
	 *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A <tt>null</tt> value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
	 */
	public MissingIdException(Throwable cause) {
		super(cause);
	}
}
