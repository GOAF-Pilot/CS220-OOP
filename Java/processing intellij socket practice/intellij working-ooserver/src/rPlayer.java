import java.io.*;
import static java.lang.Math.*;

public class rPlayer implements Serializable{
    float playerID;
    float radius;
    float x;
    float y;
    float r;
    float g;
    float b;
    float alive;

    private static final long serialVersionUID=423085672398756234L;

    rPlayer(float id, float radius, float x, float y, float r, float g, float b, float alive){
        this.playerID=id;
        this.radius=radius;
        this.x=x;
        this.y=y;
        this.r=r;
        this.g=g;
        this.b=b;
        this.alive=1;
    }

    static double distance(float x1, float y1, float x2, float y2){
        return sqrt(pow((x1-x2),2)+pow((y1-y2),2));
    }
}