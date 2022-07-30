
//Gerente e um funcionario herda da class funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do EDITOR DE VIDEO");
		return  super.getBonificacao() + 100;
	}
	
	
}
	
	


