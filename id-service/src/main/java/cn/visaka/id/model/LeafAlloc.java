package cn.visaka.id.model;

import lombok.Data;

@Data
public class LeafAlloc {
    private String key;
    private long maxId;
    private int step;
    private String updateTime;
}
