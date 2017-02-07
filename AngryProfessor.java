#Angry Professor
#A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, he decides to cancel class if fewer than students are present when class starts. Given the arrival time of each student, determine if the class is canceled.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count=0;
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            Arrays.sort(a);
        if(a[k-1]<=0) {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

        }
    }
}
