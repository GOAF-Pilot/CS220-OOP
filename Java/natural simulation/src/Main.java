
import processing.core.*;

public class Main extends PApplet {

    public static void main(String args[]) {
        PApplet.main("Main");
    }

    HuntManager manager;

    @Override
    public void settings(){
        this.size(1280,800);
    }

    @Override
    public void setup() {
        textSize(32);
        manager = new HuntManager(10,20,this);
        frameRate(60);
    }
    public void draw() {
        background(255,255,255);
        manager.gameTick();
        manager.displayCreatures();
        manager.displayStats();
    }
}
