public class Q5 {
    public static int[] vectorAdd(int x,int y,int dx, int dy) {
        x=x+dx;
        y=y+dy;
        return new int[] {x,y};
    }
    public static void main(String[] args) {
        int a=0;
        int b=2;
        int[] result = vectorAdd(a,b,1,1);
        System.out.println(result[0]+" "+result[1]);
    }
}