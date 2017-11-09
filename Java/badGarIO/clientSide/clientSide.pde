import java.io.*;
import java.net.*;

Socket socket=null;
ObjectInputStream inStream = null;
ObjectOutputStream outStream=null;

ArrayList<Food> foods = new ArrayList<Food>();//this doesn't control food, but needs to draw it
ArrayList<rPlayer> rPlayers = new ArrayList<rPlayer>();
Player localPlayer;
rPlayer localrPlayer;
int numPlayers,numFoods;

void setup() {
  size(1024, 768);
  localPlayer=(new Player(random(0,width), random(0,height)));
  frameRate(60);
  noStroke();
  textAlign(CENTER);
  background(255, 255, 255);
}

void draw() {
   localrPlayer=new rPlayer(localPlayer.playerID,localPlayer.radius,localPlayer.x,
                localPlayer.y,localPlayer.r,localPlayer.g,localPlayer.b,1);
     try{
       socket=new Socket("localHost",24342);
       println("Connected");
       //it only connects in bursts of 51 per server start??? Have to start client 1st sometimes???
       
       outStream=new ObjectOutputStream(socket.getOutputStream());
       outStream.writeObject(localrPlayer);
       println('a');//this is never printed???
       inStream=new ObjectInputStream(socket.getInputStream());
       println("s");//this code never gets run???
       rPlayer inPlayer=(rPlayer)inStream.readObject();
       println(inPlayer.playerID);//doesn't print anything...
       
     }catch(IOException e){}
      catch(ClassNotFoundException e){}
   
  
  //display everything
  for(int i=0; i<foods.size(); ++i){
    foods.get(i).display();
  }
  //update local player
  
  //get other players
  
  //get foods
}

void addPlayer(int x, int y) {
    localPlayer=(new Player(x, y));
}