package com.mln.playground;

public class NumPattern {

    public static void main (String args[]){
        //to print star in pyramid pattern
        for (int iRow = 0 ; iRow <=3 ; iRow++){
            for(int iSpace = 4-iRow ;iSpace >1;iSpace--){
                System.out.print(" ");
            }
            for (int iCol = 1 ;iCol<=iRow+1;iCol++){
                System.out.print("* ");
           }
            System.out.println();

        }
        //to print numbers in pyramid pattern
        int iNum = 0;
        for (int iRow = 0 ; iRow <=3 ; iRow++){
            for(int iSpace = 4-iRow ;iSpace >1;iSpace--){
                System.out.print(" ");
            }
            for (int iCol = 1 ;iCol<=iRow+1;iCol++){
                System.out.print(iNum +" ");
                iNum++;
            }
            System.out.println();

        }

        iNum = 0;
        for (int iRow = 0 ; iRow <=3 ; iRow++){
            for(int iSpace = 0 ;iSpace<=iRow;iSpace++){
                System.out.print(" ");
            }
            for (int iCol = 1 ;iCol<=4-iRow;iCol++){
                System.out.print(iNum +" ");
                iNum++;
            }
            System.out.println();

        }
    }
}
