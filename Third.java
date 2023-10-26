//Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)

import java.util.*; 
public class Third
{
	public static void main(String[] args) {
    
    	int[] arr = new int[26];
    	System.out.printf("Enter the string ");
    	Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();   
        for(int k=0;k<str.length();k++)
        {
            char c=str.charAt(k);
            arr[c-'a']=1;
        }
        int c=0;
        for(int k=0;k<arr.length;k++)
        {
             //System.out.println(arr[k]);
            if(arr[k]==1) c++;
        }
        if(c==26) System.out.println("panagram");
        else System.out.println("not panagram");
	}
}