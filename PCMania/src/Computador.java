public class Computador {
    String marca;
    float preco;
    HardwareBasico hardware;
    SistemaOperacional sistema;

    public Computador(String marca, float preco, HardwareBasico hardware, SistemaOperacional sistema){
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.sistema = sistema;
    }

    void mostraPcConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Hardware: " + hardware.nome + " com "+ hardware.capacidade + "GB de armazenamento");
        System.out.println("Sistema: " + sistema.nome + "(" + sistema.tipo + ")");
    }

    void addMemoriaUSB(MemoriaUSB usb){
        hardware.capacidade += usb.capacidade;
    }
}
