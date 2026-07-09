import java.util.*;

public class P5 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
        int q=sc.nextInt();
        if (q>=0&&q<=500){
            for (int j=0;j<q;j++){   
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            if (a>=0&&a<=50){
                if(b>=0&&b<=50){
                    int sum=a;
                    for (int i=0;i<=n-1;i++){
                        sum+=(int)(Math.pow(2,i)*b);
                        System.out.print(sum + " ");
                    }
                }
                System.out.println();
            }
            }
        }
        sc.close();
        
    }
  }
}