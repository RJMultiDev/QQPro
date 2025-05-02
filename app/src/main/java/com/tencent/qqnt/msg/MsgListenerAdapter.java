package com.tencent.qqnt.msg;

import com.tencent.qqnt.kernel.nativeinterface.Contact;
import com.tencent.qqnt.kernel.nativeinterface.GroupFileListResult;
import com.tencent.qqnt.kernel.nativeinterface.IKernelMsgListener;

import java.util.ArrayList;

public class MsgListenerAdapter implements IKernelMsgListener {
    @Override
    public void onGroupFileInfoUpdate(GroupFileListResult groupFileListResult) {

    }

    @Override
    public void onMsgRecall(int i, String str, long j) {

    }

    @Override
    public void onMsgDelete(Contact contact, ArrayList<Long> arrayList) {

    }
}
