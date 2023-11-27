package holaMundo;

public class Matriz {
	
	
	
	public static void main() {
		String[][] matriz = new String[3][3];
		matriz[0][0] = "A";
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				matriz[i][j]="A";
			}
		}
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print("[" + matriz[i][j] + "]");
			}
			System.out.println("");
		}
	
	}
	
}
