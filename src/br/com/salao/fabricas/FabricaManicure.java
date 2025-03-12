public class FabricaManicure implements FabricaAbstrata {
    @Override
    public Servico criarServico() {
        return new Manicure();
    }

    @Override
    public Produto criarProduto() {
        return new Condicionador();
    }
}
