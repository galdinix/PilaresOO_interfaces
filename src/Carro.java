public class Carro {
    protected String modelo;

    protected int ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }
}
