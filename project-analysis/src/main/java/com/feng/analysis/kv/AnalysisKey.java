package com.feng.analysis.kv;

import com.feng.common.utils.NumberUtils;
import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AnalysisKey implements WritableComparable<AnalysisKey> {

    private AnalysisKey() {
    }

    private String userId;
    private String keyword;
    private int rank;
    private String url;
    private int order;

    public AnalysisKey(String userId, String keyword, int rank, String url, int order) {
        this.userId = userId;
        this.keyword = keyword;
        this.rank = rank;
        this.url = url;
        this.order = order;
    }

    public int compareTo(AnalysisKey key) {
        int result = userId.compareTo(key.getUserId());
        if (0 == result) {
            if (order > key.getOrder()) {
                result = 1;
            } else if (order == key.getOrder()){
                result = 0;
            } else {
                result = -1;
            }
        }
        return result;
    }

    public void write(DataOutput out) throws IOException {
        out.writeUTF(userId);
        out.writeUTF(keyword);
        out.writeUTF(String.valueOf(rank));
        out.writeUTF(String.valueOf(order));
        out.writeUTF(url);


    }

    public void readFields(DataInput in) throws IOException {
        userId = in.readUTF();
        keyword = in.readUTF();
        rank = Integer.parseInt(in.readUTF());
        order = Integer.parseInt(in.readUTF());
        url = in.readUTF();
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
