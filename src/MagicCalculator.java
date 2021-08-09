//import java.lang.Math;

public class MagicCalculator extends Calculator{
    public MagicCalculator(){}

    public double squareRoot(double n){
        return Math.sqrt(n);
    }

    public double sin(double n){
        return Math.sin(n);
    }
    public double cosine(double n){
        return Math.cos(n);
    }
    public double tangent(double n){
        return Math.tan(n);
    }

    public int factorial(int n){
        int product=1;
        for(int i=n;i>1;i--){
            product *= i;
        }
        return product;
    }
}
