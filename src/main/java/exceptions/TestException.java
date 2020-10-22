package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestException {

	public static void main(String[] args) throws CustomException {
    try {
		processFile("testFile");
    	//processFile(null);
	} catch (CustomException e) {
		processErrorCodes(e);
	}
	}

	private static void processErrorCodes(CustomException e) throws CustomException {

		if(null!=e.getErrocode()) {
			switch(e.getErrocode()) {
			case "FNF":
				System.out.println("file not found");
				throw e;
			case "IOE":
				System.out.println("IO Exception");
				break;
			case "NPE":
				System.out.println("Cant find file");
				throw e;
			default:
				System.out.println("Unknown exception");
			}
		}
	}

	private  static void processFile(String fileName) throws CustomException {
		InputStream inputStream = null;
		if(null==fileName) {
			throw new CustomException("File cannot be null ", "NPE");
		}
		try {
			inputStream = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			throw new CustomException(e.getMessage(), "FNF");
		} finally {
			if (null != inputStream)
				try {
					inputStream.close();
				} catch (IOException e) {
					throw new CustomException(e.getMessage(), "IOE");
				}
		}


	}

}
