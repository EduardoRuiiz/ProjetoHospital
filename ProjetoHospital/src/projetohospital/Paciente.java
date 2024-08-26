package projetohospital;


class Paciente {
    public String nome;
    public String tipoEnfermidade;
    
    //construtor, armazena varias informaçoes
    public Paciente (String nome, String tipoEnfermidade){
        this.nome = nome;
        this.tipoEnfermidade = tipoEnfermidade;
    }
    public void alterarEnfermidade(String tipoEnfermidade){
        this.tipoEnfermidade = tipoEnfermidade;
    }
    public String relatorioPaciente(){
        return "individuo " + nome + " doenca " + tipoEnfermidade + "\n" ;
    }
}
