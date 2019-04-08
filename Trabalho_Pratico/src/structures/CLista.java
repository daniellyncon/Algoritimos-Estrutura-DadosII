package structures;

/**
 * @(#)CLista.java
 *
 *
 * @author Rodrigo Richard Gomes
 * @version 1.00 2018/3/16
 */

public class CLista {

	private CCelula primeira; // Referencia a c�lula cabe�a
	private CCelula ultima; // Referencia a �ltima c�lula da lista
	private int qtde;
	// Contador de itens na lista. Deve ser incrementado sempre que um item for
	// inserido e decrementado quando um item for exclu�do.
	private int maiorElementoDaLista = 0;
	private int menorElementoDaLista = 0;

	// Fun��o construtora. Aloca a c�lula cabe�a e faz todas as refer�ncias
	// apontarem para ela.
	public CLista() {
		primeira = new CCelula();
		ultima = primeira;
	}

	// Verifica se a lista est� vazia. Retorna TRUE se a lista estiver vazia e FALSE
	// se ela tiver elementos.
	public boolean vazia() {
		return primeira == ultima;
	}

	// Insere um novo Item no fim da lista.
	public void insereFim(Object valorItem) {
		ultima.prox = new CCelula(valorItem);
		ultima = ultima.prox;
		qtde++;
	}

	// Insere um novo Item no come�o da lista.
	public void insereComeco(Object valorItem) {
		primeira.prox = new CCelula(valorItem, primeira.prox);
		if (primeira.prox.prox == null)
			ultima = primeira.prox;
		qtde++;
	}

	// Insere o Item passado por par�metro na posi��o determinada.
	// O par�metro "valorItem" � o item a ser inserido na lista.
	// O par�metro "posicao" � a posi��o na qual o elemento ser� inserido. O
	// primeiro elemento est� na posi��o 1, e assim por diante.
	// Se a posi��o existir e o m�todo conseguir inserir o elemento, retorna TRUE.
	// Caso a posi��o n�o exista, retorna FALSE.
	public boolean insereIndice(Object valorItem, int posicao) {
		if (posicao <= qtde && posicao != 0) {
			if (posicao == 1) {
				insereComeco(valorItem);
			} else {
				CCelula celula = primeira;
				for (int i = 0; i < posicao - 1; i++) {
					celula = celula.prox;
				}
				celula.prox = new CCelula(valorItem, celula.prox);
				qtde++;
			}
			return true;
		} else {
			return false;
		}
	}

	// Imprime todos os elementos da lista usando o comando while
	public void imprime() {
		CCelula aux = primeira.prox;

		while (aux != null) {
			System.out.println(aux.item);
			aux = aux.prox;
		}
	}

	// Imprime todos os elementos da lista usando o comando for
	public void imprimeFor() {
		for (CCelula aux = primeira.prox; aux != null; aux = aux.prox)
			System.out.print(aux.item + " ");
	}

	// Imprime todos os elementos simulando formato de lista:
	// [/]->[7]->[21]->[13]->null
	public void imprimeFormatoLista() {
		System.out.print("[/]->");
		for (CCelula aux = primeira.prox; aux != null; aux = aux.prox)
			System.out.print("[" + aux.item + "]->");
		System.out.println("null");
	}

	// Verifica se o elemento passado como par�metro est� contido na lista.
	// O par�metro "elemento" � o item a ser localizado. O m�todo retorna TRUE caso
	// o Item esteja presente na lista.
	public boolean contem(Object elemento) {
		boolean achou = false;
		CCelula aux = primeira.prox;
		while (aux != null && !achou) {
			achou = aux.item.equals(elemento);
			aux = aux.prox;
		}
		return achou;
	}

	// Verifica se o elemento passado como par�metro est� contido na lista. (Obs:
	// usando o comando FOR)
	// O par�metro "elemento" � o item a ser localizado. O m�todo retorna TRUE caso
	// o Item esteja presente na lista.
	public boolean contemFor(Object elemento) {
		boolean achou = false;
		for (CCelula aux = primeira.prox; aux != null && !achou; aux = aux.prox)
			achou = aux.item.equals(elemento);
		return achou;
	}

	// Retorna um Object contendo o primeiro Item da lista. Se a lista estiver vazia
	// a fun��o retorna null.
	public Object retornaPrimeiro() {
		if (primeira != ultima)
			return primeira.prox.item;
		else
			return null;
	}

	// Retorna um Object contendo o �ltimo Item da lista. Se a lista estiver vazia a
	// fun��o retorna null.
	public Object retornaUltimo() {
		if (primeira != ultima)
			return ultima.item;
		else
			return null;
	}

	// Retorna o Item contido na posi��o passada por par�metro
	public Object retornaIndice(int posicao) {

		if (posicao <= qtde && posicao != 0) {
			CCelula celula = primeira;
			for (int i = 0; i < posicao; i++) {
				celula = celula.prox;
			}
			return celula.item;
		}

		// EXERC�CIO : deve retornar o elemento da posi��o p passada por par�metro
		// [cabe�a]->[7]->[21]->[13]->null
		// retornaIndice(2) deve retornar o elemento 21. retornaIndice de uma posi�ao
		// inexistente deve retornar null.
		// Se � uma posi��o v�lida e a lista possui elementos

		return null;
	}

	// Remove e retorna o primeiro item da lista (remo��o f�sica, ou seja, elimina a
	// c�lula que cont�m o elemento).
	// Retorna um Object contendo o Item removido ou null caso a lista esteja vazia.
	public Object removeRetornaComeco() {
		// Verifica se h� elementos na lista
		if (primeira != ultima) {
			CCelula aux = primeira.prox;
			primeira.prox = aux.prox;
			if (primeira.prox == null) // Se a c�lula cabe�a est� apontando para null, significa que o �nico elemento
									   // da lista foi removido
				ultima = primeira;
			qtde--;
			return aux.item;
		}
		return null;
	}

	// Remove e retorna o primeiro item da lista (remo��o l�gica, ou seja, remove a
	// c�lula cabe�a fazendo com que a c�lula seguinte ela se torne a nova c�lula
	// cabe�a).
	// Retorna um Object contendo o item removido ou null caso a lista esteja vazia.
	public Object removeRetornaComecoSimples() {
		// Verifica se h� elementos na lista
		if (primeira != ultima) {
			primeira = primeira.prox;
			qtde--;
			return primeira.item;
		}
		return null;
	}

	// Remove o primeiro item da lista fazendo com que a c�lula seguinte � c�lula
	// cabe�a se torne a nova c�lula cabe�a. N�o retorna o item removido.
	public void removeComecoSemRetorno() {
		if (primeira != ultima) {
			primeira = primeira.prox;
			qtde--;
		}
	}

	// Remove o �ltimo Item da lista.
	// Retorna um Object contendo o Item removido ou null caso a lista esteja vazia.
	public Object removeRetornaFim() {
		if (primeira != ultima) {
			CCelula aux = primeira;
			while (aux.prox != ultima)
				aux = aux.prox;
			CCelula aux2 = aux.prox;
			ultima = aux;
			ultima.prox = null;
			qtde--;
			return aux2.item;
		}
		return null;
	}

	// Remove o �ltimo Item da lista sem retorn�-lo.
	public void removeFimSemRetorno() {
		if (primeira != ultima) {
			CCelula aux = primeira;
			while (aux.prox != ultima)
				aux = aux.prox;
			ultima = aux;
			ultima.prox = null;
			qtde--;
		}
	}

	// Localiza o Item passado por par�metro e o remove da Lista
	// O par�metro "valorItem" � o item a ser removido da lista.
	public void remove(Object valorItem) {
		if (primeira != ultima) {
			CCelula aux = primeira;
			boolean achou = false;
			while (aux.prox != null && !achou) {
				achou = aux.prox.item.equals(valorItem);
				if (!achou)
					aux = aux.prox;
			}
			if (achou) {
				// achou o elemento
				aux.prox = aux.prox.prox;
				if (aux.prox == null)
					ultima = aux;
				qtde--;
			}
		}
	}

	// Remove o elemento na posi��o passada como par�metro.
	// O par�metro "posicao" � a posi��o a ser removida. OBS: o primeiro elemento
	// est� na posi��o 1, e assim por diante.
	// O m�todo retorna TRUE se a posi��o existe e foi removida com sucesso, e FALSE
	// caso a posi��o n�o exista.
	public boolean removeIndice(int posicao) {
		// Verifica se � uma posi��o v�lida e se a lista possui elementos
		if ((posicao >= 1) && (posicao <= qtde) && (primeira != ultima)) {
			int i = 0;
			CCelula aux = primeira;
			while (i < posicao - 1) {
				aux = aux.prox;
				i++;
			}
			aux.prox = aux.prox.prox;
			if (aux.prox == null)
				ultima = aux;
			qtde--;
			return true;
		}
		return false;
	}

	// Remove e retorna o elemento na posi��o passada como par�metro.
	// O par�metro "posicao" � a posi��o a ser removida. OBS: o primeiro elemento
	// est� na posi��o 1, e assim por diante.
	// O m�todo retorna um object contendo o elemento removido da lista. Caso a
	// posi��o seja inv�lida, retorna null.
	public Object removeRetornaIndice(int posicao) {
		// Verifica se � uma posi��o v�lida e se a lista possui elementos
		if ((posicao >= 1) && (posicao <= qtde) && (primeira != ultima)) {
			int i = 0;
			CCelula aux = primeira;
			while (i < posicao - 1) {
				aux = aux.prox;
				i++;
			}
			CCelula aux2 = aux.prox;
			aux.prox = aux.prox.prox;
			if (aux.prox == null)
				ultima = aux;
			qtde--;
			return aux2.item;
		}
		return null;
	}

	// M�todo(getter) que retorna a quantidade de itens da lista.
	public int quantidade() {
		return qtde;
	}

	//

	
	// Exerc�cio 1
	public void insereAntesDe(Object elementoAInserir, Object elemento) {
		int indiceAux = 0;

		boolean achou = false;

		CCelula aux = primeira.prox;
		while (aux != null && !achou) {
			achou = aux.item.equals(elemento);
			aux = aux.prox;
			indiceAux++;
		}
		insereIndice(elementoAInserir, indiceAux);
	}
	
	// Exerc�cio 2
	public void insereDepoisDe(Object elementoAInserir, Object elemento) {
		int indiceAux = 0;
		boolean achou = false;

		CCelula aux = primeira.prox;
		while (aux != null && !achou) {
			achou = aux.item.equals(elemento);
			aux = aux.prox;
			indiceAux++;
		}
		if (achou) {
			insereIndice(elementoAInserir, indiceAux + 1);
		}
		// Se caso o elemento for o ultimo, inserir� atrav�s do m�todo insereFim();
		if (indiceAux == quantidade())
			insereFim(elementoAInserir);
	}

	
	// Exerc�cio 3
	public void insereOrdenado(int elementoAInserir) {
		if (vazia()) {
			insereComeco(elementoAInserir);
			maiorElementoDaLista = elementoAInserir;
			menorElementoDaLista = elementoAInserir;
		} else if (elementoAInserir >= maiorElementoDaLista) {
			insereDepoisDe(elementoAInserir, maiorElementoDaLista);
			maiorElementoDaLista = elementoAInserir;

		} else if (elementoAInserir <= menorElementoDaLista) {
			insereAntesDe(elementoAInserir, menorElementoDaLista);
			menorElementoDaLista = elementoAInserir;
		} else if (contem(elementoAInserir)) {
			insereAntesDe(elementoAInserir, elementoAInserir);
		}
	}

	public void removePos(int n) {
		if ((n >= 1) && (n <= qtde) && (primeira != ultima)) {
			int i = 0;
			CCelula aux = primeira;
			while (i < n - 1) {
				aux = aux.prox;
				i++;
			}
			aux.prox = aux.prox.prox;
			if (aux.prox == null)
				ultima = aux;
			qtde--;
		}
	}
}