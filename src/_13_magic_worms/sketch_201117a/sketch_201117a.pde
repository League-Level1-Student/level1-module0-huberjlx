int randomNumber = (int) random(600);
int randomNumberY = (int) random(600);
float x = randomNumber;
float y = randomNumberY;


void setup() {
  size(600, 600);
  background(#030303);
}
void draw() {
  makeMagical();
  for (int i = 0; i < 300; i++) {
    fill(#FF0505);
    ellipse(x, y, 5, 10);
    x = getWormX(i);
    y = getWormY(i);
  }
}
 float frequency = .001;
 float noiseInterval = PI;

void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
