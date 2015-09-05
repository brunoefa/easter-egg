package com.senai.easteregg.modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Instrucoes {

	public ArrayList<String> instrucoes = new ArrayList<String>(
			Arrays.asList(
					"Voc� deve procurar por dicas que est�o espalhadas pelas depend�ncias do SENAI que te levar�o a encontrar o tesouro. ",
					"Essas dicas est�o escondidas em QR Codes, os mesmos dever�o ser capturados para que apare�a a pr�xima dica. ",
					"Cada jogador poder� participar somente uma vez, e ter� 1 hora para completar todo o percurso, das 20h as 21h na sexta-feira 11 de setembro.",
					"Ser�o 60 ganhadores sendo, 20 ganhadores a cada 20 minutos, os ganhadores ser�o premiados por ordem de chegada. ",
					"Para receber o pr�mio, o jogador dever� passar por todos os checkpoints. "));

	public ArrayList<String> tituloInstrucoes = new ArrayList<String>(Arrays.asList(
			"As regras do jogo s�o simples",
			"A ca�ada",
			"Quando o jogo come�a?",
			"O tesouro",
			"Fim da jornada"));

	public ArrayList<String> dicas = new ArrayList<String>(Arrays.asList(
			"A higiene pessoal � muito importante para se ter uma vida saud�vel. Que tal lavar as m�os antes de continuar?!",
			"Leitura � a chave para se ter um universo de ideias e uma tempestade de palavras - Pedro Bom Jesus",
			"Essa sala n�o � destinada � alunos, somente aos Mestres. Sabe onde fica?",
			"Comer, comer, comer, comer; � o melhor para poder crescer [...]",
			"A vida profissional come�a com uma oportunidade para adquirir experi�ncia. Mas como conseguir uma vaga?"
			));
	
	public ArrayList<String> controle = new ArrayList<String>(Arrays.asList(
			"banheiro",
			"biblioteca",
			"professores",
			"cantina",
			"estagios"
			));
}
