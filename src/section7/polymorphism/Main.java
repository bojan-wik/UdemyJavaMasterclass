package section7.polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark attack poor people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Will Smith kicks aliens asses!";
    }
}

class KillBill extends Movie {
    public KillBill() {
        super("Kill Bill");
    }

    @Override
    public String plot() {
        return "Uma Thurman fights kung-fu";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Jedi versus Sith";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    // no plot() method
}

public class Main {

    public static Movie randomMovie() {
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.printf("Generated number: %d", randomNumber).println();
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new KillBill();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }

    public static void main(String[] args) {
    }
}
