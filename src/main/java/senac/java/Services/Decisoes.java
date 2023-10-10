package senac.java.Services;

import senac.java.Views.TelaCadastro;
import senac.java.Views.Telas;

public class Decisoes {
    public static void escolhaUsuario(String decisao, String tela){
        Telas telas = new Telas();
        TelaCadastro telaCadastro = new TelaCadastro();

        if (decisao.equals("S") || decisao.equals("s")){
            if(tela.equals("Vendedor")){
                telaCadastro.cadastrarVendedor();
            }else if(tela.equals("Cliente")){
                telaCadastro.cadastroCliente();
            }
            System.out.println("Cheguei no Sim!");
        }else if(decisao.equals("N") || decisao.equals("n")){
          telas.telaInicial();
        }else {
            System.out.println("Cheguei no genérico");
        }



    }
}
