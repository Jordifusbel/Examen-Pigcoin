package org.mvpigs;

import java.util.ArrayList;

public class BlockChain {
    public ArrayList<Transaction> history;

    public BlockChain(){

    }

    public ArrayList<Transaction> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Transaction> history) {
        this.history = history;
    }

    public void addOrigin(Transaction newBillet){
        history.add(newBillet);
    }

    public void summarize(){
        for(int pos = 0; pos < getHistory().lastIndexOf(); pos++)
            System.out.println(this.history(pos).Transaction.toString());
    }
}
