import java.util.Arrays;

public class Ride {
    private String name;
    private double price;
    private int year;
    String[] categories;

    public Ride(String name, double price, int year, String[] categories) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.categories = Arrays.copyOf(categories, categories.length);
    }

    public Ride(Ride source) {
        this.name = source.name;
        this.price = source.price;
        this.year = source.year;
        this.categories = Arrays.copyOf(source.categories, source.categories.length);;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setCategories(String[] categories) {
        this.categories = Arrays.copyOf(categories, categories.length);
    }

    public String[] getCategories() {
        return Arrays.copyOf(categories, categories.length);
    }

    public void ride() {
        System.out.println("Welcome to the " + this.name + " ride. " + "The cost of this ride is $" 
        + this.price + ". This premium ride was added to the park in " + this.year + ".");
        System.out.print("Categories associated with ride: ");
        for (int i =0; i < this.categories.length; i++) {
            System.out.print(this.categories[i] + " ");
        }
        System.out.println();
    }

    public String toString() {
        return "Name: "  + this.name + ".\n"
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Categories: " + Arrays.toString(categories) + ".\n";
    }
    
}
