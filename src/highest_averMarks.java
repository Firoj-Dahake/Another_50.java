import java.util.Scanner;

public class highest_averMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Mark_avg;
        int result;
        int i;
        int s;
        s=sc.nextInt();
        int[] arr=new int[s];
        for (i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        int heightMarks = arr[0];
        int totalMarks=0;
        for (i=0;i<arr.length;i++){
            totalMarks += arr[i];
            if(arr[i]>heightMarks){
                heightMarks = arr[i];
            }
        }
        /* for (i=0;i<arr.length;i++){
            totalMarks += arr[i];
        }*/
        Mark_avg  = (totalMarks/s);
        System.out.println(heightMarks);
        System.out.println(Mark_avg);


    }
}
