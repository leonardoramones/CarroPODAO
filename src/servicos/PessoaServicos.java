/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.DAOFactory;
import dao.PessoaDAO;
import java.util.ArrayList;
import model.Carro;
import model.Pessoa;

/**
 *
 * @author jbferraz
 */
public class PessoaServicos {
    
    public void cadastroPessoa(Pessoa pVO){
        PessoaDAO pDAO = DAOFactory.Pessoa();
        pDAO.cadastrarPessoaDAO(pVO);
    }
    
    public ArrayList<Pessoa> getPessoas(){
        PessoaDAO pDAO = DAOFactory.Pessoa();
        return pDAO.getPessoas();
    }
    
    public Pessoa getPessoaByDoc(String cpf){
        PessoaDAO pDAO = DAOFactory.Pessoa();
        return pDAO.getPessoaByDoc(cpf);
    }
    
    public void atualizarPessoa(Pessoa pVO){
        PessoaDAO pDAO = DAOFactory.Pessoa();
        pDAO.atualizarPessoaDAO(pVO);
    }
    
    public void deletarPessoa(String cpf){
        PessoaDAO pDAO = DAOFactory.Pessoa();
        pDAO.deletarPessoaDAO(cpf);
    }

    public Carro getCarroByDoc(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
