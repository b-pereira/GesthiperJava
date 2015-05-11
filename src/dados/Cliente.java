package dados;

public class Cliente {
    private String codigo_cliente;
    
    /*
    CONSTRUCTORES
    */
    public Cliente(){
        codigo_cliente = null;
    }
    
    public Cliente(String cod_cliente){
        codigo_cliente = cod_cliente;
    }
    
    public Cliente(Cliente cliente){
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
    
    public boolean equals(Cliente cliente){
        return this.codigo_cliente.equals(cliente.getCodigoCliente());
    }
    
    
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Cliente cliente = (Cliente) obj;
        return this.equals(cliente);
    }
    
    @Override
    public Cliente clone(){
        return new Cliente(this);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "codigo_cliente=" + codigo_cliente + '}';
    }
    
}
