
PImage face;
void setup() {
  face = loadImage("PIimage.jpeg");
  size(800,600);
  face.resize(width,height);
} 
   
void draw() {
  background(face);
  fill(255,255,255);
  ellipse(300,276,325,300);
  ellipse(607,339,325,300);
  if (mouseX>200 && mouseX<350 && mouseY>200 && mouseY<400) {
      fill(0,0,0);
      ellipse(mouseX,mouseY,25,25);
      ellipse(mouseX +300,mouseY + 75,25,25);
  }
}
