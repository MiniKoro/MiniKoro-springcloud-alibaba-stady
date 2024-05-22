package cn.visaka.id.service;





import cn.visaka.id.model.LeafAlloc;

import java.util.List;

public interface IDAllocService {
     List<LeafAlloc> getAllLeafAllocs();
     LeafAlloc updateMaxIdAndGetLeafAlloc(String tag);
     LeafAlloc updateMaxIdByCustomStepAndGetLeafAlloc(LeafAlloc leafAlloc);
     List<String> getAllTags();
}
