package com.mln.playground;

public class NumPalindrom {

    public static void main(String[] argswww) {
        int iNum = 235;
        int iReverse = 0;

        while (iNum > 0) {
            iReverse = (iReverse * 10) + iNum % 10;
            iNum = iNum / 10;
        }
        System.out.println(iReverse);

        if (iNum == iReverse) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
