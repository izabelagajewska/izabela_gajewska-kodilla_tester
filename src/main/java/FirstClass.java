public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 500,2020);
        System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.yearOfProduction);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearOfProduction();


        Notebook heavyNotebook = new Notebook(2000,1000,2018);
        System.out.println(heavyNotebook.weight  + "g " + notebook.price + " " + heavyNotebook.yearOfProduction);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearOfProduction();


        Notebook oldNotebook = new Notebook(1200, 5000, 2010);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + " " + oldNotebook.yearOfProduction);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearOfProduction();

    }
}
