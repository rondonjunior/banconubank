package db;

import Tabelas.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    public List<Pessoa> buscarPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        String sql = "SELECT ID, CPF, NOME, CELULAR, EMAIL, CONFIRMA_EMAIL FROM PESSOA";

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("ID"));
                pessoa.setCpf(rs.getString("CPF"));
                pessoa.setNome(rs.getString("NOME"));
                pessoa.setCelular(rs.getString("CELULAR"));
                pessoa.setEmail(rs.getString("EMAIL"));
                pessoa.setConfirmaEmail(rs.getString("CONFIRMA_EMAIL"));

                pessoas.add(pessoa);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar pessoas no banco: " + e.getMessage(), e);
        }

        return pessoas;
    }
}
