class MathOperation{
    static void sum (int i , int j){
        int k = i+j;
        System.out.println(k);
    }
    static void sum (float i, float j, float k){
        float M =i+j+k;
        System.out.println(M);
        
    }
    static void sum (double i, int j){
        double M =i+j;
        System.out.println(M);
        
    }
}

class Que36{
    public static void main(String argc []){
        MathOperation.sum(12,13);
        MathOperation.sum(12f,13f,14f);
        MathOperation.sum(12,13);
    }
}