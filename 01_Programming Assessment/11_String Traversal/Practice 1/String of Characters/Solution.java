import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        char ch = scanner.next().charAt(0);

        for(int i=0; i<n; i++){
            System.out.print(ch);
        }
    }
}