int randomNumber = (int) random(600);
int x = randomNumber;
int y = 0;
int rectY = 550;
int rectX = 300;
int score = 0;

void setup() {
  size(600,600);
}

void draw() {
    background(#090350);
    fill(#000EFA);
    stroke(#000EFA);
    ellipse(x, y, 50, 50);
    y = y + 1;
    fill(#B9B9BF);
    rect(rectX, rectY, 60, 50);
    if (mouseX != rectX) {
      rectX = mouseX;
    }
    checkCatch(x, y);
    if (y == 600) {
      y = 0;
      x = (int) random(600);
    }
}
void checkCatch(int x, int y) {
    if (x > mouseX && x < mouseX+100 && y >= 550)
       score++;
    else if (score > 0 && y >= 550) 
       score--;
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
