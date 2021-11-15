public class Factorial {
    public long calcFactorial(int n){
        long fact = 1;
        while (n>1){fact*=n;n--;}
        return fact;
    }
    public double calcE(){
        double e = 1;
        int i = 1;
        double olde = 0;
        while(e - olde > .001){
            olde=e;
            e+=1.0/calcFactorial(i);
            i++;
        }
        return ((int)(e*1000)/1)/1000.0;
    }
    public double calcEX(int x){
        double ex = 1;
        int i = 1;
        double olde = 0;
        while(ex - olde > .00001) {
            olde = ex;
            ex += 1.0*Math.pow(x,i)/calcFactorial(i);
            i++;
        }
        return ((int)(ex*1000)/1)/1000.0;
    }
    public static void main(String[] args) {
        Factorial m = new Factorial();
        for(int loop=1; loop<=20; loop++){
            System.out.println(m.calcFactorial(loop));
        }
        //1
        //2
        //6
        //24
        //120
        //720
        //5040
        //40320
        //362880
        //3628800
        //39916800
        //479001600
        //6227020800
        //87178291200
        //1307674368000
        //20922789888000
        //355687428096000
        //6402373705728000
        //121645100408832000
        //2432902008176640000

        System.out.println(m.calcE());
        //2.718
        for (int n=1;n<=5;n++){
            System.out.println("e^"+n+" is " +  m.calcEX(n));
        }
        //e^1 is 2.718
        //e^2 is 7.389
        //e^3 is 20.085
        //e^4 is 54.598
        //e^5 is 148.413
    }
}
