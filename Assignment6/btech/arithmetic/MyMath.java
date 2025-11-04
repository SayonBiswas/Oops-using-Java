package btech.arithmetic;

public class MyMath {
    public static double add(double num1, double num2){
        return num1 + num2;
    }
    public static double sub(double num1, double num2){
        return num1 - num2;
    }
    public static double mul(double num1, double num2){
        return num1 * num2;
    }
    public static double div(double num1, double num2){
        if(num2 == 0)
            return -1;
        else
            return num1 / num2;
    }
    public static double mod(double num1, double num2){
        if(num2 == 0)
            return -1;
        else
            return num1 % num2;
    }
}
