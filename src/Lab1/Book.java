package Lab1;

public class Book {
    private String name;
    public int price;

    public Book(int price) {
        this.price = price;
    }

    public String getName() {
        return name;

    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rentalCost(int numDays) {
        price = numDays * 10;
    }
}
