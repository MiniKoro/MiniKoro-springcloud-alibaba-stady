package cn.visaka.id.gen;

import cn.visaka.id.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
