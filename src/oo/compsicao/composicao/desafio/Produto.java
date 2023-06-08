package oo.compsicao.composicao.desafio;

public class Produto {

    public static void main(String[] args) {

        int v[] = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};

        int i, maior, s;

        maior = 0;

        s = 0;

        for (i = 0; i < 10; i++) {

            s += v[i];

            if (v[i] > maior) {

                maior = v[i];

            }

        }

        System.out.printf("%d %d\n", maior, s);

    }

}
