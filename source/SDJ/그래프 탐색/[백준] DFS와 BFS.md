

> **[[백준] DFS와 BFS](https://www.acmicpc.net/problem/1260)**

### 시간복잡도

|  | 인접행렬 | 인접리스트 |
|--|--|--|
| DFS | O(V^2) | O(V+E) |
| BFS | O(V^2) | O(V+E) |

[[시간복잡도 참고]](https://loosie.tistory.com/151)

---------------------

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
    static boolean[] visited;
    static boolean[][] node;
    static BufferedWriter bw;
    static int N,M,V;
    
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        
        //node의 방문유무
        visited = new boolean[N+1];
        //간선 matrix
        node = new boolean[N+1][N+1];
        
        //간선 정보를 양방향 matrix로 생성
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a][b] = true;
            node[b][a] = true;
        }
        
        dfs(V);
        bw.write("\n");
        
        //방문정보 초기화
        visited = new boolean[N+1];
        bfs(V);
        
        bw.flush();
        bw.close();
    }
    
	/**
     * dfs탐색을 하기 위해 재귀로 실행되는 함수
     * @param s 탐색 시작 정점 번호
     */
    public static void dfs(int s) throws IOException{
        visited[s] = true;
        bw.write(s + " ");
        
        /* 작은 순서대로 출력하기 위해 i=1부터 탐색하며 
           s와 연결된 i가 존재하고 i가 방문하지 않아야 재귀 */
        for(int i = 1; i<=N; i++){
            if(node[s][i] && !visited[i]){
                dfs(i);
            }
        }
    }
    
    /**
     * bfs탐색을 하기 위해 큐로 실행되는 함수
     * @param s 탐색 시작 정점 번호
     */
    public static void bfs(int s) throws IOException{
        Queue<Integer> queue = new LinkedList<>();
        //시작 정점을 queue에 삽입하고 방문 표시
        queue.offer(s);
        visited[s] = true;
        
        while(!queue.isEmpty()){
            int a = queue.poll(); //queue에서 하나를 제거함
            bw.write(a + " ");
            
            //a와 연결된 i들을 모두 queue에 삽입하고 방문 표시
            for(int i = 1; i<=N; i++){
                if(node[a][i] && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
            
        }
    }
}

```

