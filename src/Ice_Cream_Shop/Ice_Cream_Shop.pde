int SCOOPSIZE = 150;
int scoops = 0;
int coneY = 320;

//Don't Touch this method; Call it!!
void makeIceCreamCone(){
     //noStroke();
     fill(188,126,49);
     triangle(190,320,310,300,255,500);
}

//Don't touch this method; call it!!!
void addScoop(String flavor){
     noStroke();
     if(flavor.equalsIgnoreCase("chocolate")){
         fill(116,71,16);
     }
     else if(flavor.equalsIgnoreCase("Strawberry")){
         fill( 232 ,144,129);
     }
     else if(flavor.equalsIgnoreCase("Vanilla")){
         fill(245, 243, 227);
     } else{
         println("ERROR: We don't have the flavor "+ flavor);
         return;
     }
     ellipse(width/2,coneY - 50 - (SCOOPSIZE*scoops)/2,SCOOPSIZE,SCOOPSIZE);
     scoops++;
}

//Don't Touch this method!!
void addSprinkle(int numberOfSprinkles){
    for(int i = 0; i<numberOfSprinkles; i++){
         fill(random(256),random(256),random(256));
         int minX = width/2-SCOOPSIZE/2 + 10;
         int maxX = SCOOPSIZE/3 +width/2 +10;
         int minY = coneY-((SCOOPSIZE)*scoops)/2-40;
         int maxY = coneY;
         int sprinkleAreaX = (int)random(minX, maxX);
         int sprinkleAreaY = (int)random(minY, maxY);
         int sprinkleWidth = (int)random(1,1);
         int sprinkleHeight = (int)random(1,1);
         ellipse(sprinkleAreaX,sprinkleAreaY,sprinkleHeight,sprinkleWidth);
     }
}
     void addSprinklex(int numberOfSprinklesx){
    for(int i = 0; i<numberOfSprinklesx; i++){
         fill(random(256),random(256),random(256));
         int minX = width/2-SCOOPSIZE/2 + 10;
         int maxX = SCOOPSIZE/3 +width/2 +10;
         int minY = coneY-((SCOOPSIZE)*scoops)/2-40;
         int maxY = coneY;
         int sprinkleAreaX = (int)random(minX, maxX);
         int sprinkleAreaY = (int)random(minY, maxY);
         int sprinkleWidth = (int)random(5,5);
         int sprinkleHeight = (int)random(5,5);
         ellipse(sprinkleAreaX,sprinkleAreaY,sprinkleHeight,sprinkleWidth);
    }
}
void setup() {
 size(500,500);
 makeIceCreamCone();
 for (int i=0; i<2; i++) {
 addScoop("Vanilla");
 addScoop("Chocolate");
 }
 addSprinkle(10000);
 addSprinklex(700);
 fill(255,0,0);
 ellipse(250,50,20,20);
}