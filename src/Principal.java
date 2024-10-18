import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        ConsultaCep consultaDeCep = new ConsultaCep();

        System.out.println("Digite o número do CEP para realizar a consulta: ");
        var cep = dado.nextLine();

        try{
            Endereco novoEndereco = consultaDeCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivos geradorArquivo = new GeradorDeArquivos();
            geradorArquivo.salvaArquivoJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Aplicação finalizada");
        }



    }
}
