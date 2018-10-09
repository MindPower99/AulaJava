package MontandoMatriz;

public class AtividadeMatriz {
	public static void main (String[] args) {
		int matriz[][] = new int[3][3];
		
		matriz[0][0] = 1;
		matriz[0][1] = 10;
		matriz[0][2] = 20;
		
		matriz[1][0] = 2;
		matriz[1][1] = 20;
		matriz[1][2] = 40;
		
		matriz[2][0] = 3;
		matriz[2][1] = 52;
		matriz[2][2] = 74;
		
		for (int x = 0; x < matriz.length; x++) {
			   for (int y = 0; y < matriz[0].length; y++) {
			     System.out.print(matriz[x][y] + " ");
			   }
			   System.out.println("");
			}
		System.out.printf("Atividade 1: "+ (matriz[0][0]+matriz[1][1]+matriz[2][2]));
		System.out.printf("Atividade 2: "+ (matriz[0][2]*matriz[1][1]*matriz[2][0]));
		System.out.printf("Atividade 3: "+ (matriz[0][0]/matriz[1][1]/matriz[2][2]));
		
	}

	
}
