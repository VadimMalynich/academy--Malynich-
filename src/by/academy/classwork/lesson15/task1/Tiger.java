package by.academy.classwork.lesson15.task1;

public class Tiger<priva> extends Cat {
    private int numberLines;
    protected String country;
    public String zoo;

    public Tiger() {
    }

    public Tiger(int numberLines, String country, String zoo) {
        this.numberLines = numberLines;
        this.country = country;
        this.zoo = zoo;
    }

    public Tiger(String breed, int age, String name, int numberLines, String country, String zoo) {
        super(breed, age, name);
        this.numberLines = numberLines;
        this.country = country;
        this.zoo = zoo;
    }

    private void printNumberLines() {
        System.out.println("Number of lines: " + numberLines);
    }

    protected void printCountry() {
        System.out.println("Country: " + country);
    }

    public void printZoo() {
        System.out.println("Zoo: " + zoo);
    }
}
