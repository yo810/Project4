//1〜10までの数字のうち偶数のみを昇順で表示させる

public class Sample1 {
	public static void main(String[] args) {
		for(int a = 1; a <= 10; a++) {
			if(a % 2 == 0) {
				System.out.println(a+"");
			}
		}
		System.out.println();
	}
}

