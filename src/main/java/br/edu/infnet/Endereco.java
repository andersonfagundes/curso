package br.edu.infnet;

public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    private Endereco(String rua, String numero, String complemento, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public static class EnderecoBuilder {
        private String rua;
        private String numero;
        private String complemento;
        private String bairro;
        private String cidade;
        private String estado;

        public Endereco.EnderecoBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public Endereco.EnderecoBuilder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public Endereco.EnderecoBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public Endereco.EnderecoBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Endereco.EnderecoBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Endereco.EnderecoBuilder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public Endereco build() {
            return new Endereco(rua, numero, complemento, bairro, cidade, estado);
        }
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
