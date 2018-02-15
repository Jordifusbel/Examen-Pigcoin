package org.mvpigs;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.security.KeyPair;

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

    public void testApp() {
        assertTrue( true );
    }
}
