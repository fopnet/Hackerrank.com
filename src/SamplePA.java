import java.util.Scanner;


public class SamplePA {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int diff = -1;
        for (int i =0 ; i< n ; i++ )  {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (diff < 0) {
                diff = b - a;
                continue;
            } else  if (b - a != diff)   {
                System.out.println( a + diff );
            }
        }
        sc.close();

	}

}
