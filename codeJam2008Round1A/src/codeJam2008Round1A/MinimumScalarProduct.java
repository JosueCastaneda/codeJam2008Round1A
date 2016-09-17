package codeJam2008Round1A;

import java.util.*;
import java.math.BigInteger;

public class MinimumScalarProduct {

	@SuppressWarnings("resource")
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		PriorityQueue<BigInteger> minHeap = new PriorityQueue<BigInteger>();
		for(int i=0;i<testCases;i++){
			int m = in.nextInt();
			BigInteger val = BigInteger.valueOf(0);
			PriorityQueue<BigInteger> maxHeap = new PriorityQueue<BigInteger>(m,Collections.reverseOrder());
			for(int j=0;j<m;j++){
				BigInteger b = BigInteger.valueOf(in.nextInt()); 
				minHeap.offer(b);
			}
			for(int j=0;j<m;j++){
				BigInteger b = BigInteger.valueOf(in.nextInt()); 
				maxHeap.offer(b);
			}
			for(int j=0;j<m;j++){
				//System.out.println("MULT: "+minHeap.peek()+","+maxHeap.peek()+" ->: "+minHeap.peek().multiply(maxHeap.peek()) );
				val = val.add(minHeap.poll().multiply(maxHeap.poll()));
				//System.out.println("VAL: "+ val );
			}
			System.out.println("Case #"+(i+1)+": "+val);
			
		}
		
	}
}
