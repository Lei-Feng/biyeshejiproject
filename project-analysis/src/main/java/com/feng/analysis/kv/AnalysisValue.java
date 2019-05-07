package com.feng.analysis.kv;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AnalysisValue implements Writable {

    public AnalysisValue() {
    }

    private int pv;
    private int uv;
    private int rank;
    private int sumOrder;


    public void write(DataOutput out) throws IOException {
        out.writeUTF(pv + "");
        out.writeUTF(uv + "");
        out.writeUTF(rank + "");
        out.writeUTF(sumOrder + "");
    }

    public void readFields(DataInput in) throws IOException {
        pv = in.readInt();
        uv = in.readInt();
        rank = in.readInt();
        sumOrder = in.readInt();
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSumOrder() {
        return sumOrder;
    }

    public void setSumOrder(int sumOrder) {
        this.sumOrder = sumOrder;
    }
}
