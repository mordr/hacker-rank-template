import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

    private static void function(int a, int b) {
        System.out.print(a + "," + b);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        function(a,b); 
    }
}