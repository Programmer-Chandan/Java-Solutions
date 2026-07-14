import java.util.*;

public class P7 {
        public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int line = 1;

            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.println(line + " " + s);
                line++;
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}