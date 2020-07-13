public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 500, 2020);
        Notebook heavyNotebook = new Notebook(2000, 1000, 2018);
        Notebook oldNotebook = new Notebook(1200, 5000, 2010);

        displayNotebookParameters(notebook);
        displayNotebookParameters(heavyNotebook);
        displayNotebookParameters(oldNotebook);
    }

    private static void displayNotebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.yearOfProduction);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearOfProduction();
        notebook.checkYearAndWeight();
    }
}