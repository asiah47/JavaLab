import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Squad[] squads = new Squad[32];

    public static void main(String[] args) {
        loadPlayers("Players.csv");
        loadManagers("Managers.csv");
    }

    private static void loadPlayers(String filename) {
        System.out.println(new File("Players.csv").getAbsolutePath());
        try (Scanner scanner = new Scanner(new File("Players.csv"))){
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                Player player = new Player(data[0], data[1], data[2], data[3],
                        Double.parseDouble(data[4]), Double.parseDouble(data[5]),
                        Double.parseDouble(data[6]), Double.parseDouble(data[7]),
                        Double.parseDouble(data[8]), Double.parseDouble(data[9]),
                        Double.parseDouble(data[10]), Double.parseDouble(data[11]),
                        Double.parseDouble(data[12]), Double.parseDouble(data[13]));
                System.out.println("Loaded player: " + player.getFirstName() + " " + player.getSurname());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static void loadManagers(String fileName) {
        try (Scanner scanner = new Scanner(new File("Managers.csv"))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                Manager manager = new Manager(data[0], data[1], data[2], data[3],
                        Double.parseDouble(data[4]), Double.parseDouble(data[5]),
                        Double.parseDouble(data[6]), Double.parseDouble(data[7]));
                System.out.println("Loaded manager: " + manager.getFirstName() + " " + manager.getSurname());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Team getTeam(Squad s){
        Team t = new Team(s.getTeamName(), s.getManager());

        return t;
    }

    public static void runTournament(){

    }
}