import java.util.Scanner;
public class stringAll {
    public static void main(String[] args) {
        /**///String as a class

        //concept_1
        /* String name="Firoj"; *///immutable
        /* name=new String("Firoj ");*/
        /* System.out.println(name);*/

        //CONCEPT_2
       /* Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String st=sc.nextLine();
        System.out.println(st);*/
        //           0123456789101

        //CONCEPT_3
        //String name="Firoj_Dahake  ";  // calculate the length of the string name
        // int  value=name.length();
        // System.out.println(value);

        //CONCEPT_4
        //  String Lower=name.toLowerCase();  // conver the string name into lower string
        //  System.out.println(Lower);

        //CONCEPT_5
        //  String upper=name.toUpperCase(); //conver the string name into upper string
        //  System.out.println(upper);

        //CONCEPT_6
        /*String trimstring="       Firoj Toliram Dahake     ";// use to trim string ie. remove useless space from string
        System.out.println(trimstring.trim());

        System.out.println(name.trim());*/ // remove useless space before and after the String

        //CONCEPT-7
        /*System.out.println(name.substring(7)); //print particular word from the string
        System.out.println(name.substring(2,12));*/

        //CONCEPT_8
        // System.out.println(name.replace('F','e')); ///Replace word from the strig
        //System.out.println(name.endsWith("ake")); // is string ends with given words

        //CONCEPT_9
        //  System.out.println(name.charAt(7)); //find character via number

        //CONCEPT_10
        //System.out.println(name.indexOf("a"));// show index of character which  is coming first
        //System.out.println(name.indexOf("a" ,8));//after 8 it will find
        //System.out.println(name.lastIndexOf("i"));

        //CONCEPT_11
        String name = "Firoj_Dahake";
       /* System.out.println(name.equals("Firoj_Dahake"));//BOOLEAN RETURN TRUE OR FALSE
        System.out.println(name.equalsIgnoreCase("firoj_Dahake")); //ignore case sensitive*
        System.out.println(name.compareTo("Firoj" +"DAHAKE"));*/

        //ignore " here
        System.out.println("Enter the name and another detaile for fulthur process \" and the main class is the proces");

    }
}
