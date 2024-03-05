class boogaudi {
    public static void main(String[] args) {
        System.out.println(1);
    }
}

class testClass{
    int[] log;
    public int run(int k){
        int j;
        int n;
        int sum;
        n = log.length;
        sum=0;
        j=1;
        while ((j<n) && (0<j)){
            if (j*j<n){
                log[j] = j*j;
            }else{
                log[j]= j*j-n;
            }
            System.out.println(sum);
            sum = sum + log[j];
            j=j+1;
        }
        System.out.println(sum);
        return(sum);
    }
}
