class Solution {
    public int shortestBridge(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};
        int n = grid.length;
        boolean[][] vis = new boolean[n][n];
        boolean breakEnable = false;
        for(int i = 0; i < n ; i++){
            if(breakEnable) break;
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 1){
                    formGraph(grid , q ,i , j ,  n ,vis , dx , dy);
                    breakEnable = true;
                    break;
                }
            }
        }
        int minimumSteps = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int[] curr = q.remove();
                for(int i = 0 ; i < 4 ; i++){
                    int newX = curr[0] + dx[i];
                    int newY = curr[1] + dy[i];
                    if(isValid(newX,newY,n)){
                        if(!vis[newX][newY] && grid[newX ][newY] == 1){
                            return minimumSteps;
                        }
                        else if(!vis[newX][newY] && grid[newX][newY] == 0){
                            q.add(new int[]{newX,newY});
                            vis[newX][newY] = true;
                        }
                    } 
                }
            }
            minimumSteps++;
        }
        return -1;
    }

    public boolean isValid(int i , int j , int n){
        if(i < 0 || j<0 || i >=n || j >= n) return false;
        return true;
    }

    public void formGraph(int[][] grid , Queue<int[]> q , int x , int y , int n , boolean[][] vis , int[] dx , int[] dy){
        if(!isValid(x,y,n)) return;
        if(!vis[x][y] && grid[x][y] == 1){
            q.add(new int[] {x,y});
        }else{
            return;
        }
        vis[x][y] = true;

        for(int i = 0 ; i < 4 ; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            formGraph(grid , q, newX,newY,n,vis,dx,dy);
        }
    }
}


// class Solution {
//     public int shortestBridge(int[][] A) {
//         int m = A.length, n = A[0].length;
//         boolean[][] visited = new boolean[m][n];
//         int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
//         Queue<int[]> q = new LinkedList<>();
//         boolean found = false;
//         // 1. dfs to find an island, mark it in `visited`
//         for (int i = 0; i < m; i++) {
//             if (found) {
//                 break;
//             }
//             for (int j = 0; j < n; j++) {
//                 if (A[i][j] == 1) {
//                     dfs(A, visited, q, i, j, dirs);
//                     found = true;
//                     break;
//                 }
//             }
//         }
//         // 2. bfs to expand this island
//         int step = 0;
//         while (!q.isEmpty()) {
//             int size = q.size();
//             while (size-- > 0) {
//                 int[] cur = q.poll();
//                 for (int[] dir : dirs) {
//                     int i = cur[0] + dir[0];
//                     int j = cur[1] + dir[1];
//                     if (i >= 0 && j >= 0 && i < m && j < n && !visited[i][j]) {
//                         if (A[i][j] == 1) {
//                             return step;
//                         }
//                         q.offer(new int[]{i, j});
//                         visited[i][j] = true;
//                     }
//                 }
//             }
//             step++;
//         }
//         return -1;
//     }
//     private void dfs(int[][] A, boolean[][] visited, Queue<int[]> q, int i, int j, int[][] dirs) {
//         if (i < 0 || j < 0 || i >= A.length || j >= A[0].length || visited[i][j] || A[i][j] == 0) {
//             return;
//         }
//         visited[i][j] = true;
//         q.offer(new int[]{i, j});
//         for (int[] dir : dirs) {
//             dfs(A, visited, q, i + dir[0], j + dir[1], dirs);
//         }
//     }
// }
