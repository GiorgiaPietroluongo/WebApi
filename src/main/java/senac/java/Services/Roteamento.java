package senac.java.Services;
import senac.java.Views.TelaCadastro;
import senac.java.Views.Telas;
import static java.lang.System.exit;
public class Roteamento {




        public static void rotas(int escolha){
            TelaCadastro telaCadastro = new TelaCadastro();
            Telas telas = new Telas();


            switch (escolha){

                case 1:

                    telaCadastro.cadastrarVendedor();
                    break;

                case 2:
                    telaCadastro.cadastroCliente();
                    break;

                case 3:
                    telaCadastro.cadastrarProduto();
                    break;

                case 4:
                    exit(0);
                    break;

                default:
                    System.out.println("Ocorreu um erro ao acessar as telas!");
                    telas.telaInicial();
                    break;

            }

        }
}
