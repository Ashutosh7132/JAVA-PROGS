import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateChars {

    public static void main(String[] args) {

        String input = "JavaJavaEE";

        System.out.println("Duplicate characters in a given string: " + input);
        Map<Character,Long> result = input.chars().distinct().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        result.forEach((k,v)->{
                System.out.println(k  +   "  :  "  +  v);

        });
    }
}
