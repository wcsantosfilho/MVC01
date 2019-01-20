/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc01.model.dao;

import mvc01.model.vo.Passos;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Gustavo Ferreira
 * @see Classe que executa as operacoes de IO (entrada e saida) do sistema com
 * relacao aos dados resultantes do passo a passo
 */


public class PassosDAO {

    /**
     * Metodo que recebe todos os passos (lista) e salva todos em um arquivo
     *
     * @param passos
     * @throws FileNotFoundException
     */
    public void salvarPassos(List<Passos> passos) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("passos.txt");
        for (Passos p : passos) {
            pw.print(p);
        }
        pw.flush();
        pw.close();
    }
}

