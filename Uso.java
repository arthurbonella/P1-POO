import java.util.Scanner;

public class Uso {
	public static void main (String args[]) throws Exception {
		final int TAMANHO = 50;

		// vetor capaz de armazenar QTDE objetos de Funcionario, Chefe ou Diretor
		CaixaTexto Mensagens[] = new CaixaTexto[TAMANHO];

		// variaveis auxiliares e temporarias
		int opcao;
		double linha,coluna;
		int tam_fonte,cod;
		String texto;
		
		for(int i=0; i < TAMANHO; i++) {
			System.out.println("\nTexto: " + (i+1) + "\n(1)SemSombra, (2)ComSombra: ");
			opcao = new Scanner(System.in).nextInt();

			try {
				switch(opcao) {
				case 1: 
					System.out.println("Qual o texto? ");
					texto = new Scanner(System.in).nextLine();
					System.out.println("Qual a fonte? ");
					tam_fonte = new Scanner(System.in).nextInt();
					System.out.println("Qual a coluna? ");
					coluna = new Scanner(System.in).nextDouble();
					System.out.println("Qual a Linha? ");
					linha = new Scanner(System.in).nextDouble();
					Mensagens[i] = new CaixaTexto(new Texto(texto,tam_fonte),linha,coluna);
					break;
				case 2: 
					System.out.println("Qual o texto? ");
					texto = new Scanner(System.in).nextLine();
					System.out.println("Qual a fonte? ");
					tam_fonte = new Scanner(System.in).nextInt();
					System.out.println("Qual a coluna? ");
					coluna = new Scanner(System.in).nextDouble();
					System.out.println("Qual a Linha? ");
					linha = new Scanner(System.in).nextDouble();
					System.out.println("Qual o Codigo? ");
					cod = new Scanner(System.in).nextInt();
					
					Mensagens[i] = new CaixaTextoSombra(new Texto(texto,tam_fonte),linha,coluna,cod);
					break;
				default:
					i--;
					continue;
				}
			}
			catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}

		// chamada polimorfica do metodo toString e do metodo calculaMaxEmprestimo
		for(int i=0; i < TAMANHO; i++) {
			System.out.println("\n" + Mensagens[i].toString());
		}
	}
}




