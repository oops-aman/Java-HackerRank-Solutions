import java.util.*;

public class prob7{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int total=a;
            for(int j=0;j<n;j++)
            {
                total+= b*Math.pow(2,j);
                System.out.print(total+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}
