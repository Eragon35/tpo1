package app.PowerSeries;

import lombok.Data;

import static java.lang.Math.pow;


@Data
public class PowerSeries {

    // sin(x) = Sigma: -1^n * x^(2n + 1) / (2n + 1)!
    public double getResult(double x, int power) {
        if (power <= 0) throw new IllegalArgumentException("Степень должна быть больше 0");
        if (power > 33) throw new IllegalArgumentException("Это слишком долго считать, мальчик иди домой");
        double result = 0.0;
        for (int i = 0; i < power; i++) {
            result += pow(-1, i) * pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return result;
    }

    // @tailrec & sad that java doesn't hava default params :(
    public long factorial(int limit) {
        if (limit < 0) throw new IllegalArgumentException("Факториал должен быть больше 0");
        else return localFactorial(limit, 2, 1);
    }

    private long localFactorial(int limit, int curr, long ans){
        if (curr <= limit) return localFactorial(limit, curr + 1, ans * curr);
        else return ans;
    }


    public static void main(String[] args) {
        System.out.println(0.70327941920041);
        PowerSeries ps = new PowerSeries();
        int power = 24;
        System.out.println(ps.getResult(0.78, power));
        System.out.println(ps.factorial(power));
        System.out.println(Math.sin(0.78));
        // рофл, но при глубине больше 8 ответ перестаёт изменяться, т.к. double не бесконечен)
        // плюс максимальная глубина факториала 20,
        // дальше выходим за пределы long)))
        // Long.MAX_VALUE = 2^63 - 1 ~ 8 * 10 ^ 18, а 20! ~ 2 * 10 ^ 18 & 21! ~ 5 * 10 ^ 19
    }

}
