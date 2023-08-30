//1 se zayds interface ko extend karsakte hai but in case of abstract only one class extends(inheritance)
interface bicycle{
    int speed =50;
    void applyBreaks(int decrement);
    void speedUp(int increment);
}
interface hornbicycle{
    int a=40;
    void blowhornclassic();
    void blowhornhiphop();
}
class herocycle implements bicycle, hornbicycle{
    void blowhorn(){
        System.out.println("pee pee poo poo");

    }
   public void applyBreaks(int decrement){
        System.out.println("Apply Breaks and reduce the speed");
    }
    public void speedUp(int increment){
        System.out.println("Speed up the bicycle and increase the speed");
    }
    public void blowhornclassic(){
        System.out.println("satyam shivam sundaram");
    }
    public void blowhornhiphop(){
        System.out.println("ha kya bolti company");
    }
}

public class cwh_54_interfaces {
    //interface is the collection of abstract class and interface use implements keyword,
    public static void main(String[] args) {
        herocycle hc=new herocycle();
        hc.applyBreaks(10);
        System.out.println(hc.speed);

        //this is not possible in this
       // hc.speed=20;
       // System.out.println(hc.speed);
        hc.blowhornhiphop();
        hc.blowhornclassic();
        System.out.println(hc.a);

    }
}
