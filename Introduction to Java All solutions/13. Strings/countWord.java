import java.util.Scanner;

public class countWord {

    public static int countWords(String str){
        int spaces = 1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spaces++;
            }
        }
        return spaces;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int result = countWords(str);
        System.out.println(result);
    }
}
