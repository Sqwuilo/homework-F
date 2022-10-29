import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        lastNum(num);


    }

    public static void lastNum(int a){
        a = a % 10;
        System.out.println(a);
    }

}