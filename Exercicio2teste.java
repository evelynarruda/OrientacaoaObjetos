package AtividadesPOO;

public class Exercicio2teste {
	public static void main(String[] args) {
		
		
		Exercicio2 aviao = new Exercicio2 ();
		
		aviao.setCompanhia("Companhia aerea: LATAM");
		aviao.setCor("Cor: branco");
		aviao.setDestino("Destino: Recife");
		aviao.setQuantPessoas(105);
		aviao.setTamanho(60);
		
		System.out.println("Companhia a�rea: " + aviao.getCompanhia());
		System.out.println("Cor do avi�o: " + aviao.getCor());	
		System.out.println("Destino: " + aviao.getDestino());
		System.out.println("Quantidade de pessoas: " + aviao.getQuantPessoas());
		System.out.println("Tamanho do avi�o: " + aviao.getTamanho());
		
		
		}
		
	}
