import java.util.HashMap;
import java.util.Set;

public class KeyValue {
public static void main(String[] args) {
	HashMap<Integer,Double> hashmap=new HashMap<Integer,Double>();
	hashmap.put(1, 30000.00);
	hashmap.put(2, 70000.00);
	hashmap.put(3, 80000.00);
	hashmap.put(4, 70000.00);
	hashmap.put(5, 70000.00);
	hashmap.put(6, 80000.00);
	hashmap.put(7, 70000.00);
	hashmap.put(8, 80000.00);
	hashmap.put(9, 70000.00);
	hashmap.put(10, 60000.00);
	Set<Integer> Set=hashmap.keySet();
	System.out.println("Set:"+Set+"\n");
	for(Integer key:Set) {
		Double value=hashmap.get(key);
		System.out.println("value:"+value);
	}
	
}
}
