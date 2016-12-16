/**
 * Created by Admin on 10.12.2016.
 */
public class SpaceAge {
    private long ageInSec;

    public SpaceAge(long ageInSec) {
        this.ageInSec = ageInSec;
    }

    public long getSeconds () {
        return this.ageInSec;
    }

    private double calcAgeOnPlanet (Planet planet) {
        return this.ageInSec / planet.yearInSec();
    }
    
    public double onEarth   () { return calcAgeOnPlanet (Planet.EARTH); }
    public double onMercury () { return calcAgeOnPlanet (Planet.MERCURY); }
    public double onVenus   () { return calcAgeOnPlanet (Planet.VENUS); }
    public double onMars    () { return calcAgeOnPlanet (Planet.MARS); }
    public double onJupiter () { return calcAgeOnPlanet (Planet.JUPITER); }
    public double onSaturn  () { return calcAgeOnPlanet (Planet.SATURN); }
    public double onUranus  () { return calcAgeOnPlanet (Planet.URANUS); }
    public double onNeptune () { return calcAgeOnPlanet (Planet.NEPTUNE); }
}
