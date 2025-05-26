// Example 1
// Input

// str = "Hello World"
// Output

// "Helo Wrd"
// Explanation

// Example 2
// Input

// str = "aabbc"
// Output

// "abc"

package acciojobquestions;
import java.io.*;
import java.util.*;
class Solution {
    public void solve(Scanner sc) {
        // String s = sc.nextLine();
        // int count=0;
        // char arr[] = s.toCharArray();
        // for(int i=0;i<arr.length;i++){
        //     count=1;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //            count++;
        //            arr[j]='0';
        //         }
        //     }
        //     if(arr[i]!='0' && count>=1){
        //        System.out.print(arr[i]); 
        //     }   
        // }

        HashSet<Character> set = new HashSet<>();
        
        StringBuilder sb = new StringBuilder();
        
        String s = sc.nextLine();

        for(char ch:s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        
        System.out.print(sb.toString());
    }
}
public class printUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        solution.solve(sc);
    }
}
