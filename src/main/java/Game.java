import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    Random random = new Random();
    Scanner input = new Scanner(System.in);

    ArrayList<Player> yourTeam = new ArrayList<Player>(3);
    ArrayList<Player> enemyTeam = new ArrayList<Player>(3);

    public Player generateRandomCharacter(int characterId) {
        Player character;

        switch (characterId) {
            case 0:
                character = new Rogue();
                character.setTeamNumber(character.getTeamNumber());
                break;
            case 1:
                character = new Druid();
                break;
            case 2:
                character = new Warrior();
                break;
            case 3:
                character = new Wizard();
                break;

            case 4:
                character = new Orge();
                break;
            case 5:
                character = new Paladin();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + characterId);
        }
        return character;
    }

    public void selectRandomPlayer() {

        for (int i = 0; i < 3; i++) {

            yourTeam.add(generateRandomCharacter(random.nextInt(6)));
            enemyTeam.add(generateRandomCharacter(random.nextInt(6)));

            yourTeam.get(i).setTeamNumber(i+1);
            enemyTeam.get(i).setTeamNumber(i+1);

        }
        System.out.print("Your team: "+
                "\n---------------------------------");
        System.out.println(yourTeam);

        System.out.print("Enemies team: " +
                "\n---------------------------------");
        System.out.println(enemyTeam);


        System.out.print("Your turn!\n");

        System.out.print("Attack with: " + yourTeam.get(random.nextInt(3)) + " \n");

        System.out.print("Attack enemy: \n");


       int myPlayerIndex = random.nextInt(3);
       Player myPlayer = yourTeam.get(myPlayerIndex);

       int enemyPlayerIndex = random.nextInt(3);
        Player enemyPlayer = enemyTeam.get(enemyPlayerIndex);

        myPlayer.getAttack();
        enemyPlayer.getAttack();
    }
}
