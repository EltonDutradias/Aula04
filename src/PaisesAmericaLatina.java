import java.util.Scanner;
public class PaisesAmericaLatina {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		int resposta =0;
		 
		while(resposta != 20) {  
			System.out.println("Quantos países fazem parte da América Latina? "); 
			resposta = leitor.nextInt();
			} 
				System.out.println("Acertou! Os países são: Argentina, Bolívia, Brasil, Chile, Colômbia,  \r\n"
						+ "Costa Rica, Cuba, Equador, El Salvador, Guatemala,  \r\n"
						+ "Haiti, Honduras, México, Nicarágua, Panamá,  \r\n"
						+ "Paraguai, Peru, República Dominicana, Uruguai e Venezuela. ");
			 
		     leitor.close();
	} 

}
