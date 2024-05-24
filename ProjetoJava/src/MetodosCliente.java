import java.util.ArrayList;

public class MetodosCliente {

    public static Cliente maisVelho(ArrayList<Cliente> arr){
        Cliente maiorIdade = arr.get(0);
        for(Cliente a : arr){
            if(maiorIdade.getIdade()<a.getIdade())
                maiorIdade=a;
        }

        return maiorIdade;
    }

    public static Cliente maisJovem(ArrayList<Cliente> arr){
        Cliente maisNovo = arr.get(0);
        for(Cliente a : arr){
            if(maisNovo.getIdade()>a.getIdade())
                maisNovo=a;
        }

        return maisNovo;
    }

    public static int maiorSessenta(ArrayList<Cliente> arr){
        int qtd=0;
        for(Cliente a : arr){
            if(a.getIdade()>60)
                qtd++;
        }
        return qtd;
    }

    public static int menorDezoito(ArrayList<Cliente> arr){
        int qtd=0;
        for(Cliente a : arr){
            if(a.getIdade()<18)
                qtd++;
        }

        return qtd;
    }

    public static double mediaIdades(ArrayList<Cliente> arr){
        int qtd=0;
        double media=0;
        for(Cliente a : arr){
            media+=a.getIdade();
            qtd++;
        }
        return media/qtd;
    }
}
