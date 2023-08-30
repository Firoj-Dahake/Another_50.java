interface sampleInterface{
    void math1();
    void math2();
}
interface childSampleInterfac extends sampleInterface{
    void math3();
    void math4();
}
class MySampleClass implements childSampleInterfac {
    public void math1(){
        System.out.println("Math1");
    }
    public void math2(){
        System.out.println("Math2");
    }
    public void math3(){
        System.out.println("Math3");
    }
    public void math4() {
        System.out.println("Math4");
    }
}
public class cwh_58_inheritance_in_interfaces {
    public static void main(String[] args) {
        MySampleClass ms= new MySampleClass();
        ms.math1();
    }
}
