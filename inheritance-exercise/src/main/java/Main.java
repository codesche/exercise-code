public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer("Jonathan", "Seoul");

        String name = p.getName();
        String team = p.getTeam();

        System.out.println(name + " is assigned to the " + team + " team");
    }
}
