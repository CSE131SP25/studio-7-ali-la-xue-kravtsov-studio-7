package studio7;

public class HockeyPlayer {
    String name;
    int jerseyNumber;
    String shootingHand;
    String dominantHand;
    int totalGoals;
    int totalAssists;
    int totalGames;

    public HockeyPlayer(String name, int jerseyNumber, String shootingHand, String dominantHand) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.shootingHand = shootingHand;
        this.dominantHand = dominantHand;
        this.totalGoals = 0;
        this.totalAssists = 0;
        this.totalGames = 0;
    }

    public void completeGame(int goals, int assists) {
        this.totalGoals += goals;
        this.totalAssists += assists;
        this.totalGames += 1;
    }
    
    public int getTotalPoints() {
        return this.totalGoals + this.totalAssists;
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
               "Jersey Number: " + this.jerseyNumber + "\n" +
               "Shooting Hand: " + this.shootingHand + "\n" +
               "Dominant Hand: " + this.dominantHand + "\n" +
               "Total Goals: " + this.totalGoals + "\n" +
               "Total Assists: " + this.totalAssists + "\n" +
               "Total Points: " + getTotalPoints() + "\n" +
               "Total Games Played: " + this.totalGames;
    }

    public static void main(String[] args) {
        HockeyPlayer player1 = new HockeyPlayer("Wayne Gretzky", 99, "Left", "Right-handed");

        player1.completeGame(4, 4); // 4 goals, 4 assist
        player1.completeGame(3, 4); // 2 goals, 4 assists
        player1.completeGame(2, 5); // 2 goals, 5 assists

        System.out.println(player1);

        System.out.println("Total Points: " + player1.getTotalPoints()); // 22 points
    }
}