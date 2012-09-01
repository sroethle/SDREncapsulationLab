package lab2;

/**
 *
 * @author Scott Roethle
 */
public class SuperMarioBrothersGame {
    private int levelNumber=1;
    private int numberPoints=0;
    private int startingNumLives=3;
    private int remainingNumLives=startingNumLives;
    
    public SuperMarioBrothersGame(){
        MarioGameCharacter mario = new MarioGameCharacter();
        
        
    }
    
    private void endGame() {
        //code to end the game here
    }
    
    public void changeLevel(){
        levelNumber++;
    }
    
    public void loseOneLife(){
        remainingNumLives--;
        if (remainingNumLives == 0) {
            endGame();
        }
    } 
    
}
