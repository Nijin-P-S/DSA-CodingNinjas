public class Fraction {
    int numerator;
    int denominator;
    Fraction(int numerator, int denominator){
        this.numerator= numerator;
        this.denominator = denominator;
        this.simplify();
    }

    public void print(){
        System.out.println(this.numerator+"/"+this.denominator);
    }
    public void fractionAdd(Fraction f1){
        Fraction result = new Fraction(1,1);
        result.numerator = (f1.numerator* this.denominator)+(f1.denominator* this.numerator);
        result.denominator=(f1.denominator* this.denominator);
        result.simplify();
        System.out.println(result.numerator+"/"+result.denominator);
    }

    private void simplify() {
        int smallest = Math.min(this.numerator, this.denominator);
        int gcd=1;
        for(int i=2;i<=smallest;i++){
            if(this.numerator%i==0 && this.denominator%i==0){
                gcd =i;
            }
        }
        this.numerator/=gcd;
        this.denominator/=gcd;
    }
}
