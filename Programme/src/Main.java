import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        Map<String,Integer> ages = new HashMap<>();
        ages.put("Prince",20);
        ages.put("Dieume",30);
        ages.put("Vainqueur",40);
        System.out.println(ages);
       for(Entry<String,Integer> element: ages.entrySet()){
           System.out.println("la chef ast" + element.getKey()+ "son age"+element.getValue());
       }
    }

}