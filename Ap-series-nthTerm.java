static int NthAP(int A, int B, int N){
       //Enter your code here
       if(N==1) return A;
       if(N==2) return B;
       int diff=B-A;
       int ans=A+B;
       int prev=B;
       for(int i=3;i<=N;i++){
          ans=prev+diff;
          prev=ans;
       }
       return ans;

    }
