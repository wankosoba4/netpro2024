import java.util.Random;

public class HeikinCKadai {
    public static final int N = 100;
    Kamoku[] kamoku = new Kamoku[N];
    static String kamokuname = "数学";

    public static void main(String[] args) {
        HeikinCKadai heikinCKadai = new HeikinCKadai(kamokuname);
        heikinCKadai.initializeScores();
        heikinCKadai.printAverage();
        heikinCKadai.printHighScorers();
    }

    HeikinCKadai(String s) {
        this.kamokuname = s;
    }

    void initializeScores() {
        Random r = new Random();

        for (int i = 0; i < N; i++) {
            int score = r.nextInt(N + 1);
            kamoku[i] = new Kamoku(score);
        }

    }

    void printAverage() {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += kamoku[i].getScore();
        }
        System.out.println("平均点は" + sum / N);
    }

    void printHighScorers() {
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = kamoku[i].getScore();
        }

        // 点数が80以上の生徒を見つけて出力する
        System.out.println("80点以上の生徒:");
        for (int i = 0; i < N; i++) {
            if (scores[i] >= 80) {
                System.out.println("点数: " + scores[i]);
            }
        }
    }
}
