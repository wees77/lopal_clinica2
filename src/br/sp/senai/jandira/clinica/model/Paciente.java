package br.sp.senai.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	
	private String nome;
	private double peso;
	private double altura;
	private String genero;
	private String telefone;
	private LocalDate dataNascimento;
	
	public void setNome(String nome) {
		
		if(nome.length() >3) {
			this.nome = nome.toUpperCase();
		} else {
			System.out.println("O nome deve conter mais do que 3 caracteres");
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPeso(double peso) {
		
		if(peso > 0) {
			//verdade
			this.peso = peso;
		} else {
			//falso
			System.out.println("O peso deve ser maior que ZERO!");
		}

	}
	
	public double getPeso() {
		return peso;
     }
	
     public void setAltura(double altura) {
		
		 if(altura > 0.5) {
			//verdade
			this.altura = altura;
		} else {
			//falso
			System.out.println("A altura deve ser maior que 0,5m!");
		}
			
    }
     
     public double getAltura() {
    	 return altura;
    }
     
 	public void setGenero(String genero) {
 		if(genero.equalsIgnoreCase("m")|| genero.equalsIgnoreCase("f")|| genero.equalsIgnoreCase("o")) {
 			this.genero = genero.toUpperCase();	
 		} else {
 			System.out.println("O gênero do(a) " +nome+ " deve ser \"M\" \"F\" ou \"O\"");
 		}
 	}
 	
 	public String getGenero() {
 		return genero;
 	}
     
     public void setTelefone(String telefone) {
 		if(telefone.length() >=13) {
 			this.telefone = telefone;
 		} else {
 			System.out.println("O valor " +telefone+ "não está correto");
 		}
 	}
     
     public String getTelefone() {
  		return telefone;
  	}
     
     public void setDataNascimento(LocalDate dataNascimento) {
    	 
     }
      
 	
 	
 


	public void marcarConsulta (){

	}
	
	public void calcularIdade(){

	}
	
	public void calcularImc(){
		
		double imc = peso / altura * altura;

	}
	
	public void classificarImc(){

	}
	
	public void exibirDados(){
		String unidadePeso = "kg.";
		String unidadeAltura = "m.";
		System.out.println("------------------------------------");
		System.out.println("dados do paciente".toUpperCase());
		System.out.println("------------------------------------");
		System.out.println("NOME: " + nome);
		System.out.printf("PESO: %s %s\n", peso, unidadePeso);
		System.out.printf("ALTURA: %s %s\n", altura, unidadeAltura);
		System.out.println("GENERO: " +genero);
		System.out.println("TELEFONE: " +telefone);
		
		System.out.println("====================================");
		System.out.println();

	}
}