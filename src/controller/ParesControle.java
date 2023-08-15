package controller;

public class ParesControle {

	public ParesControle() {
		super();
	}
	
	public int Pares(int[]vetor, int tamanho) {
		//Condi��o de parada-> Quando o tamanho do vetor � 0, pois um vetor com tamanho 0 tem 0 pares
		if (tamanho == 0)
		{
			return 0;
		}
		else
		{
			tamanho--;
			//A fun��o � chamada na vari�vel cont, com a vari�vel tamanho subtraindo a cada passada 
			int cont  = Pares(vetor, tamanho);
			if (vetor[tamanho]%2==0)
			{
				cont++;
			}
			return cont;
		}
	}

}
