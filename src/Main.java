import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        MINI PROJECT
//        input by user
        Scanner sc = new Scanner(System.in);

        int mynum = (int)(Math.random()*100);
        int usernum = 0;
        do {
            System.out.println("guess my number(1 - 100)");
            usernum = sc.nextInt();
//            if- else conditions
            if (usernum == mynum){
                System.out.println("congrats... you guess the number");
                break;
            }
            else if (usernum > mynum){
                System.out.println("your num is large");
            }
            else {
                System.out.println("your num is smaller");
            }

        }while(usernum>=0);
        System.out.println("My num was : ");
        System.out.println(mynum);
    }
}