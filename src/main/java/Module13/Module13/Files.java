/**
 * �author Tetiana Horbachova
 * @version 1. 0
 */
package Module13.Module13;

import java.util.ArrayList;

//Abstract class to work with files
public abstract class Files {
	
	    public static String fileName;
	    public static boolean fileExist;
	    public abstract ArrayList readFromFile();
	    public abstract void setFileName(String fileName);

}
