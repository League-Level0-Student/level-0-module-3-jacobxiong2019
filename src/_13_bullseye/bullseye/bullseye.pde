 int size = 250;
void setup() {
   background(#FAFAFA);
  size(700,700);
}
void draw() {
  size = 250;
  for(int i = 0; i < 10; i++)
  {
    if(i % 2 == 0)
    {
      fill(#C40000);
    }
    else
    {
     fill(#050505); 
    }
    ellipse(350, 350, size, size);
    size-=25;
  }
}
