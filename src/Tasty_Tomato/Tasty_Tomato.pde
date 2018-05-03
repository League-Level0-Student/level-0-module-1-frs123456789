
int x=0;
int y=0;


void setup() {
    size(500, 500);
    
}
void draw() {
  
  fill(217,0,0);
    background(255,255,255);
    noStroke();
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    
    fill(78, 152, 0);
    rect(176, 103, 12, 32);
    

    
   if(mousePressed){
     x=mouseX;
     y=mouseY;
     
   
    
    
    
}
fill(255,255,255);
    ellipse(x,y, 50,50);
}

   