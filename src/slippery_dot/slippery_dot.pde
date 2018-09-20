int x = 250;
int y = 250;
int size = 100;
void setup() {
 size(500,500); 
}
void draw() {
  background(0,255,0);
  ellipse(x,y,size,size);
}
void mousePressed() {
  int distance = getDistance(mouseX,mouseY,x,y);
  print(distance);
  if (distance<size/2) {
   x=(int)random(500);
   y=(int)random(500);
  }
}
int getDistance(int x1, int y1, int x2, int y2) {
  return (int)Math.sqrt((y2-y1) * (y2-y1) + (x2-x1) * (x2-x1));
}