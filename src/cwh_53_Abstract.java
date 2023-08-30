
abstract class parent2{// do not create object, if there is  abstract class then this will be the abstract class
    // abstract class use/help to create another class and provide as a medium
    //Abstract method does not contain any body
    public parent2(){
        System.out.println("This is base class parameter");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends parent2{
   @Override
   public void greet(){
      System.out.println("Good morning");
    }
    public void greet2(){
        System.out.println("Good morning");
    }
}
abstract class child1 extends parent2{
    public void th(){
        System.out.println("I am happy");
    }
}
public class cwh_53_Abstract {
    public static void main(String[] args) {
       // parent2 p=new parent2() ;
         // child1 ch=new child1();
        child c=new child();
        c.greet();
        System.out.println();
        parent2 pr= new child();
    }
}
