import java.util.Scanner;

public class assignment4 {
    // add all the even number from 0 to n which divisible by 3
    public static void main(String[] args) {
        //n=4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for (int i=0;i<=n;i+=2){

                if (i%3==0){
                    sum +=i;
                }


        }
        System.out.println(sum);
    }
}
