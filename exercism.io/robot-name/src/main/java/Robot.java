import java.util.Random;

/**
 * Created by Admin on 04.11.2016.
 */
public class Robot {
    private String name;

    public Robot() { generateName(); }

    private void generateName () {
        StringBuilder createName = new StringBuilder();
//        IntStream pseudoRandomUpperCharsCodes = (new Random()).ints((int) 'A', (int) 'Z');
        // Создание потока случайных чисел соответствующих интервалу кодов ASCII от A до Z и
        // добавления символа, соответствующего сгенерированному числу, в строку
        (new Random()).ints((int) 'A', ((int) 'Z') + 1).limit(2).forEach(x -> createName.append((char) x));
        // Создание трехзначного случайного числа и добаление его в строку
        (new Random()).ints(0, 999).limit(1).forEach(createName::append);
        this.name = createName.toString();
    }

    public String getName () { return this.name; }

    public void reset () { generateName();}
}