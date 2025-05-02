package com.tencent.qqnt.kernel.api;

import com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession;

import org.jetbrains.annotations.Nullable;

public interface IKernelService {
    @Nullable
    IQQNTWrapperSession getWrapperSession();
}
