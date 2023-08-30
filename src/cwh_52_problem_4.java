class Rectangle{
    public int length;
    public int Breath;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return Breath;
    }

    public void setBreath(int breath) {
        Breath = breath;
    }

    Rectangle(){
        System.out.println("This is a normal construcrto from rectangle class");
    }
    Rectangle(int l,int b){
     this.length=l;
     this.Breath=b;
    }
    public int Area(){
        System.out.println("The Area Rectangle :");
        return this.length*this.Breath;
    }
}
class cuboid extends Rectangle{
    public int length;
    public int breath;
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    cuboid(){
        System.out.println("This is cuboid class constructor with no paramater");
    }

    cuboid(int l, int b, int h){
        super(l,b);
        System.out.println("This is a cuboid class constructor");
        this.height=h;

    }
    public int Area1(){
        System.out.println("The area of cuboid is: ");
        return (2*((length*breath)+(length*height)+(height*breath)));
    }
}


public class cwh_52_problem_4 {
    public static void main(String[] args) {
        Rectangle re=new Rectangle();
        /*re.length=10;
        re.setBreath(5);
        System.out.println(re.getLength()+"  "+re.getBreath());
        System.out.println(re.Area());*/
        cuboid cu=new cuboid(2,3,5);
        cu.length=2;
        cu.Breath=3;
        cu.height=5;
        System.out.println(cu.Area1());


    }
}
