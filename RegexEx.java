import java.util.regex.*;
import java.util.*;

class Regex {
    public static void main(String[] args) {
        Pattern pt = new Pattern.compile("\\b[A-Z a-z][A-Z a-z]\\S");
        Matcher mt = pt.matcher("IES University of Bhopal Madhyapradesh");
        while (mt.find())

        {
            System.out.println(mt.group());
        }
    }
}