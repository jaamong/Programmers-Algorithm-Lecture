/**
 * 자릿수 더하기
 *
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class SumDigit {

    public int solution1(int n) {

        int sum = 0;
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++)
            sum += Integer.parseInt(str.substring(i, i + 1));

        return sum;
    }

    public int solution2(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
