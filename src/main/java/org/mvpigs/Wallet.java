package org.mvpigs;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Wallet {
    public PublicKey address;
    private PrivateKey SK;
    private Double Total_Input = 0.0;
    private Double Total_Output = 0.0;
    private Double Balance = 0.0;


    public Wallet(){

    }

    public Double getTotal_Input() {
        return Total_Input;
    }

    public void setTotal_Input(Double total_Input) {
        Total_Input = total_Input;
    }

    public Double getTotal_Output() {
        return Total_Output;
    }

    public void setTotal_Output(Double total_Output) {
        Total_Output = total_Output;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }

    public PublicKey getAddress() {
        return address;
    }

    public void setAddress(PublicKey adress) {
        this.address = adress;
    }

    public PrivateKey getSK() {
        return SK;
    }

    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }


    public void generateKeyPair(){
        KeyPair pair = GenSig.generateKeyPair();
        this.setSK(pair.getPrivate());
        this.setAddress(pair.getPublic());

    }

    public void toString(){
        System.out.println("Wallet = " + this.getAddress().hashCode());
        System.out.println("Total Input = " + this.getTotal_Input());
        System.out.println("Total Output = " + this.getTotal_Output());
        System.out.println("Balance = " + this.getBalance() + "\n");

    }
}
