//Please read the code and accordingle reply

import java.util.Scanner;
class like{
    public like() {
        System.out.println("How nice you, I will meet you");
    }

    public void likeyou(String reply1, String reply2){
        System.out.println("I like this messages....");
        System.out.println("You May send this I will not mind");
        reply1="Yes";
        reply2="No";
    }
}
public class purpas {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("WHAT IS YOUR REPLY....");
        System.out.println("CAUTION:");
        System.out.println("1 ie. you can send this messages and 2 ie. I am not comfortable Please don't sent this");
        int YourReply=sc.nextInt();
        System.out.println("You Reply is "+YourReply);
        int reply1= 1 ;  //1---> Not Mind
        int reply2= 2;  //2---> Mind


        if (YourReply == 1 ){
            System.out.println("I will send this messages...");
            System.out.println();
            like Like=new like();
            Like.likeyou("yes","No");
            System.out.println();
        }

        else if(YourReply==reply2){
            System.out.println("I will quit here.... and there will be nothing will send after this");
            System.out.println();
            System.out.println("Sorry for disturbance");
        }


        System.out.println("Thank You!, For Your Reply....");

    }
}
