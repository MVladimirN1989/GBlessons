
public class Opa {

    public static void main(String[] args) {
        //test(2,4,4,2);
       // System.out.println(test(2,4,4,2));
        //num();
        //zero();
        guessYear();

    }
    static float test (float a,float b,float c,float d ){

        return a * (b + (c / d));
}

    static boolean num() {
        int r = 16;
        int t = 9;
        int sum = r+t;
        if (sum>=10 & sum<=20){
            System.out.println("входит в диапазон");
            return true;
        }
        System.out.println("диапазон ФОЛС");
        return false;
    }
    public static void zero() {
        int p = -10;
        if (p >= 0) {
            System.out.println("Число положительное");
        }
        if (p < 0) {
            System.out.println("Число отрицательное");
        }
    }

    public static void guessYear(){
        int year=1964;
        if (year%4==0 || year%400==0 && year%100!=0){
            System.out.println("год високосный");
        }
        else {
            System.out.println("этот год НЕ високосный");
        }
    }


}
