package br.com.htcursos.dojo2;

public class Chimbinha {

	public static void main(String[] args) {
		int[] vetor1 = new int[10];
		int[]vetor2 = new int[10];

		for(int i =0; i<10;i++)
			vetor1[i]=i;
		for (int i = 0; i < 10;i ++){
			vetor2[i]= vetor1[i]* i;
		}
		for(int i : vetor2){
			System.out.println(i);
		}

	}

}
