public class Cliente {
    private Servico servico;
    private Produto produto;

    public Cliente(FabricaAbstrata fabrica) {
        this.servico = fabrica.criarServico();
        this.produto = fabrica.criarProduto();
    }

    public void executarAtendimento() {
        servico.executar();
        produto.utilizar();
    }

    public static void main(String[] args) {
        FabricaAbstrata fabricaCorte = new FabricaCorteCabelo();
        Cliente cliente1 = new Cliente(fabricaCorte);
        cliente1.executarAtendimento();

        FabricaAbstrata fabricaManicure = new FabricaManicure();
        Cliente cliente2 = new Cliente(fabricaManicure);
        cliente2.executarAtendimento();
    }
}
