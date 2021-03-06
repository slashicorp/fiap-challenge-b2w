package Nambiquara;

import java.io.Serializable;

import javax.swing.*;

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

        String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço: ", ".:Cadastro:.", 1);
        setEndereco(endereco);

        String telefone = JOptionPane.showInputDialog(null, "Digite seu telefone: ", ".:Cadastro:.", 1);
        setTelefone(telefone);

        int cursoSimOuNao = JOptionPane.showConfirmDialog(null, "Deseja adicionar algum curso?  ", ".:Cadastro de cursos:.",JOptionPane.YES_NO_OPTION);
        int cursoQuantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja adicionar quantos cursos?", ".:Cadastro de cursos:", 1));
        if (cursoSimOuNao == JOptionPane.YES_OPTION) {
            int i = 0;
            while (i<cursoQuantidade){
                String curso = JOptionPane.showInputDialog(null, "Nome do curso: ", "..:: Cadastrando Curso ::..", 1);
                setCurso(curso);

                i++;
            }
        }

        int certificSimOuNao = JOptionPane.showConfirmDialog(null, "Deseja adicionar alguma certificação?  ", ".:Cadastro de certificações:.",JOptionPane.YES_NO_OPTION);
        int certificQuantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja adicionar quantas certicicações?", ".:Cadastro de certificações:", 1));
        if (certificSimOuNao == JOptionPane.YES_OPTION) {
            int i = 0;
            while (i<certificQuantidade){
                String certificacao = JOptionPane.showInputDialog(null, "Nome e ID da Certificação (Exp.: Nome, ID): ", "..:: Cadastrando Certificações ::..", 1);
                setCertificacao(certificacao);
                i++;
            }
        }

        String cpf = JOptionPane.showInputDialog(null, "Digite seu cpf:", ".:Cadastro de CPF:.", 1);
        setCpf(cpf);

        int idiomasSimOuNao = JOptionPane.showConfirmDialog(null, "Deseja adicionar alguma Proeficiência em Idiomas? ", ".:Cadastro de Idiomas:.",JOptionPane.YES_NO_OPTION);
        int idiomasQuantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja adicionar quantos idiomas?", ".:Cadastro de idiomas:", 1));
        if (idiomasSimOuNao == JOptionPane.YES_OPTION) {
            int i = 0;
            while (i<idiomasQuantidade){
                String idimoa = JOptionPane.showInputDialog(null, "Idioma: ", "..:: Cadastrando Idiomas ::..", 1);
                setIdioma(idimoa);
                i++;
            }
        }

        String login = JOptionPane.showInputDialog(null, "Cadastre seu login! 'primeiro.ultimonome' ",".:Cadastro:.", 1);
        setLogin(login);

        JPasswordField pwd = new JPasswordField();
        int senha = JOptionPane.showConfirmDialog(null, pwd, "Digite sua senha:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (senha == JOptionPane.OK_OPTION) {
            String passwod = new String(pwd.getPassword());
            System.err.println("Você colocou: " + passwod);
            setSenha(passwod);
        }

        String pretencaoSalarial = JOptionPane.showInputDialog(null, "Digite seu pretencaoSalarial!", ".:Cadastro:.", 1);
        setPretencaoSalarial(pretencaoSalarial);
        int deficienciayn = JOptionPane.showConfirmDialog(null, "Portador de deficiência? ", ".:Cadastro:.",JOptionPane.YES_NO_OPTION);
            if (deficienciayn == JOptionPane.YES_OPTION) {
                deficiencia = true;
            } else {
                deficiencia = false;
            }
        setDeficiencia(deficiencia);

        setNivel("CANDIDATO");
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

    public String getPretencaoSalarial() {
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