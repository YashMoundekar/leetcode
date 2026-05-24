class Solution {
    public String[] findRelativeRanks(int[] score) {
        String str[]=new String[score.length];

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0;i<score.length;i++){
 
                if(score[i]>first){
                    third=second;
                    second=first;
                    first=score[i];

                }else if(score[i]>second ){
                    third=second;
                    second=score[i];
                }else if(score[i]>third ){
                    third=score[i];
                }
            

        }

        for(int i=0;i<score.length;i++){
            if(score[i]==first){
                str[i]="Gold Medal";
            }else if(score[i]==second){
                str[i]="Silver Medal";
            }else if(score[i]==third){
                str[i]="Bronze Medal";
            }else{
                int rank = 1;

                for (int j = 0; j < score.length; j++) {
                    if (score[j] > score[i]) {
                        rank++;
                    }
                }

                str[i] = String.valueOf(rank);


            }
        }
        return str;
        
    }
}