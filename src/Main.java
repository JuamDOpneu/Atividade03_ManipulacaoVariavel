public class Main{
    public static void main(String[] args) {
        // Criação de Variáveis
        String nomeProduto = "Notebook";
        double precoUnitario = 2500.00;
        int quantidadeComprada = 3;
        double taxaImposto = 0.10; // 10%
        double margemLucro = 0.20; // 20%

        // Operações Simples
        double valorTotalSemImpostos = precoUnitario * quantidadeComprada;
        double valorImposto = valorTotalSemImpostos * taxaImposto;
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;
        double precoVendaSugerido = valorTotalComImpostos * (1 + margemLucro);

        // Exibição de Resultados
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
    }
}
