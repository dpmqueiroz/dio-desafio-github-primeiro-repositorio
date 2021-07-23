import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main (String[] args){
        Endereco endereco = new Endereco();
        //endereco.setCep("72220232");

        Cliente cliente = new Cliente();
        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço foi adicionado com sucesso");
        }catch (Exception e){
            System.out.println("Houve um erro ao adicionar o endereço : "+e.getMessage());
        }


    }
}
