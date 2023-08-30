public class constructor {
    public static void main(String[] args) {
    Answer a = new Answer(10,"mcq");
    }
}
class Answer{
    Answer(){
        System.out.println("You got nothing");
    }
    Answer(int marks, String type){
        System.out.println("You got"+marks+" for an "+type);
    }
}
