public class Notebook {
    int weight;
    int price;
    int yearOfProduction;


    public Notebook(int weight, int price, int yearOfProduction) {
        this.weight = weight;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("This price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 600 && this.weight <= 1200) {
            System.out.println("This notebook is not too heavy.");
        } else if (this.weight > 1200) {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearOfProduction() {
        if (this.yearOfProduction == 2020) {
            System.out.println("Year of production: 2020.");
        } else if (this.yearOfProduction == 2010) {
            System.out.println("Year of production: 2010.");
        } else if (this.yearOfProduction == 2018) {
            System.out.println("Year of production: 2018.");
        }
    }

    public void checkYearAndWeight() {
        if (this.yearOfProduction < 2000 && this.weight > 6000) {
            System.out.println("this notebook is very old and very heavy,");

        } else if (this.yearOfProduction > 2000 && this.yearOfProduction < 2020 && this.price > 2000 && this.weight > 60) {
            System.out.println("This notebook may explode.");
        }

    }
}
