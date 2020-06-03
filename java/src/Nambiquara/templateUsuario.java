package Nambiquara;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class templateUsuario extends nambiquaraRh implements Serializable{
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private String curso;
    private String certificacao;
    private String cpf;
    private String idioma;
    private String login;
    private String pretencaoSalarial;
    private boolean deficiencia;
    private String senha;
    private String cargo;
    private String departamento;
    private String nivel;
    
    
    public void CadastroCandidato() {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", ".:Cadastro:.", 1);
        setNome(nome);
        String email = JOptionPane.showInputDialog(null, "Digite seu email: ", ".:Cadastro:.", 1);
        setEmail(email);
        String endereco = JOptionPane.showInputDialog(null, "Digite seu email: ", ".:Cadastro:.", 1);
        setEndereco(endereco);
        String telefone = JOptionPane.showInputDialog(null, "Digite seu email: ", ".:Cadastro:.", 1);
        setTelefone(telefone);
        String curso = JOptionPane.showInputDialog(null, "Digite seu curso!", ".:Cadastro:.", 1);
        setCurso(curso);
        String certificacao = JOptionPane.showInputDialog(null, "Digite seu certificacao!", ".:Cadastro:.", 1);
        setCertificacao(certificacao);
        String cpf = JOptionPane.showInputDialog(null, "Digite seu cpf!", ".:Cadastro:.", 1);
        setCpf(cpf);
        String idioma = JOptionPane.showInputDialog(null, "Digite seu idioma!", ".:Cadastro:.", 1);
        setIdioma(idioma);
        String login = JOptionPane.showInputDialog(null, "Digite seu login!", ".:Cadastro:.", 1);
        setLogin(login);
        String pretencaoSalarial = JOptionPane.showInputDialog(null, "Digite seu pretencaoSalarial!", ".:Cadastro:.", 1);
        setPretencaoSalarial(pretencaoSalarial);
        int deficienciayn = JOptionPane.showConfirmDialog(null, "Digite seu deficiencia!", ".:Cadastro:.",JOptionPane.YES_NO_OPTION);
            if (deficienciayn == JOptionPane.YES_OPTION) {
                deficiencia = true;
            } else {
                deficiencia = false;
            }
        setDeficiencia(deficiencia);
        String emai = JOptionPane.showInputDialog(null, "Digite seu email!", ".:Cadastro:.", 1);
        setEmail(email);
        setNivel("1");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(String certificacao) {
        this.certificacao = certificacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretencaoSalarial(String pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }

    public boolean isDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(boolean deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}