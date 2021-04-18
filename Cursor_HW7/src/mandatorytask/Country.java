package mandatorytask;

import static mandatorytask.Continent.*;

public enum Country {
    UKRAINE("Ukraine", EUROPE),
    FRANCE("France", EUROPE),
    POLAND("Poland", EUROPE),
    ISRAEL("Israel", ASIA),
    USA("United States of America", NORTH_AMERICA),
    ITALY("Argentina", EUROPE),
    AUSTRALIA("Australia", OCEANIA);

    private final String countryName;
    private final Continent continent;

    Country(String countryName, Continent continent) {
        this.countryName = countryName;
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public Continent getContinent() {
        return continent;
    }
}
