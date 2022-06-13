package synchronisation;

public class Syncro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First fnew = new First();
	    Second ss = new Second(fnew, "welcome");
	    Second ss1= new Second(fnew,"new");
	    Second ss2 = new Second(fnew, "programmer");
	}

}
