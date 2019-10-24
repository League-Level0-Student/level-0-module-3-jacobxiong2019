void setup() {
  size(1280,720);
  
}
int x1 = 960;
int x = 320;


void draw() {
  background(#D8D8D8);
  if(x == 1280 && x1 == 0)
  {
    x=0;
    x1=1280;
  }
  for(int i = 30; i >= 0 ; i--) {
  if(i % 2 == 0) {
     noFill();
    }
      ellipse(x, 360, i*12, i*12);
  }
  for(int i1 = 30; i1 >= 0; i1--) {
  if(i1 % 2 == 0) {
     noFill();
    }
    ellipse(x1, 360, i1*12, i1*12);

  }
  x++;
  x1--;
  }
