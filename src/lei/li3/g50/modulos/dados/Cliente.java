package lei.li3.g50.modulos.dados;

import java.io.Serializable;

public class Cliente implements Comparable<Cliente>, Serializable {

    private static final long serialVersionUID = 5553661613461345181L;
    private String codigo_cliente;

    /*
     CONSTRUCTORES
     */
    public Cliente() {
        codigo_cliente = "";
    }

    public Cliente(String cod_cliente) {
        codigo_cliente = cod_cliente;
    }

    public Cliente(Cliente cliente) {
        codigo_cliente = cliente.getCodigoCliente();
    }

    /*
     SETTERS E GETTERS
     */
    public String getCodigoCliente() {
        return codigo_cliente;
    }

    public void setCodigoCliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    /*
     METODOS CLIENTE
     */
    public boolean equals(Cliente cliente) {
        return this.codigo_cliente.equals(cliente.getCodigoCliente());
    }

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
        Cliente cliente = (Cliente) obj;
        return this.codigo_cliente.equals(cliente.codigo_cliente);
    }

    @Override
    public int hashCode() {
        return codigo_cliente.hashCode();
    }

    @Override
    public Cliente clone() {
        return new Cliente(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{" + "codigo_cliente=").append(codigo_cliente).append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Cliente c) {
        return this.codigo_cliente.compareTo(c.getCodigoCliente());
    }

}
