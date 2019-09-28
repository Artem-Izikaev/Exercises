import java.util.*;

/**
 * Created by Artem Izikaev on 09.12.2016.
 */
public class School {
    private Map<Integer, List<String>> gradeMap = new TreeMap<>();


    public Map<Integer, List<String>> db (){
        return gradeMap;
    }

    public void add (String name, Integer grade) {
        List<String> students = new LinkedList<>();
        gradeMap.putIfAbsent(grade, students);
        students = gradeMap.get(grade);
        students.add(name);
    }

    public List<String> grade (Integer grade) {
        this.gradeMap.putIfAbsent(grade, new LinkedList<>());
        return this.gradeMap.get(grade);
    }

    public Map<Integer, List<String>> sort () {
        this.gradeMap.values().forEach(Collections::sort);
        return this.gradeMap;
    }
}
