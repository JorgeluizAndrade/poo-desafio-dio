package iphone;

import iphone.funcoes.AparelhoTelefonico;
import iphone.funcoes.NavegadorInternet;
import iphone.funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	static public void main(String[] agrs) {
		 Iphone meuIphone = new Iphone();
	        System.out.println("Jesus");
	        
	        meuIphone.ligar();
	        meuIphone.atender();
	        meuIphone.iniciarCorreioVoz();
	        
	        meuIphone.tocar();
	        meuIphone.pausar();
	        meuIphone.selecionarMusica("I'm Alive");
	        
	        meuIphone.exibirPagina("www.example.com");
	        meuIphone.adicionarNovaAba();
	        meuIphone.atualizarPagina();
		
	}

	@Override
	public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Add nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Att pag");
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Ligando");
	}

	@Override
	public void atender() {
		System.out.println("Atentdido");
		
	} 	

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando musica");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Musica pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Musica selecionada: " + musica);
	}
}
