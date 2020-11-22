public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno==0){
      numerator = 0;
      denominator = 1;
    }
    if (deno<0){
      numerator = nume * (-1);
      denominator = deno * (-1);
      reduce();
    }
    else{
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue(){
    return (double)(getNumerator()/getDenominator());
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber r = new RationalNumber(getDenominator(), getNumerator());
    return r;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (getNumerator()==other.getNumerator() && getDenominator()==other.getDenominator());
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return getNumerator()+"/"+getDenominator();
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    if (a<b){
      int c = a;
      a = b;
      b = c;
    }
    int r = (a%b);
    while (r!=0){
      a = b;
      b = r;
      r = (a%b);
    }
    return b;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int n1 = getNumerator();
    int d1 = getDenominator();
    numerator = n1/gcd(n1,d1);
    denominator = d1/gcd(n1,d1);
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber(getNumerator() * other.getNumerator(), getDenominator() * other.getDenominator());
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber quotient = new RationalNumber(getNumerator() * other.getDenominator(), getDenominator() * other.getNumerator());
    return quotient;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    RationalNumber sum = new RationalNumber(getNumerator()*other.getDenominator() + other.getNumerator()*getDenominator(), getDenominator() * other.getDenominator());
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    RationalNumber difference = new RationalNumber(getNumerator()*other.getDenominator() - other.getNumerator()*getDenominator(), getDenominator() * other.getDenominator());
    return difference;
  }
}
