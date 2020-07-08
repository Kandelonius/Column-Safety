package polyMovie;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class NMBC extends Movie {
    public NMBC() {
        super("the Nightmare Before Christmas");
    }

    public String plot() {
        return "the pumpkin king Jack Skellington becomes tired of Halloween and tries his hand at Christmas";
    }
}

class DinnerWithAndre extends Movie {

    public DinnerWithAndre() {
        super("my Dinner with Andre");
    }

    @Override
    public String plot() {
        return "Two friends meet for dinner and have a fascinating conversation about life and ones expectations of it";
    }
}

class Hannibal extends Movie {

    public Hannibal() {
        super("Hannibal");
    }

    @Override
    public String plot() {
        return "Clarice tries to track Hannibal Lecter in Italy";
    }
}

class OneHourPhoto extends Movie {
    public OneHourPhoto() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "one hour photo employee becomes obsessed with a family after developing their photos for years and becomes too familiar with them";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    // No plot method
}
