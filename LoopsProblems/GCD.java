public class GCD {
    public static int gcdCalula(int num1,int num2){
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }
    public static void main(String[] args) {
        int num1=12;
        int num2=18;
        int gcd=gcdCalula(num1,num2);
        System.out.println(num1+" "+num2+" GCD: "+gcd);
    }
}
