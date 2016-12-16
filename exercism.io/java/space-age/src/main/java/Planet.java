/**
 * Created by Admin on 10.12.2016.
 */
public enum Planet {
    EARTH (31557600),
    MERCURY (EARTH.yearInSec() * 0.2408467),
    VENUS   (EARTH.yearInSec() * 0.61519726),
    MARS    (EARTH.yearInSec() * 1.8808158),
    JUPITER (EARTH.yearInSec() * 11.862615),
    SATURN  (EARTH.yearInSec() * 29.447498),
    URANUS  (EARTH.yearInSec() * 84.016846),
    NEPTUNE (EARTH.yearInSec() * 164.79132);

    private final double PlanetYearSeconds;

    Planet (double PlanetYearSeconds) {
        this.PlanetYearSeconds = PlanetYearSeconds;
    }

    double yearInSec () {
        return this.PlanetYearSeconds;
    }
}
