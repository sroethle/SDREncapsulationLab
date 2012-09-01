package lab2;

/**
 *
 * @author Scott Roethle
 */
public class SuperMarioBrothersLevel {
    
    private int numberOfShells;
    private int levelTimeLimit;
    private int numberOfBadGuys;
    private int numberOfExtraLives;

    SuperMarioBrothersLevel(int numberOfShells, int levelTimeLimit,
            int numberOfBadGuys, int numberOfExtraLives) {
        //validate all inputs
        this.numberOfShells = numberOfShells;
        this.levelTimeLimit = levelTimeLimit;
        this.numberOfBadGuys = numberOfBadGuys;
        this.numberOfExtraLives = numberOfExtraLives;
    }

    public void shootFireBallAtMario() {
        //code to shoot at mario
    }

    public void drownMario() {
        //code to kill mario if he drowns
    }

    public void attackMario() {
        //code to attack mario with one of the bad guys.
    }
}
