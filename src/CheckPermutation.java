import java.util.Arrays;

/**
 * 순열 검사
 * <p>
 * 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
 * 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
 */
public class CheckPermutation {

    public boolean solution1(int[] arr) {

        int length = arr.length;
        int[] checkDuplication = new int[length + 1];

        for (int i : arr) {
            if (length < i)
                return false;
            checkDuplication[i]++;
        }

        for (int i : checkDuplication) {
            if (i >= 2)
                return false;
        }
        return true;
    }

    public boolean solution2(int[] arr) {

        Arrays.sort(arr);
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] != i + 1) //정렬했기 때문에, 이렇게 비교했을 때 해당 숫자가 한 번 더 있다는 소리
                return false;
        }

        return true;
    }
}
