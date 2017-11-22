
import processing.core.*;

public class Main extends PApplet {

    public static void main(String args[]) {
        PApplet.main("Main");
    }

    HuntManager manager;

    @Override
    public void settings(){
        this.size(1000,700);
    }

    @Override
    public void setup() {
        // TODO: Your custom drawing and setup on applet start belongs here
        manager=new HuntManager(1000,1000,this);
        //predators arent drawing
        frameRate(60);
    }
    public void draw() {
        // TODO: Do your drawing for each frame here
        background(255,255,255);
        manager.gameTick();
        manager.displayCreatures();
    }
}
