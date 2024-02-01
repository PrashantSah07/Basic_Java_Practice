class game {

  public int n;

   game(int n) {
    this.n= n;
  }  
  void setN(int a){ 
   n=a;
  }
  void getN(){ 
    System.out.println("The value of n is "+n);
  }
}

class App {

  public static void main(String[] args) { 
    game g=new game(7); 
    g.getN();
    g.n=5;
    g.getN();
  }
}
