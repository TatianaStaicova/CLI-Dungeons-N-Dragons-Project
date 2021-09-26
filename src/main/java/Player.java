public class Player {

    private String name;
    private int currentHealth;
    private int maxHealth;
    private int attack;
    private int defense;
    private int speed;
    private int teamNumber;

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

public Player(String name, int maxHealth, int attack, int defense, int speed){
    this.name = name;
    this.maxHealth = maxHealth;
    this.attack = attack;
    this.defense = defense;
    this.speed = speed;
    this.currentHealth = maxHealth;
}

    @Override
    public String toString() {
        return
                "\n " + name + teamNumber +
                "\n Health: " + currentHealth + " / " + maxHealth +
                "\n Attack: " + attack +
                "\n Defense: " + defense +
                "\n Speed: " + speed +
                "\n \n";
    }
    public Player(){}

}