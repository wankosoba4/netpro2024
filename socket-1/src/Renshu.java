class Renshu {

    // xを2倍にして返す関数
    public int doubleValue(int x) {
        return x * 2;
    }

    //ここに続きを実装していく。
    public int sumUpToN(int x){
        int sum = 0;
        for(int i = 1; i<=x; i++){
            sum += i;
        }
        return sum;
    }

    public int sumFromPtoQ(int P,int Q){
        if(P>Q){
            return -1;
        }
        int sum = 0;
        for(int i = P; i<=Q; i++){
            sum += i;
        }
        return sum;
    }

    public int sumFromArrayIndex(int []x,int y){
        if(x.length <= y){
            return -1;
        }
        int sum = 0;
        for(int i = y; i< x.length; i++){
            sum += x[i];
        }
        return sum;
    }

    int selectMaxValue(int[] a){
        int max = a[0];
        for (int value : a) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    int selectMinValue(int[] a){
        int min = a[0];
        for (int value : a) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    int selectMinIndex(int[] a) {
        int min = a[0];
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    int selectMaxIndex(int[] a) {
        int max = a[0];
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    void swapArrayElements(int[] p, int i, int j){
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;
    }

    boolean swapTwoArrays(int[] a, int[] b){
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
        return true;
    }
}