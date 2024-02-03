package CollectionProgram;
import java.util.*;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "JAVA");
		map.put(200, "Python 3.7");
		map.put(200, "Python");
		map.put(150, "C++");
		map.put(400, "C");
		for(Map.Entry x : map.entrySet())
		{
			System.out.println(x.getKey() + " "+ x.getValue());
		}
	}

}
