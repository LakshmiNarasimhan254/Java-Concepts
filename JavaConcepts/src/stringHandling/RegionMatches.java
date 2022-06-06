package stringHandling;

public class RegionMatches {

	public static void main(String[] args) {
		// determines region matchs in two strings by using regionMatches() method.
		String strfirst = "Welcome to Microsoft";
	    String strsecond = "I work with microsoft";
	    boolean bmatchA =strfirst.regionMatches(strfirst.indexOf("Microsoft"),strsecond, 12,9);
	    System.out.println(bmatchA);
	    boolean bmatchB =strfirst.regionMatches(true,strfirst.indexOf("Microsoft"),strsecond, 12,9);
	    System.out.println(bmatchB);
	}

}
