package com.github.guiphilippsen.exercicio_biblioteca.service;

import com.github.guiphilippsen.exercicio_biblioteca.entity.Biblioteca;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BibliotecaService {
    public String save (Biblioteca biblioteca) {
        return "Biblioteca cadastrada com sucesso";
    }

    public String update (Biblioteca biblioteca, long id) {
        return "Atualizado com sucesso";
    }

    public Biblioteca findById (long id) {

        List<Biblioteca> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i);
            }
        }

        return null;

    }

    public List<Biblioteca> findAll () {

        List<Biblioteca> lista = new ArrayList<>();
        lista.add(new Biblioteca(1, "Rua de barro 1", "99999-0123"));
        lista.add(new Biblioteca(2, "Rua de barro 2", "99999-1234"));
        lista.add(new Biblioteca(3, "Rua de barro 3", "99999-2345"));
        lista.add(new Biblioteca(4, "Rua de barro 4", "99999-3456"));

        return lista;
    }

    public String delete (long id) {

        List<Biblioteca> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i).getId()+" deletado com sucesso";
            }
        }
        return "Biblioteca não encontrada";
    }
}
