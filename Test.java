import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int down;
        int up;
                Scanner bob = new Scanner(System.in);
                    System.out.println("Number down : ");
                    down = bob.nextInt();

                Scanner ar= new Scanner(System.in);
                System.out.println("Number up: ");
                up= ar.nextInt();
                int total=1;
                for (int i=1 ; i<= up;) {
                    total *= down;
                    System.out.println(total);

                }

    }


            }
