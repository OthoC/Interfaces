package com.pagos;

public class Main {
    public static void main(String[] args) {
        
        Transferencia transferencia1 = new Transferencia("1234567890", "Pichincha", "1728203926");
        TarjetaCredito tarjetaCredito1 = new TarjetaCredito("156164961641", "Maicky", "12/33", "258");



        CarritoCompras carrito = new CarritoCompras();
        carrito.agregarProducto(new Producto("Laptop", 1500));
        carrito.agregarProducto(new Producto("Smartphone", 800));
        carrito.agregarProducto(new Producto("Audífonos", 200));
        carrito.mostrarProductos();
        System.out.println();
        System.out.println("Pago con transferencia");
        carrito.pagar(transferencia1); 
        System.out.println();
        System.out.println("Pago con tarjeta de credito");
        carrito.pagar(tarjetaCredito1);
    }
}
