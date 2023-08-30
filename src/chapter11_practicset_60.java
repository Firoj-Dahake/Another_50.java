
// problem_1
/*abstract class Pen{
    abstract  void write();
    abstract  void refill();

}
class FountainPen extends Pen{
     void write(){
         System.out.println("Write");
    }
    void refill(){
        System.out.println("refill");

    }
    void changenNib(){
        System.out.println("changing the nib");

    }
}*/

import java.sql.SQLOutput;

//problem_2
class Monkey{
    void jump(){
        System.out.println("jumping ......");
    }
    void bite(){
        System.out.println("Biting ......");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
    void speak(){
        System.out.println("Hello sir.......");
    }
}

//Problem_4
/*abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
interface CCamera{
    void takesnap();
    void recordvideo();
}
interface Cwifi{
    String[] getNetwork();
    void connectTONetwork(String network);
}
class CSmartPhone extends TelePhone implements Cwifi,CCamera{

    @Override
    void ring() {
        System.out.println("Ringging...");
    }

    @Override
    void lift() {
        System.out.println("Attending....");
    }

    @Override
    void disconnect() {
        System.out.println("Call get Disconnected..");
    }

    @Override
    public void takesnap() {
        System.out.println("Take snap");
    }

    @Override
    public void recordvideo() {
        System.out.println("Record video");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("network list is");
        String[] NList={"firoj","Pranay"};
        System.out.println("Available network"+NList);
        return NList;
    }

    @Override
    public void connectTONetwork(String network) {
        System.out.println("Connecting to network"+ network);
    }
}*/
public class chapter11_practicset_60 {
    public static void main(String [] args){
        //problem_1
        /*FountainPen pen = new FountainPen();
        pen.changenNib();*/

        //problem_2
       /* BasicAnimal basicAnimal = new Human();
        basicAnimal.eat();
        Human rohit = new Human();
        rohit.sleep();*/
       /* Monkey m1 =new Human();
        m1.jump();
        m1.speak();*/
        /*BasicAnimal lavish = new Human();
        lavish.speak();*/


        //Problem_4
        /*CCamera camera = new CSmartPhone();
        camera.recordvideo();
        Cwifi wifiv = new CSmartPhone();
        wifiv.connectTONetwork(" Pranay");
        CSmartPhone Redmi = new CSmartPhone();
        Redmi.ring();
        Redmi.getNetwork();*/
    }
}
