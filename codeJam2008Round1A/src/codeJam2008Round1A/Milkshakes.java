package codeJam2008Round1A;

import java.util.Scanner;
import java.util.Hashtable;

public class Milkshakes {

	@SuppressWarnings("resource")
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int i=0;i<testCases;i++){
			Hashtable<Integer,Integer> saboresDisponibles = new Hashtable<Integer,Integer>(); 
			int sabores = in.nextInt();
			for(int j=1; j<=sabores; j++){
				saboresDisponibles.put(j, new Integer(-1));
			}
			int clientes = in.nextInt();
			boolean siPudo = false;
			
			for(int j=0; j<clientes;j++){
				int sabCliente = in.nextInt();				
				for(int k=0; k<sabCliente;k++){
					int key = in.nextInt();
					int tipo = in.nextInt();
					if(saboresDisponibles.get(key) == -1){
						saboresDisponibles.put(key, tipo);
						siPudo = true;
					}
					else {
						if(saboresDisponibles.get(key) == tipo)
							siPudo = true;
						else{
							if(k+1 == sabCliente)
								siPudo = false;
						}
					}
				}				
			}
			
			if(siPudo){
				int[] salida = new int[sabores];
				for(Integer j: saboresDisponibles.keySet()){
					if(saboresDisponibles.get(j) == -1)
						saboresDisponibles.put(j, 0);
					salida[j-1] = saboresDisponibles.get(j);
					
				}
				System.out.print("Case #"+(i+1)+": ");
				for(int k=0; k<salida.length;k++)
					System.out.print(salida[k]+" ");
				System.out.println();
			}
			else{
				System.out.println("Case #"+(i+1)+": "+"IMPOSSIBLE");
			}
			
		}
	}
}
