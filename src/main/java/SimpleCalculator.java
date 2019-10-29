public class SimpleCalculator {

    public float add(float n1, float n2){
        return n1+n2;
    }

    public float multiply(float n1, float n2) {
        return n1*n2;
    }
    public float divide(float n1, float n2){
        if (n2==0){
            throw new ArithmeticException();
        }
        return n1/n2;
    }
}//end of class

