class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int total=grid.length*grid[0].length;
        k=k%total;
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                list.add(0);
            }
            li.add(list);
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int idx=i*grid[0].length+j;
                int newidx=(idx+k)%total;
                int row=newidx/grid[0].length;
                int col=newidx%grid[0].length;

                li.get(row).set(col,grid[i][j]);
            }
        }
        return li;
        
        
    }
}