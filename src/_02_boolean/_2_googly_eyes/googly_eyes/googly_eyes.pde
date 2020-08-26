
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
  fill(0,0,0);
  ellipse(mouseX,mouseY,25,25);
  
}
