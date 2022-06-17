package interviewprep;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iRow = 0;
		int iCol = 0;
		int inum = 0;

	    for (iRow=0;iRow<=4;iRow++){
	    	for (iCol=0;iCol<iRow+1;iCol++){
		           System.out.print(" ");
	    	}
            for (int iSpace=5-iRow;iSpace>1;iSpace--){
                System.out.print(inum+" ");
                 inum++;
            
	         
	       
	    }
	        System.out.println();

	    }
	}

}
