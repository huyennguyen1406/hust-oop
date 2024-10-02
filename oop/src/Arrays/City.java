import java.util.ArrayList;

public class City {

    String name;
    int s;
    int pop;
    ArrayList<City> forks;

    public City(String name, int s, int pop) {
        this.name = name;
        this.s = s;
        this.pop = pop;
        this.forks = new ArrayList<>();
    }

    public void addFork(City city) {
        if (!forks.contains(city)) {
            forks.add(city);
        }
    }

    public boolean isVowelCity() {
        return "AEIOU".contains(name);
    }
}

