package uasm;

import java.io.File;
import java.io.IOException;

/** useful to get the path of the examples when using this project in other projects
 * when testing Java code
 * 
 * @author garganti
 */
public class UasmLanguageExamples {
	
	/** 
	 * @return the base path for the UASM examples 
	 * @throws IOException
	 */
	public static String getExamplesPath(){
		String currentDir = UasmLanguageExamples.class.getResource(".").getPath();
		File baseDir = new File(currentDir).getParentFile().getParentFile();		
		return baseDir.getAbsolutePath().toString();
	}

}
