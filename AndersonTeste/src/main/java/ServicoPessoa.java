
import java.util.List;

public class ServicoPessoa {

    public Pessoa identifyOlderPerson(List<Pessoa> pessoas) {
        Pessoa pessoaOld = new Pessoa();

        for (int i = 0; i < pessoas.size(); i++) {
            if(pessoas.get(i).getIdade()>pessoaOld.getIdade()){
                pessoaOld = pessoas.get(i);
            }
        }
        return pessoaOld;
    }

    public Pessoa identifyNewPerson(List<Pessoa> pessoas) {
        Pessoa pessoaNew = null;

        for (int i = 0; i < pessoas.size(); i++) {
            if(pessoaNew == null){
                pessoaNew = pessoas.get(i);
            } else if (pessoas.get(i).getIdade()<pessoaNew.getIdade()) {
                pessoaNew = pessoas.get(i);
            }
        }
        return pessoaNew;
    }
}