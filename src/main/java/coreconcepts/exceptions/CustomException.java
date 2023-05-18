package coreconcepts.exceptions;

public class CustomException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8512519113923903334L;
	private String errocode="Unknown Exception";
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message,String errorCode) {
		
		super(message);
		this.errocode=errorCode;
	}

	/**
	 * @return the errocode
	 */
	public String getErrocode() {
		return errocode;
	}



}
