package controller;

public class ParesControle {

	public ParesControle() {
		super();
	}
	
	public int Pares(int[]vetor, int tamanho) {
		//Condição de parada-> Quando o tamanho do vetor é 0, pois um vetor com tamanho 0 tem 0 pares
		if (tamanho == 0)
		{
			return 0;
		}
		else
		{
			tamanho--;
			//A função é chamada na variável cont, com a variável tamanho subtraindo a cada passada 
			int cont  = Pares(vetor, tamanho);
			if (vetor[tamanho]%2==0)
			{
				cont++;
			}
			return cont;
		}
	}

}
