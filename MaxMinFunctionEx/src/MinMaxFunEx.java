
// 프로그래머스 최소직사각형 활용 사례
public class MinMaxFunEx {

    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        // 2차원 배열을 향상된 for 문으로 구현
        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }

        return maxW * maxH;
    }

    public static void main(String[] args) {

    }
}
