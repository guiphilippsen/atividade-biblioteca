package com.github.guiphilippsen.exercicio_biblioteca.service;


import com.github.guiphilippsen.exercicio_biblioteca.entity.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {
    public String save (Livro livro) {
        return "Biblioteca cadastrada com sucesso";
    }

    public String update (Livro livro, long id) {
        return "Atualizado com sucesso";
    }

    public Livro findById (long id) {

        List<Livro> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i);
            }
        }

        return null;

    }

    public List<Livro> findAll () {

        List<Livro> lista = new ArrayList<>();
        lista.add(new Livro(1, "O Teste 1", "12/06/2003", "Dorime"));
        lista.add(new Livro(2, "O Teste 2", "12/06/2004", "Dorime"));
        lista.add(new Livro(3, "O Teste 3", "12/06/2005", "Dorime"));
        lista.add(new Livro(4, "O Teste 4", "12/06/2006", "Dorime"));

        return lista;
    }

    public String delete (long id) {

        List<Livro> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i).getTitulo()+" deletado com sucesso";
            }
        }
        return "Livro não encontrada";
    }
}
