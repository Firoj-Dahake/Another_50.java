

interface MyCamera{// dynamic method diapach use :: polymorphism as poly forms
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("This is the greet");
    }
    default void record4Kvideo(){
        greet();
        System.out.println(" Camera gets on and recordin 4K  video");
    }
}
interface Mywifi{
    String[] getNetwork();
    void connectTONetwork(String network);
    /*default void hackwifi(){
        System.out.println("The device will be hacked after 10 second");
    }*/
}
class MyCellphone1{
    void callphone(int phonenumber){
        System.out.println("Cellphone is use for calling"+phonenumber);
    }
    void cutcall(){
        System.out.println("To cat call red butten is use");
    }
    void attentcall(){
        System.out.println("To attend the call green butten is use");
    }
    void Piccall(){
        System.out.println("Connecting.......");
    }
}
class Smartphone2 extends MyCellphone1 implements Mywifi,MyCamera{//implement all the methods for interface class

    @Override
    public void takesnap() {
        System.out.println("Camera is use to take snap");
    }

    @Override
    public void recordvideo() {
        System.out.println("Camera is use to record the video");
    }

    public void record4Kvideo() {
        MyCamera.super.record4Kvideo();

    }
    public String[] getNetwork(){
        System.out.println("getting Network");
        String[] networklist = {"Pankaj", "rohan", "rahul"};
        return networklist;
    }

    @Override
    public void connectTONetwork(String network) {
        System.out.println("Connection to "+network);
    }
    public void samplemath(){
        System.out.println("Math");
    }

}
public class Polymorphism_injava_59 { //polymorphism----> one thing with different forms(types)
    //it uses dynamic method dispach
    public static void main(String[] args) {
      MyCamera cam1 = new Smartphone2();
      //cam1.getNetwork();
        // cam1.samplemath();
        cam1.record4Kvideo();
        cam1.recordvideo();
        cam1.takesnap();

      Smartphone2 sm = new Smartphone2();
      sm.samplemath();
      sm.record4Kvideo();
      sm.recordvideo();
      sm.getNetwork();
      sm.connectTONetwork("pranay");
      sm.callphone(  866986);

    }
}
