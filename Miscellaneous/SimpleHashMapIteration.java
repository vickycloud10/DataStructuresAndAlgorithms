package Miscellaneous;
import java.util.HashMap;
import java.util.Map;

/**
 * SimpleHashMapIteration
 * 
 * Level : Very easy
 * 
 */
public class SimpleHashMapIteration {

    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("1", "Britain");
        countryMap.put("2", "Australia");
        countryMap.put("3", "France");
        countryMap.put("4", "Germany");

        countryMap.forEach((key, value) -> System.out.println(key+"---"+value));
    }
}