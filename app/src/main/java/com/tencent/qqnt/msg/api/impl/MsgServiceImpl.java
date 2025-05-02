package com.tencent.qqnt.msg.api.impl;

import com.tencent.qqnt.kernel.nativeinterface.IFetchChannelLatestSeqCallback;
import com.tencent.qqnt.kernel.nativeinterface.IGetMsgSeqCallback;
import com.tencent.qqnt.kernel.nativeinterface.IMsgOperateCallback;
import com.tencent.qqnt.kernel.nativeinterface.Contact;
import com.tencent.qqnt.kernel.nativeinterface.IOperateCallback;
import com.tencent.qqnt.msg.api.IMsgService;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class MsgServiceImpl implements IMsgService {
    public void getSingleMsg(Contact contact, long j, IMsgOperateCallback callback) {
    }

    public void getFirstUnreadMsgSeq(Contact contact, IGetMsgSeqCallback callback) {
    }

    public void getFirstUnreadAtallMsg(@Nullable Contact peer, @Nullable IFetchChannelLatestSeqCallback cb) {
    }

    public void getFirstUnreadAtmeMsg(@Nullable Contact peer, @Nullable IFetchChannelLatestSeqCallback cb) {
    }

    public void getFirstUnreadCommonMsg(@Nullable Contact peer, @Nullable IFetchChannelLatestSeqCallback cb) {
    }

    public void deleteMsg(@NotNull Contact peer, @Nullable ArrayList<Long> msgId, @Nullable IOperateCallback listener) {
    }

    public void deleteRecallMsg(@Nullable Contact peer, long msgId, @Nullable IOperateCallback cb) {
    }

    public void deleteRecallMsgForLocal(@Nullable Contact peer, long msgId, @Nullable IOperateCallback cb) {
    }
}
