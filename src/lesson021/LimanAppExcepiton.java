package lesson021;

public class LimanAppExcepiton extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private EErrorType eErrorType;

	public LimanAppExcepiton(EErrorType eErrorType) {
		super(eErrorType.getMessage());
		this.eErrorType = eErrorType;
	}
	
	public LimanAppExcepiton(EErrorType eErrorType, String message) {
		super(message);
		this.eErrorType = eErrorType;
	}

	public EErrorType geteErrorType() {
		return eErrorType;
	}

}