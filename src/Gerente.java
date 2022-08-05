
//Gerente e um funcionario herda da class funcionario
public class Gerente extends FuncionarioAutenticavel {
	
	
		
	
	
	public double getBonificacao() {
		System.out.println("chamando o metodo de bonoficação GERENTE ");
		return super.getSalario();
	}
	
	
}
	
	


