class Cylinder{
    private int radius;
     private int height;
     
    public Cylinder(int radius , int height){
        this.radius = radius;
        this.height = height;
    }
     
    public int getradius() {
        return radius;
    }
    public void setradius( int radius){
        this.radius = radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height = height;
    }
}

public int Surfacearea (){
     return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
}
public class practiceset9 {
    public static void main(String[] args) {

        Cylinder myCylinder = new Cylinder(12,4);
         myCylinder.setheight(12);
        System.out.println(myCylinder.getheight());
         myCylinder.setradius(4);
         int r = myCylinder.getradius();
        System.out.println(r);
        
    System.out.println(myCylinder.Surfacearea());
    }
    
}
