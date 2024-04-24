public class Main {


    public static void main(String[] args) {
        Motorcycle Mofa = new Motorcycle("BMW", "unknown", 2020, "naked", false, 0);
        Mofa.setSpeed(10);
        System.out.println(Mofa.toString());
        System.out.println("Mofa is going at: " + Mofa.getSpeedInMiles() + "mi/h");

        Car Volvo = new Car("Volvo", "XC60", 2015, false, false, 0, 4);
        Volvo.setSpeed(215);
        System.out.println(Volvo.toString());
        System.out.println("Volvo is going at: " + Volvo.getSpeed() + "km/h");

        Library myLibrary = new Library();
        Book[] bookArray = {
                new Book("Mein Lieblingsbuch", "Autor A", "123456789"),
                new Book("Ein anderes Buch", "Autor B", "987654321")
        };
        myLibrary.setBooks(bookArray);
        System.out.println(myLibrary.toString());


    }
}
