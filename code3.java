import java.util.Scanner;
public class code3 {
    public static void main(String[] args) {
        code3 Solution = new code3();

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

    
}
}