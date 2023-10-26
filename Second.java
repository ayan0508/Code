//Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

import java.util.*; 
public class Second
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.printf("Enter the roman with capital letter ");
        String s= sc.nextLine(); 
        int l = s.length();
        Map<Character, Integer> r = new HashMap<>();
        int s1 = 0;
        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);
        for (int j = l - 1; j >= 0; j--) {
            if (j > 0 && r.get(s.charAt(j)) <= r.get(s.charAt(j - 1))) {
                s1 += r.get(s.charAt(j));
            } else if (j > 0 && r.get(s.charAt(j)) > r.get(s.charAt(j - 1))) {
                s1 += r.get(s.charAt(j)) - r.get(s.charAt(j - 1));
                j--;
            } else {
                s1 += r.get(s.charAt(0));
            }
        }
        System.out.println(s1);
	}
}