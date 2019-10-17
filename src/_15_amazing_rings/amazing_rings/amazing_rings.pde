void setup() {
  size(1280,720);
  background(#D8D8D8);
  int size = 500;
}
int x1 = 960;
int x = 320;


void draw() {
  if(x == 640 && x1 == 640){
    
  }
  background(#D8D8D8);
  int size = 500;
  for(int i = 0; i < 50; i++) {
  if(i % 2 == 0) {
      fill(#000000);
    }
    else
    {
     fill(#D8D8D8); 
    }
    ellipse(x++, 360, size, size);
    size-=10;
  }
  size = 500;
  for(int i = 0; i < 50; i++) {
  if(i % 2 == 0) {
      fill(#000000);
    }
    else
    {
     fill(#D8D8D8); 
    }
    ellipse(x1--, 360, size, size);
    size-=10;
  }
}void setup() {
  size(1280,720);
  background(#D8D8D8);
  int size = 500;
}
int x1 = 960;
int x = 320;


void draw() {
  if(x == 640 && x1 == 640){
    
  }
  background(#D8D8D8);
  int size = 500;
  for(int i = 0; i < 50; i++) {
  if(i % 2 == 0) {
      fill(#000000);
    }
    else
    {
     fill(#D8D8D8); 
    }
    ellipse(x++, 360, size, size);
    size-=10;
  }
  size = 500;
  for(int i = 0; i < 50; i++) {
  if(i % 2 == 0) {
      fill(#000000);
    }
    else
    {
     fill(#D8D8D8); 
    }
    ellipse(x1--, 360, size, size);
    size-=10;
  }
}
