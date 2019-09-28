import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Etl {
        // TODO: refactor method
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (Map.Entry item : old.entrySet()) {
            for (String char1 : (List<String>) item.getValue()) {
                result.put(char1.toLowerCase(), (Integer) item.getKey());
            }
        }
        return result;
    }
}
