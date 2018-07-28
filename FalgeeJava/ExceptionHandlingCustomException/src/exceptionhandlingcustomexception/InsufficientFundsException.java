/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingcustomexception;

/**
 *
 * @author Sahil
 */
public class InsufficientFundsException extends Exception{
   private double amount;
   private String message = null;
   
   public InsufficientFundsException(double amount) {
      this.amount = amount;
   }
   
   public InsufficientFundsException(double amount,String message){
       this.amount = amount;
       this.message = message;
   }
   
   public InsufficientFundsException(){
       super();
   }
   public InsufficientFundsException(String message){
       super(message);
       this.message = message;
   }
   public InsufficientFundsException(Throwable cause){
       super(cause);
   }
   public InsufficientFundsException(String message, Throwable cause){
       super(message,cause);
       this.message = message;
   }
   public InsufficientFundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
       super(message,cause,enableSuppression,writableStackTrace);
       this.message = message;
   }
   public double getAmount() {
      return amount;
   }   
   
   @Override
   public String toString(){
       return "Insufficient Funds in Account!";
   }
   
   @Override
   public String getMessage(){
       return message;
   }
}
