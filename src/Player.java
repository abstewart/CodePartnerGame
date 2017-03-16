/**
 * Created by rachel_chau on 3/15/17.
 */
public class Player extends Sprite{

    private boolean isJumping = false;
    private boolean onPlatform = false;

    public Player(){

        super(Main.FRAMEWIDTH / 2 - 25, Main.FRAMEHEIGHT * 8 / 9, NORTH);
        setPic("player.png", NORTH);
        setSpeed(25);

    }

    public void update(){
        if(isJumping){
            isJumping = false;
        }
    }

    public boolean jump(){
        return isJumping = true;
    }


}
