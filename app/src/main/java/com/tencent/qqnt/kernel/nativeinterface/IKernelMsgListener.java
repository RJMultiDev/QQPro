package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

public interface IKernelMsgListener {
    void onGroupFileInfoUpdate(GroupFileListResult groupFileListResult);
    void onMsgRecall(int i, String str, long j);
    void onMsgDelete(Contact contact, ArrayList<Long> arrayList);

}
