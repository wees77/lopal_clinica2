package br.sp.senai.jandira.clinica;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.sp.senai.jandira.clinica.model.Paciente;

public class clinicaApp {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		System.out.println(p1);
		
		Paciente p2 = new Paciente();
		System.out.println(p2);
		
		p1.setNome("Ana Maria");
		p1.setPeso(68);
		p1.setAltura(1.62);
		p1.setTelefone("(11)94002-8922");
		p1.setGenero("f");
		p1.setDataNascimento(LocalDate.of(2003, 07, 30));
	
		p2.setNome("Weslei Santos");
		p2.setPeso(70);
		p2.setAltura(1.80);
		p2.setTelefone("(11)4002-8922");
		p2.setGenero("m");
		p2.setDataNascimento(LocalDate.of(2001, 10, 18));
		
		p1.exibirDados();
		p2.exibirDados();
		
		
	}

}
