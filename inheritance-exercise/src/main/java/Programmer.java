public class Programmer extends Employee {

    private String team;

    public Programmer(String name, String team) {
        super(name);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

}
