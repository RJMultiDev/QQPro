package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

public interface IKernelGroupService {
    void reqToJoinGroup(ReqToGroup reqToGroup, IOperateCallback iOperateCallback);
    void setMemberShutUp(long j, ArrayList<GroupMemberShutUpInfo> arrayList, IOperateCallback iOperateCallback);

}
