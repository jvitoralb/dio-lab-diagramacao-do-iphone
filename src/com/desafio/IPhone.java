package com.desafio;

import com.desafio.interfaces.Navegador;
import com.desafio.interfaces.ReprodutorDeMusicas;
import com.desafio.interfaces.Telefone;

public class IPhone implements Telefone, ReprodutorDeMusicas, Navegador {
    public void exibirPagina() {
        System.out.println("Exibindo página da internet no navegador...");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do navegador...");
    }

    public void tocar() {
        System.out.println("Reproduzindo música...");
    }
    public void pausar() {
        System.out.println("Pausando música...");
    }
    public void selecionarMusica(String m) {
        System.out.println("Selecionando música" + m + "...");
    }

    public void ligar() {
        System.out.println("Ligando do telefone...");
    }
    public void atender() {
        System.out.println("Atendendo ligação do telefone...");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz do telefone...");
    }
}
