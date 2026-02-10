package executavel;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected double experiencia;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.setIdade(idade);
		this.setSexo(sexo);
		this.experiencia = 0;
	}
	
//	public Pessoa(String nome, int idade, String sexo, double experiencia) {
//		this(nome, idade, sexo);
//		this.experiencia = experiencia;
//	}
	
	protected void ganharExp() {
		this.setExperiencia(this.getExperiencia() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade > 0 && idade < 120) {
			this.idade = idade;
		}else {
			System.out.println("Insira uma idade valida!");
		}
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
			this.sexo = sexo.toUpperCase();
		}else {
			System.out.println("Insira m para masculino ou f para feminino!");
		}
	}

	public double getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}
	
	

}
