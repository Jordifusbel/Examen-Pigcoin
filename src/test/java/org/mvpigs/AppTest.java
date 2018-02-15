package org.mvpigs;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.security.KeyPair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AppTest
{
    /**@test**/
    public void testHist1() {
        Wallet wallet_1 = new Wallet();
        KeyPair pair = GenSig.generateKeyPair();
        wallet_1.setSK(pair.getPrivate());
        wallet_1.setAddress(pair.getPublic());
        assertNotNull(wallet_1.getAddress());
    }
    /**@test**/
    public void testHist2() {
        Wallet wallet_1 = new Wallet();
        wallet_1.generateKeyPair();
        assertNotNull(wallet_1.getAddress());
    }

    /**@test**/
    public void testHist3() {
        Wallet wallet_1 = new Wallet();
        assertEquals("Wallet = '%%%%%%%'" +
                "Total Input = 0.0" +
                "Total Output = 0.0" +
                "Balance = 0.0",  System.out.println(wallet_1.toString()));
    }

    /**@test**/
    public void testHist4() {
        Wallet wallet_1 = new Wallet();
        Wallet wallet_2 = new Wallet();
        Transaction trx = new Transaction("hash_1", "0", wallet_1.getAddress(), wallet_2.getAddress(), 20.0, "a flying pig!");
        assertEquals("Hash = hash_1" +
                "Previous Hash = 0" +
                "Sender Public Key = '%%%%%%%'" +
                "Recipient Public Key = '%%%%%%%'" +
                "Pigcoins = 20.0" +
                "Message = a flying pig!",  System.out.println(trx.toString()));
    }

    /**@test**/
    public void testHist5() {
        Wallet wallet_1 = new Wallet();
        Wallet wallet_2 = new Wallet();
        wallet_1.generateKeyPair();
        wallet_2.generateKeyPair();

        BlockChain bChain = new BlockChain();
        Transaction trx = new Transaction("hash_3", "hash_1", wallet_1.getAddress(), wallet_2.getAddress(), 20.0, "a flying pig!");
        bChain.addOrigin(trx);
        bChain.summarize();
        assertEquals("Hash = hash_3" +
                "Previous Hash = hash_1" +
                "Sender Public Key = '%%%%%%%'" +
                "Recipient Public Key = '%%%%%%%'" +
                "Pigcoins = 20.0" +
                "Message = a flying pig!",  System.out.println(trx.toString()));
    }




    public void testApp() {
        assertTrue( true );
    }
}
