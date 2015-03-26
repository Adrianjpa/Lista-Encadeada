
public class Principal extends Lista{

	public static void main (String[] args){
	
		Lista Teste = new Lista();
		System.out.println("LISTA PREENCHIDA");
		Teste.add("Adriano");
		Teste.add("Ruanna");
		Teste.add("Pedro");
		Teste.add("Daniel");
		Teste.add("Silvana");
		Teste.imprimeElemento();
		System.out.println("TAMANHO DA LISTA => " + Teste.Tamanho);
		System.out.println("*****************");
		
		System.out.println("LISTA COM REMOÇÃO DE 2 NOMES ");
		Teste.removeItem("Pedro");
		Teste.removeItem("Silvana");
		Teste.imprimeElemento();
		System.out.println("TAMANHO ATUAL DA LISTA =>" + Teste.Tamanho);
		System.out.println("*****************");
		
		System.out.println("LISTA ADICIONANDO 1 NOME");
		Teste.add("Tonhão");
		Teste.imprimeElemento();
		System.out.println("TAMANHO ATUAL DA LISTA =>" + Teste.Tamanho);
		
		}
	
}