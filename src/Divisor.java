import java.util.ArrayList;

public class Divisor {
    public static ArrayList<Divisor> divisorsList = new ArrayList<Divisor>();
    private int divisor;
    private String name;

    public Divisor(int divisor, String name) {
        this.divisor = divisor;
        this.name = name;

        divisorsList.add(this);
    }

    public int getDivisor() {
        return divisor;
    }

    public String getName() {
        return name;
    }
}
