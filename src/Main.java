import java.text.DecimalFormat;

public class Main {
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

        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        String valorTotalComImpostosFormatado = df.format(valorTotalComImpostos);
        String precoVendaSugeridoFormatado = df.format(precoVendaSugerido);
        String mensagemFinal = "Produto: " + nomeProduto + ", Valor Total com Impostos: "
                + valorTotalComImpostosFormatado + ", Preço de Venda Sugerido: " + precoVendaSugeridoFormatado;

        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: R$ " + df.format(precoUnitario));
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println(mensagemFinal);
    }
}