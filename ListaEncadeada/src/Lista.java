public class Lista extends Elemento {

	Elemento Primeiro;
	Elemento Ultimo;
	int Tamanho = 0;

	public Lista() {
		Primeiro = null;
		Ultimo = Primeiro;

	}

	public void add(String Dado) {
		if (Primeiro == null) {
			Primeiro = new Elemento();
			Ultimo = Primeiro;
			Elemento Novo = new Elemento();
			Novo.setDado(Dado);
			Novo.setProx(null);
			Ultimo.setProx(Novo);
			Ultimo = Novo;
			Tamanho++;
		} else {
			Elemento Novo = new Elemento();
			Novo.setDado(Dado);
			Novo.setProx(null);
			Ultimo.setProx(Novo);
			Ultimo = Novo;
			Tamanho++;
		}
	}

	public void imprimeElemento() {
		Elemento Percorre = Primeiro.getProx();
		while (Percorre != null) {
			System.out.println(Percorre.getDado());
			Percorre = Percorre.getProx();

		}

	}

	public void removeItem(String Remover) {
		Elemento Remove = Primeiro.getProx();
		Elemento Anterior = Primeiro;
		if (!(Primeiro == null)) {
			while (Remove != null) {
				if (Remove.getDado() .equals(Remover)) {
					if (Remove.getProx() == null) {
						Ultimo = Anterior;
						Ultimo.setProx(null);
						Remove = null;
						Tamanho--;
						break;

					} else {
						Anterior.setProx(Remove.getProx());
						Remove.setProx(null);
						Remove = null;
						Tamanho--;
						break;
					}
				}
				Remove = Remove.getProx();
				Anterior = Anterior.getProx();
			}
		}
	}
}
