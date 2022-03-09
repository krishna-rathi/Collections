import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		Stack<Long> st = new Stack<>();
		Long a;
		for(int i=0;i<n;i++) {
			a = sc.nextLong();
			while(!st.empty()) {
				if(st.peek() < a) {break;}
				st.pop();
			}
			if(st.empty()) {
				System.out.print("-1 ");
			} else {
				System.out.println(st.peek()+" ");
			}
			st.push(a);
		}


	}
}
