package AtividadesPOO;

public class Atividade3teste {
	

	public static void main(String[] args) {
		
		Atividade3 Celular = new Atividade3();
		
		Celular.setCor("Rosê");
		Celular.setCusto(1000);
		Celular.setMarca("Asus");
		System.out.println("Cor do celular: " + Celular.getCor());
		System.out.println("O custo do celular: " + Celular.getCusto());
		System.out.println("A marca do celular: " + Celular.getMarca());
	} 

}

