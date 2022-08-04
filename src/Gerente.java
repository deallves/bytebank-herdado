
//Gerente e um funcionario herda da class funcionario
public class Gerente extends Funcionario {
	
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean autentic(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public double getBonificacao() {
		System.out.println("chamando o metodo de bonoficação GERENTE ");
		return super.getSalario();
	}
	
	
}
	
	


