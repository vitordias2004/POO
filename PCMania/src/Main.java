import java.util.Scanner;

// Nome: Vitor Dias Carlos
// Matrícula: 445
// Curso: GES

public class Main {
    public static void main(String[] args) {

        HardwareBasico H1 = new HardwareBasico("Pentium Core i3", 500);
        HardwareBasico H2 = new HardwareBasico("Pentium Core i5", 1000);
        HardwareBasico H3 = new HardwareBasico("Pentium Core i7", 2000);

        SistemaOperacional so1 = new SistemaOperacional("Linux Ubuntu", 32);
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);

        MemoriaUSB usb1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB usb2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB usb3 = new MemoriaUSB("HD externo", 1000);

        Computador pc1 = new Computador("Apple", 445, H1, so1);
        Computador pc2 = new Computador("Samsung", 1679, H2, so2);
        Computador pc3 = new Computador("Dell", 6123, H3, so3);


        Cliente cliente = new Cliente("Jubileu", 1234567891);

        Scanner entrada = new Scanner(System.in);
        MemoriaUSB[] memorias = {usb1, usb2, usb3};
        Computador[] pcs = {pc1, pc2, pc3};
        int compra, numCompras = 0;
        int[] computadoresComprados = new int[3];

        System.out.println();

        do {
            System.out.println("Computadores disponiveis:");
            System.out.println();
            for(int i = 0; i < pcs.length; i++) {
                if(pcs[i] != null) {
                    System.out.println("Computador (" + (i + 1) + "): ");
                    pcs[i].mostraPcConfigs();
                    System.out.println("Acompanha " + memorias[i].nome + " de " + memorias[i].capacidade + "GB");
                    System.out.println();
                }
            }
            do {
                System.out.println("Escolha qual computador quer comprar: (1), (2) ou (3). Digite (0) para seguir ao caixa.");
                System.out.println();
                compra = entrada.nextInt();
                System.out.println();
                if(compra < 0 || compra > 3){
                    System.out.print("Entrada inválida, ");
                }
            }while(compra < 0 || compra > 3);


            if(compra != 0) {
                if (pcs[compra - 1] == null) {
                    System.out.print("Computador " + compra + " fora de estoque, ");
                } else {
                    for (int i = 0; i < cliente.computadores_comprados.length; i++) {
                        if (cliente.computadores_comprados[i] == null) {
                            pcs[compra - 1].addMemoriaUSB(memorias[compra - 1]);
                            cliente.computadores_comprados[i] = pcs[compra - 1];
                            System.out.println("Computador (" + compra + ") adicionado ao carrinho.");
                            System.out.println();
                            computadoresComprados[i] = compra;
                            pcs[compra - 1] = null;
                            numCompras++;
                            break;
                        }
                    }
                }
            }

        }while(compra != 0 && numCompras < 3);

        if(numCompras == 3) {
            System.out.println("Todos computadores disponíveis comprados, seguindo ao caixa.");
            System.out.println();
        }
        if(numCompras == 0) {
            System.out.println("Nenhum computador comprado.");
        }

        System.out.println();
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Cpf: " + cliente.cpf);
        System.out.println();

        if(numCompras != 0) {
            System.out.println("Computadores comprados(memoria USB já adicionada): ");
            System.out.println();
            for (int i = 0; i < cliente.computadores_comprados.length; i++) {
                if (cliente.computadores_comprados[i] != null) {
                    System.out.println("computador (" + computadoresComprados[i] + "): ");
                    cliente.computadores_comprados[i].mostraPcConfigs();
                    System.out.println();
                }
            }
        }

        System.out.println("Total a pagar: R$" + cliente.calculaTotalCompra());

        entrada.close();
    }
}