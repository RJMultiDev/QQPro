package com.tencent.qqnt.kernel.nativeinterface;

public interface IKernelSearchService {
    long addKernelSearchListener(IKernelSearchListener iKernelSearchListener);
    void searchGroup(SearchGroup searchGroup, IOperateCallback iOperateCallback);
}
