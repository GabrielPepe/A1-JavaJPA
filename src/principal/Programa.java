package principal;

import java.util.ArrayList;
import java.util.List;

import principal.control.Prompt;
import principal.daos.IndividuoDAO;
import principal.daos.SequenciaDAO;
import principal.models.Individuo;
import principal.models.Sequencia;

public class Programa {
	
	public static void main(String[] args) {
		int op, i;
		do {
			System.out.println("======== MENU ========");
			System.out.println("[1] Inserir pessoa");
			System.out.println("[2] Remover pessoa");
			System.out.println("[3] Listar pessoas");
			System.out.println("[0] Finalizar programa");
			
			op = Prompt.lerInteiro();
			
			IndividuoDAO indDAO = new IndividuoDAO();
			
			switch(op) {
			case 1:
				System.out.println("Quantas pessoas deseja inserir?");
				int qtd = Prompt.lerInteiro();
				for(i=0; i<qtd; i++) {
					System.out.println("Insira o código");
					String codigo = Prompt.lerLinha();
					System.out.println("Insira o nome");
					String nome = Prompt.lerLinha();
					System.out.println("Defina a sequencia");
					String sequencia = Prompt.lerLinha();
					Individuo ind = new Individuo(codigo,nome);
					indDAO.salvar(ind);
				}
			case 2:
				
			case 3:
				
			}
			
		} while(op != 0);
		
		
		
		
//		// Criação e Save indivíduos:
//		Individuo ind1 = new Individuo();
//		ind1.setCodigo("ABC456");
//		ind1.setNome("Ana");
//		
//		Individuo ind2 = new Individuo();
//		ind2.setCodigo("XYZ123");
//		ind2.setNome("Carlos");
//		
//		Individuo ind3 = new Individuo();
//		ind3.setCodigo("MN0776");
//		ind3.setNome("Tiago");
//		
//		IndividuoDAO indDAO = new IndividuoDAO();
//		indDAO.salvar(ind1);
//		indDAO.salvar(ind2);
//		indDAO.salvar(ind3);
//		
//		//////////////
//		// Criação e Save Sequências:
//		Sequencia seq1 = new Sequencia();
//		seq1.setIndividuo(ind1);
//		seq1.setSequencia("ATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCGATCG");
//		
//		Sequencia seq2 = new Sequencia();
//		seq2.setIndividuo(ind1);
//		seq2.setSequencia("AGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTA");
//		
//		Sequencia seq3 = new Sequencia();
//		seq3.setIndividuo(ind2);
//		seq3.setSequencia("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
//		
//		Sequencia seq4 = new Sequencia();
//		seq4.setIndividuo(ind2);
//		seq4.setSequencia("GAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGAGA");
//		
//		Sequencia seq5 = new Sequencia();
//		seq5.setIndividuo(ind3);
//		seq5.setSequencia("CTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGCTAGC");
//		
//		Sequencia seq6 = new Sequencia();
//		seq6.setIndividuo(ind3);
//		seq6.setSequencia("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
//		
//		SequenciaDAO seqDAO = new SequenciaDAO();
//		seqDAO.salvar(seq1);
//		seqDAO.salvar(seq2);
//		seqDAO.salvar(seq3);
//		seqDAO.salvar(seq4);
//		seqDAO.salvar(seq5);
//		seqDAO.salvar(seq6);
//		
//		//////////////
//		//Criação das Listas para Sequencia;
//		List <Sequencia> sequencias1 = new ArrayList<>();
//		sequencias1.add(seq1);
//		sequencias1.add(seq2);
//		
//		List <Sequencia> sequencias2 = new ArrayList<>();
//		sequencias2.add(seq3);
//		sequencias2.add(seq4);
//		
//		List <Sequencia> sequencias3 = new ArrayList<>();
//		sequencias3.add(seq5);
//		sequencias3.add(seq6);
//		//////////////
//		//Link da lista Sequencias com Individuo:
//		ind1.setSequencias(sequencias1);
//		ind2.setSequencias(sequencias2);
//		ind3.setSequencias(sequencias3);
//		
//		indDAO.atualizar(ind1);
//		indDAO.atualizar(ind2);
//		indDAO.atualizar(ind3);
		//////////////
	}
}
