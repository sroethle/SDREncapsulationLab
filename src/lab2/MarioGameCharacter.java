package lab2;

/**
 *
 * @author Scott Roethle
 */
public class MarioGameCharacter {
    
    private int startingNumLives=3;
    private int remainingNumLives=startingNumLives;
    private boolean largeCharacterSize = true;
    private boolean invicibility = false;
    private int maxSpeedValue = 100;
    private int currentSpeedValue = 0;

    public int getRemainingNumLives() {
        return remainingNumLives;
    }

    public void setRemainingNumLives(int remainingNumLives) {
        this.remainingNumLives = remainingNumLives;
    }
    
    public void accelorateCharacter() {
        currentSpeedValue = currentSpeedValue+5;
    }

    public void decelorateCharacter() {
        currentSpeedValue = currentSpeedValue-5;
    }

    public void jump() {
        //code to make Mario character jump
    }

    public void changeDirection() {
        //code to change direction of Mario Character
    }
    
    public void changeCharacterSize(boolean increase){
        if(increase ==true){
            largeCharacterSize = true;
        }else{
            if(largeCharacterSize == false){
                remainingNumLives--;
            }
        }
    }
    
    public void turnStarPowerOn(){
        invicibility = true;
        maxSpeedValue = maxSpeedValue*2;
    }
    
    public void turnStarPowerOff() {
        invicibility = false;
        maxSpeedValue = maxSpeedValue/2;
    }
    
    public void firePower(){
        //code to allow mario to have the ability to shoot fire.
    } 
}