/**
 * Created by Moravia on 11/22/16.
 */
class Batter {
    int timesAtBat;
    int[] arrayOfAtBats;
    int numberOfAtBatsWithAtLeastOneBase;
    int totalBases;
    double battingAverage;
    double sluggingPercentage;

    // Batting average is total number of at-bats for which the player earned at least one base divided by the total number of at-bats.
    public double getBattingAverage() {
        battingAverage = (double) numberOfAtBatsWithAtLeastOneBase / arrayOfAtBats.length;
        return battingAverage;
    }

    // Slugging percentage is the total number of bases earned divided by the total number of at-bats.
    public double getSluggingPercentage() {
        sluggingPercentage = (double) totalBases / arrayOfAtBats.length;
        return sluggingPercentage;
    }
}