PImage pictureOfRecord;  
int xPos = 0;
int yPos = 0;
int r = 0;

public void setup(){ 
     size(600,600);   
    pictureOfRecord= loadImage("spinningRecord.jpeg");
    pictureOfRecord.resize(height,width);
    image(pictureOfRecord, xPos, yPos);
}
  

public void draw(){

  rotateImage(pictureOfRecord, r);
 image(pictureOfRecord, xPos, yPos);
 if (mousePressed) {
   r++;
 }
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
}
