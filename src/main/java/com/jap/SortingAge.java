
package com.jap;

public class Sorting {
    public int[] getSortedage(int[] ageArray) {
        for (int i = 0; i < ageArray.length; i++) {
            System.out.println(ageArray[i] + "ageArray");

        }
        return new int[0];
    }


    public static void main(String[] args) {
        int ageArray[] = {22, 34, 33, 32, 36, 27, 28};
        Sorting sort = new Sorting();

        for (int i = 0; i < ageArray.length; i++) {
            for (int j = 0; j < ageArray.length - i - 1; j++) {
                if (ageArray[j] < ageArray[j + 1]) {
                    int temp = ageArray[j];
                    ageArray[j] = ageArray[j + 1];
                    ageArray[j + 1] = temp;
                }
            }

            System.out.println(ageArray[i]);
        }
    }
}




