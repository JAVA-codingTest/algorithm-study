import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    static int R,C;
    static char[][] maps;
    static boolean[][] visited;
    static int dx[] = {1,0,-1,0};
    static int dy[] = {0,1,0,-1};
    static Queue<int[]> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        visited =new boolean[R][C];
        maps = new char[R][C];
        
        int vcount = 0;
        int ocount =0;
        for(int i=0; i<R; i++){
            String s = br.readLine();
            for(int j=0; j<C; j++){
                char x = s.charAt(j);
                maps[i][j] = x;


            }
        }


        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(!visited[i][j] && maps[i][j] == 'V'){
                    dfs(i,j);
                }
            }
        }
}

    public static void dfs(int x ,int y){
        visited[x][y] = true;
        int ocount =0;
        int vcount =0;
        queue.add(new int[]{x,y});
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i=0; i<4; i++){
                int nX = nowX + dx[i];
                int nY = nowY + dy[i];
                
                if(nX >=0 && nX < R && nY >=0 && nY < C){
                    if(maps[nX][nY] == 'V' && !visited[nX][nY]){
                        queue.add(new int[]{nX,nY});
                        vistied[nX][nY] = true;
                        vcount +=1;
                    }
                    else if(maps[nX][nY] == '#'){
                        continue;
                    }
                    else if(maps[nX][nY] == '.' && !visited[nX][nY]){
                        queue.add(new int[]{nX,nY});
                        visited[nX][nY] = true;
                    }
                    else if(maps[nX][nY] == 'O'){
                        ocount += 1;
                    }
                }

            }
        }
    }
}