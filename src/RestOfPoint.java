/**
 * 나머지 한 점
 *
 * 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때, 나머지 한 점의 좌표를 구하려고 합니다.
 * 점 3개의 좌표가 들어있는 배열 v가 매개변수로 주어질 때, 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 return 하도록 solution 함수를 완성해주세요.
 * 단, 직사각형의 각 변은 x축, y축에 평행하며, 반드시 직사각형을 만들 수 있는 경우만 입력으로 주어집니다.
 */
public class RestOfPoint {
    public int[] solution(int[][] v) {

        // xor 이용하기
        // A xor A = 0
        // A xor A xor B = B

        //x1이 두 번 나왔다면
        //x1 xor x1 xor x2 = x2

        int[] ans = {0,0};

        for (int i = 0; i < 3; i++) {
            ans[0] ^= v[i][0]; // 정답의 x 좌표와 xor
            ans[1] ^= v[i][1]; // 정답의 y 좌표와 xor
        }
        // 이제 정답 배열에는 나머지 한 점의 좌표가 남게된다.

        return ans;
    }
}
