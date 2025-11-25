package OOPsInJava.Properties.Inheritance;

public class Parent {
  int l;
  int h;
  int w;

  Parent(){
      l = -1;
      h = -1;
      w = -1;
  }

  //cube
  Parent(int side){
      l = side;
      h = side;
      w = side;
  }

  //three input
    Parent(int l,int h,int w){
      this.l = l;
      this.h = h;
      this.w = w;
    }


  Parent(Parent old){
      l = old.l;
      h = old.h;
      w = old.w;
  }



}
