import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    private List<Endereco> enderecos;

    public List<Endereco> getEnderecos() {
        if(this.enderecos == null){
            this.enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
    public void adicionaEndereco(Endereco endereco){
        if(endereco == null){
            throw new NullPointerException("Enderço não pode ser nulo");
        }
        if(endereco.getCep() == null){
            throw new NullPointerException("Cep não pode ser nulo");
        }
        if(this.enderecos == null){
            this.enderecos = new ArrayList<Endereco>();
        }
        this.getEnderecos().add(endereco);
    }

}
