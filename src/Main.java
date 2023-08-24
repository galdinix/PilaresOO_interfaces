import java.io.Console;

public class Main implements Regras {


    @Override
    public void metodo1() {

    }

    @Override
    public void metodo2() {

    }

    public static void main(String[] args) {
        CarroH2 carro = new CarroH2();
        carro.setModelo("fiat mobi");
        carro.setAno(2022);
        System.out.println(carro.getModelo());
        carro.setModelo("fiat mobi", 2002);
        System.out.println(carro.getModelo());
    }
}