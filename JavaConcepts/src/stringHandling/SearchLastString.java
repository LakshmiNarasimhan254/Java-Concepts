package stringHandling;

public class SearchLastString {

	public static void main(String[] args) {
		/*This example shows how to determine the last position of a 
		substring inside a string with the help of strOrig.lastIndexOf(Stringname) method. */
		String strOrginal = "Hello world ,Hello Reader";
		String strSearchTxt = "Hello";
		int iLastIndex = strOrginal.lastIndexOf(strSearchTxt);
		int iFirstIndex = strOrginal.indexOf(strSearchTxt);
		
		if (iLastIndex== -1){
			System.out.println(strSearchTxt + " could not be found in  "+ strOrginal);
		}else{
			System.out.println("The Last Occurence of " + strSearchTxt + " is found in  "+ strOrginal + " at the " + iLastIndex + " Position" );
		}
		
		if (iFirstIndex== -1){
			System.out.println(strSearchTxt + " could not be found in  "+ strOrginal);
		}else{
			System.out.println("The first Occurence of " +strSearchTxt + " is found in  "+ strOrginal + " at the " + iFirstIndex + " Position" );
		}

	}

}


