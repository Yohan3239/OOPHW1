public class Q4 {
    public static void main(String[] args) {

    }
    public static int sum(int[] a) {
        int sum = 0;
        for(int A : a) {
            sum += A;
        }
        return sum;
    }
    public static int[] cumsum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            a[i] = sum;
        }
        return a;
    }
    public static int[] positives(int[] a) {
        int count = 0;
        for (int x : a) {
            if (x > 0) count++;
        }
        int[] result = new int[count];
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                 result[x++] = a[i];
            }
        }
        return result;
    }
}
