public class XmasTree {

    //木上部
	public static void main(String[] args) {
        int N=10;
        for (int j = 0; j < N; j++) {

            for (int i = 0; i <= N-j; i++) {
                System.out.print("#");
            }

            for (int i = 0; i <= j*2; i++) {
                System.out.print("*");
            }

            for (int i = 0; i <= N-j; i++) {
                System.out.print("+");
            }

            System.out.print("\n");
        }
        //幹の長さ
        for(int j=0; j<3;j++){
            for(int i=0;i<N-3/2;i++){
                System.out.print(" ");
            }
            //幹の太さ
            for(int i=0;i<6;i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

	}
}