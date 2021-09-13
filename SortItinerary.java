import java.util.HashMap;
import java.util.Map;

public class SortItinerary {
    public static void main(String args[]) {
    
        Map<String, String> dataSet = new HashMap<>();
        dataSet.put("Gokarna", "Banglore");
        dataSet.put("Ranchi", "Delhi");
        dataSet.put("Ooty", "Gokarna");
        dataSet.put("Delhi", "Ooty");
 
        printResult(dataSet);
    }
    private static void printResult(Map<String, String> dataSet)
    {
        // To store reverse of given map
        Map<String, String> reverseMap = new HashMap<>();
 
        // To fill reverse map, iterate through the given map
        //Map.Entry<K, V>
        for (Map.Entry<String,String> entry: dataSet.entrySet())
            reverseMap.put(entry.getValue(), entry.getKey());
 
        // Find the starting point of itinerary
        String start = null;
        for (Map.Entry<String,String> entry: dataSet.entrySet()) 
        {//ranchi -> delhi
              if (!reverseMap.containsKey(entry.getKey())) //ranchi
              {
                   start = entry.getKey();//ranchi
                   break;
              }
        }
 
        String to = dataSet.get(start); //delhi
        while (to != null)
        {
            System.out.println("origin : " + start +  " | destination : " + to);
            start = to;//delhi
            to = dataSet.get(to); //ooty
        }
    }
}
