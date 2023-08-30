import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
   /* public int noofGuesses;

    public int getNoofGuesses() {
        return noofGuesses;
    }
    public void setNoofGuesses(int noofGuesses) {
        this.noofGuesses = noofGuesses;
    }*/

     Game(){
        Random rand = new Random();
        number=rand.nextInt(100);
    }
    public void takeUserinput(){
        System.out.println("Guess the number");
        Scanner sc= new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean isCorrecteNumber(){
    if (inputNumber==number){
        return true;
    }
    else if (inputNumber<number){
        System.out.println("Guess number is less than Number");
    }
    else if (inputNumber>number){
        System.out.println("Guess number is greater than Number");
    }
     return false;

    }

}
public class cwh_rendom_no_50 {
    public static void main(String[] args) {
        Game g= new Game();
        boolean b1=false;
        while (!b1) {
            g.takeUserinput();
            b1 = g.isCorrecteNumber();

            System.out.println(b1);
        }
    }

}
