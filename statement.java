import java.util.Scanner;

public class statement {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        String result;
        System.out.println("please input number:");
        int num = time.nextByte();
        result=(num<18)?"Morning":"evening";
        System.out.println(result);
    }
}


//public class statement {
//    // short hand if...else
//    public static void main(String[] args) {
//        Scanner time = new Scanner(System.in);
//        System.out.println("Please input number:");
//        int number = time.nextByte();
//        String result;
//        result = (number < 18) ? "morning" : "evening";
//        System.out.println(result);
//
//    }
//}

//
//public class statement{
//    public static void main(String[] args) {
//        int time = 20;
//        String result = (time < 18) ? "Good day." : "Good evening.";
//        System.out.println(result);
//    }
//}
//public class statement {
//
//    public static void main(String args[]) {
//        int x = 30;
//        int y = 10;
//
//        if( x == 30 ) {
//            if( y == 10 ) {
//                System.out.print("X = 30 and Y = 10");
//            }
//        }
//    }
