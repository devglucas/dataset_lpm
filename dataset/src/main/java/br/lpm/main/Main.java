package br.lpm.main;

import java.time.LocalDate;
import br.lpm.business.EstadoCivil;
import br.lpm.business.FormacaoAcademica;
import br.lpm.business.Pessoa;
import br.lpm.business.Profissao;

public class Main {
    public static Pessoa[] pessoas = new Pessoa[10];
    private static int count = 0;
    public static void main(String[] args) throws Exception {
        Pessoa firstPerson = new Pessoa();
        firstPerson.setNome("Lucas");
        firstPerson.setAltura(1.78f);
        firstPerson.setPeso(82.6f);
        firstPerson.setDatanasc(LocalDate.of(2003, 4, 8));
        firstPerson.setEstadoCivil(EstadoCivil.CASADO);
        firstPerson.setFormacaoAcadem(FormacaoAcademica.SUPERIOR);
        firstPerson.setProfissao(Profissao.CLT);
        firstPerson.setVidasocial(true);
        firstPerson.setHobby(false);
        firstPerson.setAtividadeFisica(5);
        firstPerson.setEstadoSaude(8);
        pessoas[count] = firstPerson;
        count++;
        
        Pessoa secondPerson = new Pessoa();
        secondPerson.setNome("Leandro");
        secondPerson.setAltura(1.92f);
        secondPerson.setPeso(126.6f);
        secondPerson.setDatanasc(LocalDate.of(2001, 8, 28));
        secondPerson.setEstadoCivil(EstadoCivil.SEPARADO);
        secondPerson.setFormacaoAcadem(FormacaoAcademica.MEDIA);
        secondPerson.setProfissao(Profissao.EMPRESARIO);
        secondPerson.setVidasocial(false);
        secondPerson.setHobby(true);
        secondPerson.setAtividadeFisica(7);
        secondPerson.setEstadoSaude(6);
        pessoas[count] = secondPerson;
        count++;


        System.out.println("Dados cadastrados: ");
        for (int i = 0; i < count; i++) {
            System.out.println(pessoas[i].getNome());
            System.out.println(pessoas[i].getAltura());
            System.out.println(pessoas[i].getPeso());
            System.out.println(pessoas[i].getDatanasc());
            System.out.println(pessoas[i].getEstadoCivil());
            System.out.println(pessoas[i].getFormacaoAcadem());
            System.out.println(pessoas[i].getProfissao());
            System.out.println(pessoas[i].getVidasocial());
            System.out.println(pessoas[i].getHobby());
            System.out.println(pessoas[i].getAtividadeFisica());
            System.out.println(pessoas[i].getEstadoSaude());
            System.out.println("\n");
        }





        
    }
}
