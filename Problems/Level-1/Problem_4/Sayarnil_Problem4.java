import java.io.*;
public class Problem4
{
   public static void main()throws IOException
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter value of time in seconds");
        int n = Integer.parseInt(br.readLine());
        int d = (int)Math.floor(n/86400);
        n=n-d*86400;
        int h = (int)Math.floor(n/3600);
        n=n-h*3600;
        int m = (int)Math.floor(n/60);
        int s=n-m*60;
        System.out.println(d+" Day "+" , "+h+" Hours "+","+m+" Minutes "+" , "+s+" seconds ");
    }
}