package com.github.guiphilippsen.exercicio_biblioteca.service;

import com.github.guiphilippsen.exercicio_biblioteca.entity.Editora;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EditoraService {
    public String save (Editora editora) {
        return "Editora cadastrada com sucesso";
    }

    public String update (Editora editora, long id) {
        return "Atualizado com sucesso";
    }

    public Editora findById (long id) {

        List<Editora> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i);
            }
        }

        return null;

    }

    public List<Editora> findAll () {

        List<Editora> lista = new ArrayList<>();
        lista.add(new Editora(1, "Teste1", "Rua de barro 1"));
        lista.add(new Editora(2, "Teste2", "Rua de barro 2"));
        lista.add(new Editora(3, "Teste3", "Rua de barro 3"));
        lista.add(new Editora(4, "Teste4", "Rua de barro 4"));

        return lista;
    }

    public String delete (long id) {

        List<Editora> listaTemp = this.findAll();

        for (int i = 0; i < listaTemp.size(); i++) {
            if(listaTemp.get(i).getId() == id) {
                return listaTemp.get(i).getNome()+" deletado com sucesso";
            }
        }
        return "Editora não encontrada";
    }
}
