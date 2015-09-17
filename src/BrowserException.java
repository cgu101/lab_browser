 public class BrowserException extends RuntimeException{
    	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public BrowserException() {}

    	//Constructor that accepts a message
    	public BrowserException(String message)
    	{
    		super(message);
    	}
 }