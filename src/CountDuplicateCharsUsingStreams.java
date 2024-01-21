import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharsUsingStreams {

    public static void main(String[] args) {

        String input = "JavaJavaEE";
        Map<Character,Long> result = input.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

        result.forEach((k,v)->{
            if(v>1){
                System.out.println(k  + " : " +   v);
            }
        });
    }
}