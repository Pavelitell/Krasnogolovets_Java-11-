import java.util.Scanner;

public class Check_Bracket {                          // Код только на круглые скобки
    private static boolean parsing(String str) {
        int check_bracket = 0;
        for (int i = 0; i < str.length(); i++) {
            if (check_bracket < 0) {
                return false;
            }
            String one_symbol = str.substring(i, i + 1);
            if (one_symbol.equals("(")) {
                check_bracket++;
            } else {  
                check_bracket--;
            }
        }
        if (check_bracket == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String brackets = "((())()(())";
        System.out.println(parsing(brackets));
    }
}
