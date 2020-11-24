public abstract class Number{

  public abstract double getValue();

  public boolean equals(Number other){
    if (getValue()==0){
      if (other.getValue()==0) return true;
      else return false;
    }
    else{
      return (Math.abs(getValue() - other.getValue()) / getValue()) < 0.00001;
    }
  }


}
