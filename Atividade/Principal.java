package Atividade;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo("Koenigsegg", "Jesko", 2019, "Branco");
		System.out.println("Veiculo");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Cor: " + veiculo.getCor());
		
		Automovel automovel = new Automovel(2, "V8 biturbo");
		System.out.println("\nAutomovel");
		System.out.println("Numero de portas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());
		
		Moto moto = new Moto(900);
		System.out.println("\nMoto");
		System.out.println("Cilindrada: " + moto.getCilindrada());
	}

}
