import com.mycompany.cuenta.bancaria.poo.CuentaBancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CuentaBancariaTest {
    // TODO Adiciona tus pruebas unitarias aquí.
    // Los métodos deben estar anotados con la anotación @Test. Por ejemplo:
    //
    // @Test
    // public void miPrueba() {
    //      double valorEsperado = 10;
    //      double valorActual = Calculadora.calcular(7, 3, '+');
    //      assertEquals(valorEsperado, valorActual);
    // }
    
    @Test
    public void testIngresar() {
        CuentaBancaria miCuentaTest = new CuentaBancaria("Nathalia", "123547896", 1000000);
        
          double valorEsperado = 1200000;
          double valorActual = miCuentaTest.ingresar(200000);
          assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void segundoTestIngresar() {
        CuentaBancaria miCuentaTest = new CuentaBancaria("Nathalia", "123547896", 1500000);
        
          double valorEsperado = 1500000;
          double valorActual = miCuentaTest.ingresar(-300000);
          assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testRetirar() {
        CuentaBancaria miCuentaTest = new CuentaBancaria("Nathalia", "123547896", 1000000);
        
          double valorEsperado = 500000;
          double valorActual = miCuentaTest.retirar(500000);
          assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void segundoTestRetirar() {
        CuentaBancaria miCuentaTest = new CuentaBancaria("Nathalia", "123547896", 1500000);
        
          double valorEsperado = 1500000;
          double valorActual = miCuentaTest.retirar(-300000);
          assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testCalcularInteres() {
        CuentaBancaria miCuentaTest = new CuentaBancaria("Nathalia", "123547896", 1000000);
        
          double valorEsperado = 1015000;
          double valorActual = miCuentaTest.calcularInteres();
          assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void segundoTestCalcularInteres() {
        CuentaBancaria miCuentaTest = new CuentaBancaria("Nathalia", "123547896", 1500000);
        
          double valorEsperado = 1522500;
          double valorActual = miCuentaTest.calcularInteres();
          assertEquals(valorEsperado, valorActual);
    }
    
   
}
