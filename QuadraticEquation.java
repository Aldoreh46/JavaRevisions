package JavaRevisions;

public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
        
        double x1, x2;
        Roots root = new Roots(0,0);
        x1 =  ((-b + Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
        x2 =  ((-b - Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
       
        root = new Roots(x1,x2);
        return root;
    }
    

    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {         
        this.x1 = x1;
        this.x2 = x2;
    }
}