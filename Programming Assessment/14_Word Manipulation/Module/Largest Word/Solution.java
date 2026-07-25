import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLen = 0;
        String s = "";

        while(scanner.hasNext()){
            String word = scanner.next();
            if(word.length() > maxLen){
                maxLen = word.length();
                s = word;
            }
        }
        System.out.print(s);
        
    }

}