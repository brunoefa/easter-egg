package com.senai.easteregg;

import java.util.ArrayList;
import java.util.Arrays;

public class Instrucoes {

	ArrayList<String> instrucoes = new ArrayList<String>(
			Arrays.asList(
					"As regras do jogo s�o simples: ",
					"Voc� deve procurar por dicas que est�o espalhadas pelas depend�ncias do SENAI que te levar�o a encontrar o tesouro. ",
					"Essas dicas est�o escondidas em QR Codes, os mesmos dever�o ser bipados para que apare�a a pr�xima dica. ",
					"Cada jogador poder� participar somente uma vez, e ter� 1 hora para completar todo o percurso, das 20 as 21 horas do dia 11/09/2015. ",
					"Ser�o 60 ganhadores sendo, 20 ganhadores a cada 20 minutos, os ganhadores ser�o premiados por ordem de chegada. ",
					"Para receber o pr�mio, o jogador dever� passar por todos os checkpoints. "));

	ArrayList<String> dicas = new ArrayList<String>(Arrays.asList(
			"Dica n�1 - V� ao banheiro",
			"Dica n�2 - V� a biblioteca",
			"Dica n�3 - V� a sala dos professores",
			"Dica n�4 - V� a cantina",
			"Dica n�5 - V� ao Quadro de estagios",
			"Dica n�6 - Vote ao inicio"
			));
	ArrayList<String> controle = new ArrayList<String>(Arrays.asList(
			"banheiro",
			"biblioteca",
			"sala_dos_professores",
			"cantina",
			"Quadro_de_estagios",
			"inicio"
			));
}
