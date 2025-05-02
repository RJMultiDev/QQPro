package com.tencent.qqnt.kernel.nativeinterface;

public interface IQQNTWrapperSession {
    IKernelTicketService getTicketService();
    IKernelRichMediaService getRichMediaService();
    IKernelGroupService getGroupService();
    IKernelMsgService getMsgService();

    IKernelSearchService getSearchService();
}
