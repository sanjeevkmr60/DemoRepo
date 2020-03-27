package com.qa.ArraysConcept;

public class Two_Array_Java {
    public static void main(String[] args) {

        String str[][] = new String[3][2]; // 3 rows, 2 columns

        str[0][0] = "user_1";
        str[1][0] = "user_2";
        str[2][0] = "user_3";
        str[0][1] = "pwd_1";
        str[1][1] = "pwd_2";
        str[2][1] = "pwd_3";

        // This for loop will be total executed 3 times.
        for (int i = 0; i< str.length; i++) {

            // for loop wexecuted for 2 time every iteration.
            for (int j = 0; j < str[i].length; j++) {

                System.out.println(str[i][j]);

            }
        }
    }
}
