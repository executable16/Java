import java.lang.Math;
import java.util.*;
import java.io.*;
class InputInArray{
// git is working
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String s[] = br.readLine().trim().split(" ");	
		int a[] = new int[n];

		for(int i=0;i<n;i++){
			a[i] = Integer.parseInt(s[i]);
		}
		for(int i : a){
			System.out.print(i + " ");
		}
	}
}
