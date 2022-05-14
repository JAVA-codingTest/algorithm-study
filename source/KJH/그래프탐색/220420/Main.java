import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class Main{
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int N,M;
    static boolean[][] visited;
    static int[][] maps;
    static int max=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maps = new int[N][M];
       
        for(int i=0; i<N; i++){
            String[] s = br.readLine().split(" ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
            for(int j=0; j<M; j++){
                maps[i][j] = s[j].charAt(0)-'0';
            }
        }
     
        visited = new boolean[N][M];
        

        dfs(3);

        System.out.println(max);

    }

    //깊은 복사 
    public static int[][] copy(int [][] arr) {

		int[][] copy = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				copy[i][j] = arr[i][j];
			}
		}
		return copy;
	}

       //벽 세우기 dfs

    public static void dfs(int count){
        

        if(count == 0){
            bfs();
            return;
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(maps[i][j] == 0){
                    maps[i][j] = 1;
                    dfs(count-1);
                    maps[i][j] = 0;
                }
                
            }
        }

    }
        

        //바이러스 퍼지기 bfs

    public static void bfs(){
        int[][] check = copy(maps);
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(check[i][j] == 2){
                    queue.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        while(!queue.isEmpty()){
            int[] newXY = queue.poll();
            int nowX = newXY[0];
            int nowY = newXY[1];
            for(int i=0; i<4; i++){
                int newx = nowX + dx[i];
                int newy = nowY + dy[i];

                if(newx >= 0 && newx < N && newy >= 0 && newy <M){
                    if(check[newx][newy] == 0 && !visited[newx][newy]){
                        visited[newx][newy] = true;
                        check[newx][newy] = 2;
                        queue.add(new int[]{newx, newy});
                    }                   

                }
            }

        }


        count(check);
        visited = new boolean[N][M];

        

    }

    public static void count(int[][] check){
        int cnt = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                
                if(check[i][j] == 0){
                    cnt += 1;
                }
            }
            
        }

        

        max = Math.max(cnt, max);
    }


}