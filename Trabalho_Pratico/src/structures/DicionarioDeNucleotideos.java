package structures;

import javax.swing.JOptionPane;

public class DicionarioDeNucleotideos {

	public static void main(String[] args) {

		CDicionario dicionario;
		dicionario = new CDicionario();
		
		dicionario.adiciona("UUU", "Fenilalanina");
		dicionario.adiciona("UUC", "Fenilalanina");
		dicionario.adiciona("UUA", "Leucina");
		dicionario.adiciona("UUG", "Leucina");
		dicionario.adiciona("CUU", "Leucina");
		dicionario.adiciona("CUC", "Leucina");
		dicionario.adiciona("CUA", "Leucina");
		dicionario.adiciona("CUG", "Leucina");
		dicionario.adiciona("AUU", "Isoleucina");
		dicionario.adiciona("AUC", "Isoleucina");
		dicionario.adiciona("AUA", "Isoleucina");
		dicionario.adiciona("AUG", "Metionina");
		dicionario.adiciona("GUU", "Valina");
		dicionario.adiciona("GUC", "Valina");
		dicionario.adiciona("GUA", "Valina");
		dicionario.adiciona("GUG", "Valina");
		dicionario.adiciona("UCU", "Serina");
		dicionario.adiciona("UCC", "Serina");
		dicionario.adiciona("UCA", "Serina");
		dicionario.adiciona("UCG", "Serina");
		dicionario.adiciona("CCU", "Prolina");
		dicionario.adiciona("CCC", "Prolina");
		dicionario.adiciona("CCA", "Prolina");
		dicionario.adiciona("CCG", "Prolina");
		dicionario.adiciona("ACU", "Treonina");
		dicionario.adiciona("ACC", "Treonina");
		dicionario.adiciona("ACA", "Treonina");
		dicionario.adiciona("ACG", "Treonina");
		dicionario.adiciona("GCU", "Alanina");
		dicionario.adiciona("GCC", "Alanina");
		dicionario.adiciona("GCA", "Alanina");
		dicionario.adiciona("GCG", "Alanina");
		dicionario.adiciona("UAU", "Tirosina");
		dicionario.adiciona("UAC", "Tirosina");
		dicionario.adiciona("UAA", "Parada");
		dicionario.adiciona("UAG", "Parada");
		dicionario.adiciona("CAU", "Histidina");
		dicionario.adiciona("CAC", "Histidina");
		dicionario.adiciona("CAA", "Glutamina");
		dicionario.adiciona("CAG", "Glutamina");
		dicionario.adiciona("AAU", "Asparagina");
		dicionario.adiciona("AAC", "Asparagina");
		dicionario.adiciona("AAA", "Lisina");
		dicionario.adiciona("AAG", "Lisina");
		dicionario.adiciona("GAU", "Aspartato");
		dicionario.adiciona("GAC", "Aspartato");
		dicionario.adiciona("GAA", "Glutamato");
		dicionario.adiciona("GAG", "Glutamato");
		dicionario.adiciona("UGU", "Cisteina");
		dicionario.adiciona("UGC", "Cisteina");
		dicionario.adiciona("UGA", "Parada");
		dicionario.adiciona("UGG", "Triptofano");
		dicionario.adiciona("CGU", "Arginina");
		dicionario.adiciona("CGC", "Arginina");
		dicionario.adiciona("CGA", "Arginina");
		dicionario.adiciona("CGG", "Arginina");
		dicionario.adiciona("AGU", "Serina");
		dicionario.adiciona("AGC", "Serina");
		dicionario.adiciona("AGA", "Arginina");
		dicionario.adiciona("AGG", "Arginina");
		dicionario.adiciona("GGU", "Glicina");
		dicionario.adiciona("CGC", "Glicina");
		dicionario.adiciona("GGA", "Glicina");
		dicionario.adiciona("GGG", "Glicina");
		
		String key = JOptionPane.showInputDialog("Digite uma trinca:");
		JOptionPane.showMessageDialog(null, "Trinca: " + key + "\n" +
											"Amino�cido: " +dicionario.recebeValor(key) );
	}

}