/*
Autor: Beatriz França

5)Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou 
pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;*/

public class Ex5 {
	public static void main(String[] args) {
		String str = "Hello World!";
		System.out.println(str);
		char[] letra = str.toCharArray();
	    int inicio = 0;
	    int fim = letra.length-1;
	    char aux;
	    while(fim>inicio){
	        aux = letra[inicio];
	        letra[inicio] = letra[fim];
	        letra[fim] = aux;
	        fim--;
	        inicio++;
	    }
	    str = new String(letra);
	    System.out.println(str);
	}
}