package func;

public class Funcionarios {

	private int id;
	private String nome;
	private double salario;
	
	public Funcionarios(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public double aumento(double valor) {
		this.setSalario((valor/100 * this.salario)+this.salario);
		return this.getSalario();
	}
	
	
	
}
