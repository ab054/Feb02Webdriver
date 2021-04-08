public class House {

    int price;
    int squareFeet;
    int numberOfBedrooms;
    String year;

    House(int price, int numberOfBedrooms){
        this.price = price;
        this.numberOfBedrooms = numberOfBedrooms;
    }

    void buy(){
        System.out.println("HOUSE IS BOUGHT");
    }

    void sell(){
        System.out.println("HOUSE IS SOLD");
    }

    void printAllInfo(){
        System.out.println("price: " + price + " squareFeet" + squareFeet + " numberOfBedrooms" + numberOfBedrooms +
               " year" + year);
    }

    void setPrice(int newPrice){
        this.price = newPrice;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String newYear) {
        this.year = newYear;
    }
}
