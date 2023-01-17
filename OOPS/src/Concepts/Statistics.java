package Concepts;

abstract class CricketPlayer
{
	private String name;
	private int age;
	private int matches;
	private String team;
	
	public abstract double calAverage();
	
	public CricketPlayer(String name, int age, int matches, String team) {
		super();
		this.name = name;
		this.age = age;
		this.matches = matches;
		this.team = team;
	}
	public CricketPlayer() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}	
}

class Batsman extends CricketPlayer
{
	private int runsScored;
	private int ballsFaced;
	
	public Batsman(String name, int age, int matches, String team, int runsScored, int ballsFaced) {
		super(name, age, matches, team);
		this.runsScored = runsScored;
		this.ballsFaced = ballsFaced;
	}

	public Batsman() {

	}

	double calStrikeRate()
	{
		return (double) this.runsScored / this.ballsFaced;
	}

	@Override
	public String toString() {
		return getName() + "---" + getAge() + "---" + getTeam() + "---" + getMatches() + "---" + runsScored  + "---" + ballsFaced  + "---" + String.format("%.2f", calStrikeRate()) + "---" + String.format("%.2f", calAverage());
	}

	public double calAverage() {
		return (double) runsScored / getMatches();
	}
	
}

class Bowler extends CricketPlayer
{
	private int runsGiven;
	private int wicketsTaken;
	
	
	public Bowler(String name, int age, int matches, String team, int runsGiven, int wicketsTaken) {
		super(name, age, matches, team);
		this.runsGiven = runsGiven;
		this.wicketsTaken = wicketsTaken;
	}
	
	public Bowler() {
		
	}

	@Override
	public String toString() {
		return getName() + "---" + getAge() + "---"  + getMatches() + "---" + getTeam() + "---" + runsGiven + "---" + wicketsTaken + "---" + String.format("%.2f", calEconomy()) + "---" + String.format("%.2f", calAverage());
	}

	double calEconomy()
	{
		return (double)this.runsGiven / this.getMatches();
	}

	
	public double calAverage() {
		return (double) runsGiven / wicketsTaken;
	}
}

public class Statistics {

	public static void main(String[] args) 
	{
		Batsman bt1 = new Batsman("MS Dhoni", 42, 50, "CSK", 4502, 100);
		Batsman bt2 = new Batsman("Virat Kohli", 35, 76, "RCB", 6590, 170);
		
		Batsman[] batArray = {bt1, bt2};
		
		Bowler bw1 = new Bowler("Bumrah", 30, 36, "MI", 2000, 1002);
		Bowler bw2 = new Bowler("Shami", 37, 59, "DC", 2120, 1500);
		
		Bowler[] bwArray = {bw1, bw2};
		
		System.out.println("---------BOWLER----------");
		System.out.println("NAME---AGE---MATCHES---TEAM---RUNS GIVEN---WICKETS TAKEN---ECONOMY---AVERAGE");
		
		for(Bowler bowler : bwArray)
			System.out.println(bowler);
		
		System.out.println("---------BATSMAN----------");
		System.out.println("NAME---AGE---MATCHES---TEAM---RUNS SCORED---BALLS FACED---STRIKE RATE---AVERAGE");
		
		for(Batsman batsman : batArray)
			System.out.println(batsman);
		
	}

}
