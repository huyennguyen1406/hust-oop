class Book {
    String name;
    int p;
    String a;
    String type;
    int price;

    public Book(String name, int p, String a, String type, int price) {
        this.name = name;
        this.p = p;
        this.a = a;
        this.type = type;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public int getP() {
        return p;
    }

    public String getA() {
        return a;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}

public class BookManage {
    public static void main(String[] args) {
        Book[] books = new Book[30];
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for (int i = 0; i < books.length; i++) {
            String name = String.valueOf(alphabet[i % 26]);
            int p = 500 + (i * (i + 1)) % 200;
            String a = String.valueOf(alphabet[(i * i + 2 * i + 1) % 26]);
            String type = String.valueOf(alphabet[(i + 15) % 26]);
            int price = 17000 * ((i % 50) + 2);

            books[i] = new Book(name, p, a, type, price);
        }

        int[] aCount = new int[26];
        for (Book book : books) {
            int authorIndex = book.a.charAt(0) - 'A';
            aCount[authorIndex]++;
        }

        int maxBooks = 0;
        int maxAuthorIndex = 0;
        for (int i = 0; i < aCount.length; i++) {
            if (aCount[i] > maxBooks) {
                maxBooks = aCount[i];
                maxAuthorIndex = i;
            }
        }

        System.out.println("Tác giả xuất bản nhiều nhất: " + alphabet[maxAuthorIndex] + " với số sách: " + maxBooks);
    }
}
