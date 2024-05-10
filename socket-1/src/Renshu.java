class Renshu {

    // xを2倍にして返す関数
    public int doubleValue(int x) {
        return x * 2;
    }

    //ここに続きを実装していく。
    public int sumUpToN(int x){
        int j = 0;
        for(int i = 1; i<=x; i++){
            j += i;
        }
        return j;
    }

    public int sumFromPtoQ(int P,int Q){
        if(P>Q){
            return -1;
        }
        int j = 0;
        for(int i = P; i<=Q; i++){
            j += i;
        }
        return j;
    }
}