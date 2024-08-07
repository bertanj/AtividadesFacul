import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ServicoPessoaTeste {

    @Test
    public void findOldPerson(){
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ana");
        pessoa.setIdade(29);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Mateus");
        pessoa2.setIdade(18);

        //Pessoa[] pessoas = new Pessoa[2];

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);


        ServicoPessoa servicoPessoa = new ServicoPessoa();
        Assert.assertEquals(pessoa, servicoPessoa.identifyOlderPerson(pessoas));
    }

    @Test
    public void findNewPerson(){
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ana");
        pessoa.setIdade(29);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Mateus");
        pessoa2.setIdade(18);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Jorginho");
        pessoa3.setIdade(13);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        ServicoPessoa servicoPessoa = new ServicoPessoa();
        Assert.assertEquals(pessoa, servicoPessoa.identifyNewPerson(pessoas));
    }

}
