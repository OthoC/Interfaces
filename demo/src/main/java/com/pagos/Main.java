package com.pagos;

public class Main {
    public static void main(String[] args) {
        
        Transferencia transferencia1 = new Transferencia("1234567890", "Pichincha", "1728203926");
        transferencia1.pagar(100);

        TarjetaCredito tarjetaCredito1 = new TarjetaCredito("156164961641", "Maicky", "12/33", "258");
        tarjetaCredito1.pagar(2000);
    }
}
