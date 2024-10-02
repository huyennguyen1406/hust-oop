public class Main {
    public static void main(String[] args) {
        City[] cities = new City[26];
        // for (int i = 0; i < 26; i++) {
        for (int i = 'A'; i <= 'Z'; i++) {
            char cName = (char) i;
            // String name = Character.toString((char) ('A' + i));
            String name = String.valueOf(cName);
            // int s = name.charAt(0);
            int s = i;
            int pop = s * s;
            cities[i - 'A'] = new City(name, s, pop);
        }

        for (int i = 0; i < 26; i++) {
            City currentCity = cities[i];

            currentCity.addFork(cities[(i + 1) % 26]);
            currentCity.addFork(cities[(i * i) % 26]);
            currentCity.addFork(cities[(i * (i + 1)) % 26]);

            if (currentCity.isVowelCity()) {
                for (int j = 0; j < 26; j++) {
                    if (cities[j].isVowelCity() && j != i) {
                        currentCity.addFork(cities[j]);
                    }
                }
            }
        }

        City cityWithMostForks = null;
        int maxForks = 0;
        for (City city : cities) {
            int forkCount = city.forks.size();
            if (forkCount > maxForks) {
                maxForks = forkCount;
                cityWithMostForks = city;
            } else if (forkCount == maxForks) {
                if (city.pop > cityWithMostForks.pop) {
                    cityWithMostForks = city;
                }
            }
        }
        System.out.println("Thành phố có nhiều kết nghĩa nhất: " + cityWithMostForks.name +
                " với dân số: " + cityWithMostForks.pop);
    }
}
