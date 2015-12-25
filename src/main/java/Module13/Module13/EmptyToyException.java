/**
 * �author Tetiana Horbachova
 * @version 1. 0
 */
package Module13.Module13;

public class EmptyToyException extends Exception{
	
	public EmptyToyException(String s) {
	      super(s);
	   }

	public String getDetailsMessage(){
		return super.getMessage();
	}
	}
