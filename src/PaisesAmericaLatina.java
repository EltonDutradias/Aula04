import java.util.Scanner;
public class PaisesAmericaLatina {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		int resposta =0;
		 
		while(resposta != 20) {  
			System.out.println("Quantos pa�ses fazem parte da Am�rica Latina? "); 
			resposta = leitor.nextInt();
			} 
				System.out.println("Acertou! Os pa�ses s�o: Argentina, Bol�via, Brasil, Chile, Col�mbia,  \r\n"
						+ "Costa Rica, Cuba, Equador, El Salvador, Guatemala,  \r\n"
						+ "Haiti, Honduras, M�xico, Nicar�gua, Panam�,  \r\n"
						+ "Paraguai, Peru, Rep�blica Dominicana, Uruguai e Venezuela. ");
			 
		     leitor.close();
	} 

}
