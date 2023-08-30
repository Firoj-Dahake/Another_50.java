class Circle1{
    public int Radius;
    Circle1(){

    }
    Circle1(int r){
        System.out.println("This is Circle calss's Constructor ");
        this.Radius=r;
    }
    public double Area(){
        System.out.println("Area of circle is :");
        return Math.PI*this.Radius*this.Radius;
    }
}
class Cylender2 extends Circle1{
    Cylender2(){

    }
    public int height;
    Cylender2(int h,int r){
        super(r);
        System.out.println("This is a Cylender's class Constructor");
        this.height=h;
    }
    public double Volume(){
        return Math.PI*this.Radius*this.Radius*height;
    }
}

public class duplicate {
    public static void main(String[] args) {
        Circle1 c= new Circle1();
        Cylender2 cy= new Cylender2();
        c.Radius=4;
        cy.height=10;
        System.out.println( cy.Volume()+c.Area());



    }
}
