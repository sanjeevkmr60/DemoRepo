package com.qa.SamplePrograms;
/*A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
Any integer P, such that 0 < P < N, splits this tape into two non−empty parts: A[0], A[1], …, A[P − 1] and A[P], A[P + 1], …, A[N − 1].
The difference between the two parts is the value of: |(A[0] + A[1] + … + A[P − 1]) − (A[P] + A[P + 1] + … + A[N − 1])|
In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
Write a function that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
Example:
      A[0] = 3
      A[1] = 1
      A[2] = 2
      A[3] = 4
      A[4] = 3
We can split this tape in four places:
P = 1, difference = |3 − 10| = 7
P = 2, difference = |4 − 9| = 5
P = 3, difference = |6 − 7| = 1
P = 4, difference = |10 − 3| = 7
In this case I would return 1 as it is the smallest difference.

N is an int, range [2..100,000]; each element of A is an int, range [−1,000..1,000]. It needs to be O(n) time
complexity.
 */

public class Solution_Codility_TapeEquilibrium {
   public static int solution(int a[], int N){
        int left;
        int right;
        for(int i = 0; i < N; i++){
            left  = 0;
            right = 0;
            for(int t = 0; t < N; t++){
                if(t < i)      left  += a[t];
                else if(t > i) right += a[t];
                else continue;
            }
            if(left == right) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int demo[] = {-1, 3, -4, 5, 1, -6, 2, 1,4,6,7};
       int sol= (int) solution(demo,demo.length);
        System.out.println(sol);
    }
}
