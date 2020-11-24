public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
//  public boolean equals(RealNumber other){
//    if (getValue()==0){
//      if (other.getValue()==0) return true;
//      else return false;
//    }
//    else{
//      return (Math.abs(getValue() - other.getValue()) / getValue()) < 0.00001;
//    }
//  }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber
     //or other subclasses of RealNumber (that aren't written yet)
    RealNumber sum = new RealNumber(getValue() + other.getValue());
    return sum;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
        RealNumber product = new RealNumber(getValue() * other.getValue());
	return product;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
        RealNumber quotient = new RealNumber(getValue() / other.getValue());
	return quotient;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    RealNumber difference = new RealNumber(getValue() - other.getValue());
    return difference;
  }
}
