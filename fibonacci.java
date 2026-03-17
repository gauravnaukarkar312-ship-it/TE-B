
import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
        int n=10;
        int one =0;
        int two =1;
        for(int i=0;i<n;i++){
            System.out.println(one + " ");
            int next = one+two;
             one=two;
             two=next;
        }
    }
}
