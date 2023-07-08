
public class PlanetExplorer{

public static void main(String[] args) {

PlanetExplorer explorer = new PlanetExplorer();
double d=explorer.calculateSurfaceArea(3.0);
System.out.printf("%.2f",d);

}


public double calculateSurfaceArea(double radius){
   double d=4*3.14*radius*radius;
   return d;
}

}
