import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findPositiveNegativePairs(arr);
    }

    public static void findPositiveNegativePairs(int[] arr) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == -arr[i]) {
                        if (i < j) {
                            System.out.println(arr[i] + " " + arr[j]);
                        } else {
                            System.out.println(arr[i] + " " + (-arr[i]));
                        }
                        found = true;
                        break;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found");
        }
    }
}