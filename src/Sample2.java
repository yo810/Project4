//1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる

public class Sample2 {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			if(i % 2 == 0) {
				cnt ++;
				sum += i; 
			}
		}
		System.out.println("1～10までの偶数は" + cnt);
		System.out.println("1～10までの偶数の合計は" + sum);
	}
}

