package entities;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public Iphone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    @Override
    public void tocar() {
        reprodutor.tocar();
    }

    @Override
    public void pausar() {
        reprodutor.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    @Override
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    @Override
    public void atender() {
        telefone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
}
