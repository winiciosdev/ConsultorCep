public record Endereco(String cep, String logradouro, String complemento,
                       String localidade, String uf) {
    public void write(String json) {
    }
}
