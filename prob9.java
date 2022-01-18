import java.util.*;

public class prob9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=0;
        while(scan.hasNextLine()){
            System.out.println(++i +" "+ scan.nextLine());
        }
        scan.close();
    }
}
