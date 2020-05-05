import java.util.*;
 
//2 2
//7 *
//2 5
//1 1
//2
//2 2
//2 1
 
class node {
    long steps = Integer.MAX_VALUE;
    long sum = 0;
    int value;
    int x;
    int y;
 
    //boolean visit=false;
    node(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.sum = value;
    }
 
}
 
 
public class Main {
    static int n = 0;
    static int m = 0;
 
    static boolean check(int x, int y, node[][] arr) {
        if (x > n || y > m || x < 1 || y < 1) return false;
        if (arr[x][y].value == -1) return false;
        return true;
    }
 
    static long distance(int x, int y, int n, int m) {
        return (((long) (x - n) * (long) (x - n)) + ((long) (y - m) * (long) (y - m)));
    }
 
    public static void main(String[] args) {
        // write your code here
 
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        node[][] arr = new node[n + 1][m + 1];
 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int x;
                char c = in.next().charAt(0);
                if (c == '*') x = -1;
                else x = Integer.parseInt(Character.toString(c));
                arr[i][j] = new node(i, j, x);
            }
        }
        int x = in.nextInt();
        int y = in.nextInt();
        int q = in.nextInt();
        Queue<node> qu = new LinkedList();
        arr[x][y].steps=0;
        qu.add(arr[x][y]);
        while (qu.size() != 0) {
            node v = qu.remove();
            if (check(v.x + 1, v.y, arr)) {
 
                if (arr[v.x + 1][v.y].steps > v.steps + 1) {
                    arr[v.x + 1][v.y].steps = v.steps + 1;
                    arr[v.x + 1][v.y].sum = v.sum + arr[v.x + 1][v.y].value;
                    qu.add(arr[v.x + 1][v.y]);
                } else if (arr[v.x + 1][v.y].steps == v.steps + 1) {
                    arr[v.x + 1][v.y].sum = Math.max(v.sum + arr[v.x + 1][v.y].value, arr[v.x + 1][v.y].sum);
 
                }
            }
            if (check(v.x - 1, v.y, arr)) {
 
                if (arr[v.x - 1][v.y].steps > v.steps + 1) {
                    arr[v.x - 1][v.y].steps = v.steps + 1;
                    arr[v.x - 1][v.y].sum = v.sum + arr[v.x - 1][v.y].value;
                    qu.add(arr[v.x - 1][v.y]);
                } else if (arr[v.x - 1][v.y].steps == v.steps + 1) {
                    arr[v.x - 1][v.y].sum = Math.max(v.sum + arr[v.x - 1][v.y].value, arr[v.x - 1][v.y].sum);
 
                }
            }
            if (check(v.x, v.y + 1, arr)) {
 
                if (arr[v.x][v.y + 1].steps > v.steps + 1) {
                    arr[v.x][v.y + 1].steps = v.steps + 1;
                    arr[v.x][v.y + 1].sum = v.sum + arr[v.x][v.y + 1].value;
                    qu.add(arr[v.x][v.y + 1]);
                } else if (arr[v.x][v.y + 1].steps == v.steps + 1) {
                    arr[v.x][v.y + 1].sum = Math.max(v.sum + arr[v.x][v.y + 1].value, arr[v.x][v.y + 1].sum);
 
                }
            }
            if (check(v.x, v.y - 1, arr)) {
 
                if (arr[v.x][v.y - 1].steps > v.steps + 1) {
                    arr[v.x][v.y - 1].steps = v.steps + 1;
                    arr[v.x][v.y - 1].sum = v.sum + arr[v.x][v.y - 1].value;
                    qu.add(arr[v.x][v.y - 1]);
                } else if (arr[v.x][v.y - 1].steps == v.steps + 1) {
                    arr[v.x][v.y - 1].sum = Math.max(v.sum + arr[v.x][v.y - 1].value, arr[v.x][v.y - 1].sum);
 
                }
            }
        }
        for (int i = 0; i < q; i++) {
            int c = in.nextInt();
            int b = in.nextInt();
 
 
            if (arr[c][b].value == -1) System.out.println("-1 -1");
            else {
 
                System.out.println(arr[c][b].steps+" "+arr[c][b].sum);
            }
 
 
        }
 
 
    }
}