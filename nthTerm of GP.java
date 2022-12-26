static int NthGP(int A, int R, int N){
//Enter your code here
    int ans=A;
    for(int i=2;i<=N;i++){
        ans*=R;
    }
    return ans;
}
