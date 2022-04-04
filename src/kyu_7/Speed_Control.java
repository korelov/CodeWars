package kyu_7;

// https://www.codewars.com/kata/56484848ba95170a8000004d/java

public class Speed_Control {
    public static int gps(int s, double[] x) {
        if(x.length<=1){
            return 0;
        }
        int temp = 0;
        double[] arr = new double[x.length - 1];
        for (int i = 1; i < x.length; i++) {
            arr[temp++] = (Math.abs(x[i - 1] - x[i]) * 3600) / s;
        }
        double max = Double.MIN_VALUE;
        for (double v : arr) {
            if (v > max) {
                max = v;
            }
        }
        return (int) max;
    }

    public static void main(String[] args) {

        double[] f = new double[]{0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25};
        System.out.println(gps(15, f));

        double[] x = new double[]{0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61};
        System.out.println(gps(20, x));

        double[] x1 = new double[]{0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25};
        System.out.println(gps(12, x1));
    }
}
