/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc01.model.dao;

import mvc01.model.vo.Ordenacao;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Gustavo Ferreira
 * @see Classe que executa as operacoes de IO (entrada e saida) do sistema com
 * relacao aos dados resultantes da ordenacao
 */
public class OrdenacaoDAO {
    /*
     *
     * Metodo que salva em um arquivo de texto os dados do objeto de ordenacao
     * @param Ordenacao ordenacao
     * @throws FileNotFoundException
     */

    public void salvar(Ordenacao ordenacao) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("ordenacao.txt");
        pw.print(ordenacao);
        pw.flush();
        pw.close();
    }
}
