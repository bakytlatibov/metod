import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{23,67,45,667,2,3,3,34,4,556,789,};
        System.out.println(mass(arr));

//        Scanner sc=new Scanner(System.in);
//        int san= sc.nextInt();
//        if (san==1){
//            hello();
//        }else if(san==2){
//            bye();
//        }
//
//
//
//
//    }
//
//    static void hello(){
//        System.out.println("hello");
//
//    }
//    static void  bye(){
//        System.out.println("Bye"{


//   static String san(int a) {
//       if (a % 2 == 0) {
//           return "jup san";
//       } else {
//           return "tak san";


     }static int san(int a) {
    int summa=0;
        for (int i = 0; i <= a; i++) {
          summa+=i;
        }
   return summa;

    }static int mass(int []arr) {

        int max=arr[4];
        for (int i = 0; i > arr.length; i++) {
            max=Math.min(max,arr[i]);


        }
  return max;


    }}