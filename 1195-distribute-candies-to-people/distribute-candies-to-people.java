class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int arr[]=new int[num_people];
        int k=0;
        for(int i=1;candies>0;i++){

            if(candies>=i){
                arr[(k++)%num_people]+=i;
                candies-=i;
            }else{
                arr[(k++) % num_people] += candies;
                break;
            }
        }
        return arr;
    }
}