import java.util.ArrayList;
import java.util.Scanner;

public abstract class MetodosProduto {

    public static Computador maisCaro(ArrayList<Computador> arr){
        Computador maior = arr.get(0);
        for(Computador c : arr){
            if(maior.getPreco()<c.getPreco())
                maior=c;
        }

        return maior;
    }

    public static Computador maisBarato(ArrayList<Computador> arr){
        Computador menor = arr.get(0);
        for(Computador c : arr){
            if(menor.getPreco()>c.getPreco())
                menor=c;
        }

        return menor;
    }

    public static double mediaPreco(ArrayList<Computador> arr){
        int qtd=0;
        double media=0;
        for(Computador c : arr){
            media+=c.getPreco();
            qtd++;
        }

        return media/qtd;
    }

    public static int acimaMedia(ArrayList<Computador> arr){
        int qtd=0;
        double media=mediaPreco(arr);
        for(Computador c : arr){
            if(c.getPreco()>media)
                qtd++;
        }

        return qtd;
    }

    public static void montarComputador(ArrayList<Computador> arr){
        Computador cp1 = new Computador();
        double preco=0;
        System.out.println("Escolha o seu kit (Placa mãe, Processador e Memória RAM):");
        System.out.println("1 - H55 DDR3, Intel Core i3-530 e 4GB RAM DDR3 (2x2GB) (R$250,00)\n2 - B550m-k DDR4, AMD Ryzen 7 5800x e 8GB RAM DDR4 (2x4GB) (R$500,00)\n3 - B760M DDR5, Intel i9-13900KS E 32GB RAM DDR5 (2x16GB) (R$750,00)");
        switch (new Scanner(System.in).nextInt()){
            case 1:
                cp1.setDescricao("H55 DDR3, Intel Core i3-530 e 4GB RAM DDR3 (2x2GB)");
                preco+=250;
                break;
            case 2:
                cp1.setDescricao("B550m-k DDR4, AMD Ryzen 7 5800x e 8GB RAM DDR4 (2x4GB)");
                preco+=500;
                break;
            case 3:
                cp1.setDescricao("B760M DDR5, Intel i9-13900KS E 32GB RAM DDR5 (2x16GB)");
                preco+=750;
                break;
            default:
                System.out.println("Opção inválida! Selecione novamente");

        }
        System.out.println("Escolha a placa de vídeo:");
        System.out.println("1 - NVIDIA GT210 512Mb DDR3 (R$250,00)\n2 - NVIDIA GeForce RTX 3060 12Gb GDDR6 (R$500,00)\n3 - NVIDIA GeForce RTX 4080 16GB GDDR6X (R$750,00)");
        switch (new Scanner(System.in).nextInt()){
            case 1:
                cp1.setPlacaVideo("NVIDIA GT210 512Mb DDR3");
                preco+=250;
                break;
            case 2:
                cp1.setPlacaVideo("NVIDIA GeForce RTX 3060 12Gb GDDR6");
                preco+=500;
                break;
            case 3:
                cp1.setPlacaVideo("NVIDIA GeForce RTX 4080 16GB GDDR6X");
                preco+=750;
                break;
            default:
                System.out.println("Opção inválida! Selecione novamente");
        }

        System.out.println("Escolha o tipo de armazenamento:");
        System.out.println("1 - HD SeaGate 1TB (R$250,00)\n2 - SSD Kingston 960GB (R$500,00)\n3 - SSD Corsair 8TB (R$750,00)");
        switch (new Scanner(System.in).nextInt()){
            case 1:
                cp1.setArmazenamento("HD SeaGate 1TB");
                preco+=250;
                break;
            case 2:
                cp1.setArmazenamento("SSD Kingston 960GB");
                preco+=500;
                break;
            case 3:
                cp1.setArmazenamento("SSD Corsair 8TB");
                preco+=750;
                break;
            default:
                System.out.println("Opção inválida! Selecione novamente");
        }

        System.out.println("Escolha a fonte de alimentação:");
        System.out.println("1 - T-Dagger 500W (R$250,00)\n2 - Gamemax GX1250 1250W 80 Plus Platinum (R$500,00)\n3 - Corsair Hx1500i 1500W 80 Plus Platinum (R$750,00)");
        switch (new Scanner(System.in).nextInt()){
            case 1:
                cp1.setFonte("T-Dagger 500W");
                preco+=250;
                break;
            case 2:
                cp1.setFonte("Gamemax GX1250 1250W 80 Plus Platinum");
                preco+=500;
                break;
            case 3:
                cp1.setFonte("Corsair Hx1500i 1500W 80 Plus Platinum");
                preco+=750;
                break;
            default:
                System.out.println("Opção inválida! Selecione novamente");
        }
        arr.add(new Computador(cp1.getDescricao(),preco, cp1.getPlacaVideo(), cp1.getFonte(), cp1.getArmazenamento()));
    }
}
