import java.util.regex.*;
import java.util.Scanner;
public class lab1 {
    public static void main(String args[]) {
        String pattern = "(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[012])/(19|[2-9][0-9])\\d\\d";
        Pattern p = Pattern.compile(pattern);
        Scanner data = new Scanner(System.in);
        System.out.println("введите дату");
        String text = data.next();
        data.close();
        Matcher m = p.matcher(text);
        if (m.matches() == true) {
            System.out.println("данная дата является датой типа dd/mm/yyyy");
        } else {
            System.out.println("данная дата не является датой типа dd/mm/yyyy");
        }
    }
}
