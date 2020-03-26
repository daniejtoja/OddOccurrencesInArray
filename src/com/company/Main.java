// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        if(A.length == 1){
            return A[0];
        }


        Arrays.sort(A);


        for(int i = 1, temp = A[0], counter = 1; i<A.length; ++i){
            if(A[i] == temp){

                ++counter;


            } else {

                if(counter%2 == 0){
                    temp = A[i];
                    counter = 1;


                } else {
                    return A[i-1];
                }


            }


        }

        return A[A.length-1];

    }

}