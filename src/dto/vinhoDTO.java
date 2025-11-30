package dto;

public class vinhoDTO {
    private int id;
    private String nome;
    private String ano;
    private String tipo;

    // Construtor padrão
    public vinhoDTO() {
    }

    // Construtor completo
    public vinhoDTO(int id, String nome, String ano, String tipo) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
