public class Computador extends Produto{

    private String placaVideo;
    private String fonte;
    private String armazenamento;

    public Computador() {
        super();
    }

    public Computador(String descricao, double preco, String placaVideo, String fonte, String armazenamento) {
        super(descricao, preco);
        this.placaVideo = placaVideo;
        this.fonte = fonte;
        this.armazenamento = armazenamento;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString(){
        return super.toString()+
                "\nPlaca de Vídeo: "+placaVideo+
                "\nArmazenamento: "+armazenamento+
                "\nFonte: "+fonte+
                "\nPreço Final: "+getPreco();
    }
}
