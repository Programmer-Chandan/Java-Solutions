import java.util.*;

public class P8 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try{
       int B=sc.nextInt();
       int H=sc.nextInt();
            if(B<=0||H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return;
            }
            if (B>H){
                System.out.println(B);
            }
            else{
                System.out.println(H);
            }
        }

       catch(Exception e){
        System.out.println(e);
       }
    }
}

