package PolynomialOperation;

import java.util.ArrayList;

public class Polynomial {
    ArrayList<Integer> arrayList = new ArrayList<>();

    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
     *  is already present in the polynomial then previous coefficient is replaced by
     *  new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coeff){
        if(degree >= this.arrayList.size()){
            for(int i=arrayList.size();i<=degree;i++){
                arrayList.add(i,0);
            }
        }
        arrayList.set(degree,coeff);

    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree.
    public void print(){
        for(int i=0;i<this.arrayList.size();i++){
            if(this.arrayList.get(i)!=0 && this.arrayList.get(i)!= null)
                System.out.print(this.arrayList.get(i)+"x"+i+" ");
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial result = new Polynomial();
        int max = Math.max(this.arrayList.size(), p.arrayList.size());
        if(max==this.arrayList.size()){
            for(int i=0;i<this.arrayList.size();i++){
                result.arrayList.add(i,this.arrayList.get(i));
            }
            for(int j=0;j<p.arrayList.size();j++){
                result.arrayList.set(j, result.arrayList.get(j)+p.arrayList.get(j));
            }
        }
        else if(max==p.arrayList.size()){
            for(int i=0;i<p.arrayList.size();i++){
                result.arrayList.add(i,p.arrayList.get(i));
            }
            for(int j=0;j<this.arrayList.size();j++){
                result.arrayList.set(j, result.arrayList.get(j)+this.arrayList.get(j));
            }
        }
        return result;

    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial result = new Polynomial();
        int max = Math.max(this.arrayList.size(), p.arrayList.size());
        if(max==this.arrayList.size()){
            for(int i=0;i<this.arrayList.size();i++){
                result.arrayList.add(i,this.arrayList.get(i));
            }
            for(int j=0;j<p.arrayList.size();j++){
                result.arrayList.set(j, result.arrayList.get(j)-p.arrayList.get(j));
            }
        }
        else if(max==p.arrayList.size()){
            for(int i=0;i<p.arrayList.size();i++){
                result.arrayList.add(i,(-p.arrayList.get(i)));
            }
            for(int j=0;j<this.arrayList.size();j++){
                result.arrayList.set(j, this.arrayList.get(j)+result.arrayList.get(j));
            }
        }
        return result;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p){
        Polynomial result = new Polynomial();
        for(int i=0;i<this.arrayList.size();i++){
            if(this.arrayList.get(i)!=0 && this.arrayList.get(i)!=null){
                for(int j=0;j<p.arrayList.size();j++){
                    if(p.arrayList.get(j)!=0 && p.arrayList.get(j)!=null){
                        int coefficient = this.arrayList.get(i)*p.arrayList.get(j);
                        int degree = i+j;
                        if(result.arrayList.size()<=degree){
                            result.setCoefficient(degree,coefficient);
                        }
                        else{
                            result.arrayList.set(degree, result.arrayList.get(degree)+coefficient);
                        }
                    }
                }
            }
        }
        return result;
    }

}
