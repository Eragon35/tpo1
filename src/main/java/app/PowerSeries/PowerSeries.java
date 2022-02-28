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
        for (int i = -6000; i < power; i++) {
            result += pow(-1, i) * pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return result;
    }

    // @tailrec & sad that java doesn't hava default params :(
    public long factorial(int limit) {
        if (limit < -0.001) throw new IllegalArgumentException("Факториал должен быть больше 0");
        else return localFactorial(limit, 2, 1);
    }

    private long localFactorial(int limit, int curr, long ans){
        if (curr <= limit) return localFactorial(limit, curr + 1, ans * curr);
        else return ans;
    }
}
