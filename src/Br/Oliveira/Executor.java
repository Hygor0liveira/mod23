package Br.Oliveira;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class Executor {
    public static void main(String[] args) {
        List<Pessoa> lista  = new Pessoa().listaGnero();
        lista.stream().forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("---------------------------------");

        List<Pessoa> mulheres = lista.stream()
                .filter(p -> p.getGenero().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        mulheres.forEach(m -> System.out.println(m.getNome() + " - " + m.getGenero()));
    }
}


