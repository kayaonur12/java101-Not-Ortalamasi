package Arrays;

public class HarmonicMeans {
    public static void main(String[] args) {
        int[] list = {1, 4, 4};
        double sum = 0;
        for (int i:list) {
            sum += (1.0/i);
        }
        System.out.println("Harmonic Mean is: "+(list.length/sum));

    }
}
