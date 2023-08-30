// staic ----> associated with the intereface and with the class not with object
//default ---> Additional functionality


interface camera{
    void takeSnap();
    void recordVide();
    private void greet(){
        System.out.println("Khimo nache");
    }
    default void record4K(){// must be body there
        greet();// you also call the private calss with this method
        System.out.println("Recording video in 4K ");
    }
}
interface wifi{
    String[] getNetwork();
    void connectTONetwork(String network);
    default void hackWifi(){
        System.out.println("The device will be hacked after 10 sec");
    }
}
class cellPhone{
    void cellPhone(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void picCall(){
        System.out.println("Connecting.....");
    }
}
class smartPhone extends cellPhone implements camera,wifi{
    public  void takeSnap(){
        System.out.println("Tacking snap");
    }
    public void recordVide(){
        System.out.println("Recording video and ");
    }
   /* public void record4K(){
        System.out.println("Taking snap and recording 4K video");
    }*/
    public String[] getNetwork(){
        System.out.println("getting Network");
        String[] networklist = {"Pankaj", "rohan", "rahul"};
        return networklist;
    }

    public void connectTONetwork(String network){
        System.out.println("connection to "+network);
    }
}

public class cwh_Default_method_57 {

    public static void main(String[] args) {
        smartPhone ms= new smartPhone();
        /*ms.record4K();
        String[] arr=ms.getNetwork();
        for(String item:arr){
            System.out.println(item);
        }
        ms.connectTONetwork("Pankaj");
        ms.hackWifi();*/
        ms.record4K();
        //ms.greet();///throws and error
    }
}
