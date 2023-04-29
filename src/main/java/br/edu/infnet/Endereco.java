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

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
