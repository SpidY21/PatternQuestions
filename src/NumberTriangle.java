import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}

//             6
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//        6 6 6 6 6 6