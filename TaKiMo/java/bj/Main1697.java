import java.util.*;
import java.io.*;

public class Main1697 {
	static int N, K;
	static boolean[] visited; // 갈 필요없는 곳(방문한 곳)을 표시해야 함

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		visited = new boolean[100001];

		bfs(N);
	}

	private static void bfs(int start) {
		Queue<Node> q = new LinkedList<>();
		visited[start] = true;
		q.offer(new Node(start, 0));

		while (!q.isEmpty()) {
			Node now = q.poll();

			if (now.at == K) {
				System.out.print(now.cnt);
				return;
			}

			int minus = now.at - 1;
			int plus = now.at + 1;
			int prod = now.at * 2;

			if (minus >= 0 && !visited[minus]) {
				q.offer(new Node(minus, now.cnt + 1));
				visited[minus] = true;
			}
			if (plus <= 100000 && !visited[plus]) {
				q.offer(new Node(plus, now.cnt + 1));
				visited[plus] = true;
			}
			if (prod <= 100000 && !visited[prod]) {
				q.offer(new Node(prod, now.cnt + 1));
				visited[prod] = true;
			}
		}
	}

	static class Node {
		int at;
		int cnt;

		public Node(int at, int cnt) {
			this.at = at;
			this.cnt = cnt;
		}
	}
}