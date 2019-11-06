/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Bruno
 */
public class CartaoCredito extends Cartao{
  private double gastoMaximo=1000, taxaJuros=3, valorGasto=100;
  
  public double getGastoMaximo() {
    return gastoMaximo;
  }
  
  public double getTaxaJuros() {
    return taxaJuros;
  }
  
  public void setValorGasto(double valor) {
    valorGasto = valorGasto + valor;
  }
  
  public double getValorGasto() {
    return valorGasto;
  }
  
  CartaoCredito(ContaBancaria conta) {
    super(conta);
  }
}
