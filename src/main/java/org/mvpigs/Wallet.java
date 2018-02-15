package org.mvpigs;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Wallet {
    public PublicKey address;
    private PrivateKey SK;

    public Wallet (){

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



}
