package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/

class Vino {

    int alcoholContent;
    int sugarContent;
    int calories;

    public Vino (int alcoholContent){
        this.alcoholContent = alcoholContent;
    }
}

class Beer {

    int alcoholContent;
    int ibu;
    int calories;

    public Beer (int alcoholContent){
        this.alcoholContent = alcoholContent;

    }
}

class Bar {

    public static void main (String args[]) {
        Vino blanco = new Vino(12);
        Vino tinto = new Vino(14);

        //assign values to fields in blanco
        blanco.sugarContent = 20;
        blanco.calories = 90;

        //assign values to fields in tinto
        tinto.sugarContent = 12;
        tinto.calories = 85;

        System.out.println("Vino blanco has " + blanco.calories + " calories as well as " + blanco.sugarContent + " grams of sugar and "
                + blanco.alcoholContent + " percent alcohol.");

        System.out.println("Vino tinto has " + tinto.calories + " calories as well as " + tinto.sugarContent + " grams of sugar and "
                + tinto.alcoholContent + " percent alcohol.");

        Beer lager = new Beer(5);
        Beer ipa = new Beer(7);

        //assign values to fields in lager
        lager.ibu = 15;
        lager.calories = 120;

        //assign values to fields in ipa
        ipa.ibu = 50;
        ipa.calories = 150;

        System.out.println("Lager has " + lager.calories + " calories as well as " + lager.ibu + " IBUs and " +
        lager.alcoholContent + " percent alcohol.");

        System.out.println("IPA has " + ipa.calories + " calories as well as " + ipa.ibu + " IBUs and " +
                ipa.alcoholContent + " percent alcohol.");
    }
}