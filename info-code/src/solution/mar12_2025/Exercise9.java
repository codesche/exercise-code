package solution.mar12_2025;

// new int[1차원 배열의 갯수][1차원 배열의 길이]
// 실제 구조로 이해 : 길이가 2인 1차원 배열이 3개
// 테이블 구조로 이해 : 3행 2열
// a = new int[3][2];


public class Exercise9 {
    public static void main(String[] args) {
        int arr[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = j * 3 + (i + 1);
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }
    }
}
