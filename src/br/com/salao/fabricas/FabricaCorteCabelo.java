public class FabricaCorteCabelo implements FabricaAbstrata {
    @Override
    public Servico criarServico() {
        return new CorteCabelo();
    }

    @Override
    public Produto criarProduto() {
        return new Shampoo();
    }
}
