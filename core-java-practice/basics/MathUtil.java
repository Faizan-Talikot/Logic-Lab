package core.java.practice.basics;

class MathUtil{
	public static int max(int a,int b) {
		return (a>b) ? a:b;
	}
	public static int clamp(int v, int min, int max) {
        if (v < min) {
            return min;
        } else if (v > max) {
            return max;
        } else {
            return v;
        }
    }
}

public class MathUtil {

	public static void main(String[] args) {
		System.out.println(MathUtil.max(7, 3));            // 7
		System.out.println(MathUtil.clamp(15, 0, 10));     // 10
		System.out.println(MathUtil.clamp(-3, -2, 5));     // -2

	}

}
