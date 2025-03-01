package lei.li3.g50.modulos.dados;

import java.io.Serializable;

public class Produto implements Comparable<Produto>, Serializable {

    private static final long serialVersionUID = -700854503228887841L;
    private String codigo_produto;

    /*
     CONSTRUCTORES
     */
    public Produto() {
        codigo_produto = "";
    }

    public Produto(String cod_produto) {
        codigo_produto = cod_produto;
    }

    public Produto(Produto produto) {
        codigo_produto = produto.getCodigoProduto();
    }

    /*
     SETTERS E GETTERS
     */
    public String getCodigoProduto() {
        return codigo_produto;
    }

    public void setCodigoProduto(String codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    /*
     METODOS PRODUTO
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Produto produto = (Produto) obj;
        return this.codigo_produto.equals(produto.codigo_produto);
    }

    @Override
    public Produto clone() {
        return new Produto(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Produto{" + "codigo_produto=").append(codigo_produto).append('}');

        return sb.toString();
    }

    @Override
    public int hashCode() {
        return codigo_produto.hashCode();
    }

    @Override
    public int compareTo(Produto c) {
        return this.codigo_produto.compareTo(c.getCodigoProduto());
    }

}
