class Circle{
    public int radius;
    float Pi=3.142f;
    Circle(int r){
        System.out.println("This is parent class cunstructor");
        this.radius=r;
    }
    public void circle(){
        this.radius=radius;
    }
    public double Area(){
        return Pi*this.radius*this.radius;
    }
}
class Cylender extends Circle{
    public int height;
    Cylender(int r,int h){
        super(r);
        System.out.println("this is child constructor");
        this.height =h;
    }

    public double Area(){
        return this.radius*this.radius*height*Pi;
    }
}

public class cwh_52_Problem {
    public static void main(String[] args) {
        //Circle c=new Circle(12);
        Cylender c1= new Cylender(12,432);

    }
}
