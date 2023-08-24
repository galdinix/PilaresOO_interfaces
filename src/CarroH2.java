public class CarroH2 extends  Carro{
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        super.modelo = modelo + "h2";
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        super.ano = ano;
    }

    public void setModelo(String modelo, int ano){
        super.modelo = modelo + "h2";
        super.ano = ano;
    }


}
