class Solution {
    public int rotatedDigits(int n) {
         int[] arr=new int[10];
        arr[0]=0;
        arr[1]=1;
        arr[2]=5;
        arr[3]=-1;
        arr[4]=-1;
        arr[5]=2;
        arr[6]=9;
        arr[7]=-1;
        arr[8]=8;
        arr[9]=6;
        int count=0;
        for(int i=0;i<=n;i++){
            int num=i;
            boolean flag=true;
            int res=0;
            int digi=1;
            while(num>0){
                int rem=num%10;
                if(arr[rem]==-1){
                    flag=false;
                    break;
                }
                res+=digi*arr[rem];
                digi=digi*10;
                num=num/10;
            }
            if(flag==true && res!=i){
                count++;
                //System.out.println(i+" "+res);
            }
        } 
        return count;
    }
}