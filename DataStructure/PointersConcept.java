import java.util.HashMap;
import java.util.Map;

public class PointersConcept {

    public static void main(String[] args) {

        int num1 = 11;
        int num2 = num1;
        System.out.println("num1  "  + num1);
        System.out.println("num2  "  + num2);

        num1=22;
        System.out.println("Updated values of num1  "  + num1);
        System.out.println("Updated values of num2  "  + num2);

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("value" , 2);
        Map<String,Integer> map2 = new HashMap<>();
        map2=map1;
        System.out.println("map1  "  + map1);
        System.out.println("map2  "  + map2);
        map1.put("value" , 22);
        System.out.println("Updated values of map1  "  + map1);
        System.out.println("Updated values of map2  "  + map2);
        Map<String,Integer> map3 = new HashMap<>();
        map3.put("value" , 33);
        map2=map3;
        System.out.println("Updated values of map1  "  + map1);
        System.out.println("Updated values of map2  "  + map2);
        System.out.println("Updated values of map3  "  + map3);
        map1=map2;
        System.out.println("Updated values of map1  "  + map1);
        System.out.println("Updated values of map2  "  + map2);
        System.out.println("Updated values of map3  "  + map3);
    }
}
