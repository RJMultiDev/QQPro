package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

public interface IKernelRichMediaService {
    void batchGetGroupFileCount(ArrayList<Long> arrayList, IBatchGroupFileCountCallback iBatchGroupFileCountCallback);

    void cancelSearcheGroupFile(int i, int i2, String str);

    //void cancelTransferTask(Contact contact, ArrayList<Long> arrayList, ArrayList<Integer> arrayList2, IOperateTransferInfoCallback iOperateTransferInfoCallback);

    void cancelUrlDownload(ArrayList<Long> arrayList);

    void createGroupFolder(long j, String str, IGroupItemCallback iGroupItemCallback);

    //void deleteGroupFile(long j, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, IDeleteGroupFileCallback iDeleteGroupFileCallback);

    //void deleteGroupFolder(long j, String str, IGroupFileCommonResultCallback iGroupFileCommonResultCallback);

    //void deleteTransferInfo(Contact contact, ArrayList<Long> arrayList, IOperateTransferInfoCallback iOperateTransferInfoCallback);

    void downloadFile(CommonFileInfo commonFileInfo, int i, int i2, String str);

    //void downloadFileByUrlList(UrlFileDownloadType urlFileDownloadType, ArrayList<String> arrayList, IOperateReturnU64ListCallback iOperateReturnU64ListCallback);

    void downloadFileForFileInfo(ArrayList<CommonFileInfo> arrayList, String str);

    void downloadFileForFileUuid(Contact contact, String str, ArrayList<DownloadGroupFileParams> arrayList);

    //void downloadFileForModelId(Contact contact, ArrayList<Long> arrayList, String str, IDownloadFileCallback iDownloadFileCallback);

    void downloadGroupFolder(long j, String str, String str2, IOperateCallback iOperateCallback);

    //void downloadRichMediaInVisit(RichDownLoadReq richDownLoadReq);

    void getGroupFileInfo(long j, String str, IGroupFileInfoCallback iGroupFileInfoCallback);

    int getGroupFileList(long j, GroupFileListForm groupFileListForm);

    void getGroupSpace(long j, IGroupSpaceCallback iGroupSpaceCallback);

    int getGroupTransferList(long j, GroupFileListForm groupFileListForm);

    //RMCodecInfo getRichMediaCodecInfo(RMBizTypeEnum rMBizTypeEnum);

    String getRichMediaFileDir(int i, int i2, boolean z);

    //void getScreenOCR(String str, IWindowsOcrCallback iWindowsOcrCallback);

    //void getVideoPlayUrl(Contact contact, long j, long j2, VideoCodecFormatType videoCodecFormatType, VideoRequestWay videoRequestWay, IVideoPlayUrlCallback iVideoPlayUrlCallback);

    //void getVideoPlayUrlInVisit(RichDownLoadReq richDownLoadReq, IVideoPlayUrlCallback iVideoPlayUrlCallback);

    //void getVideoPlayUrlV2(Contact contact, long j, long j2, VideoCodecFormatType videoCodecFormatType, RMReqExParams rMReqExParams, IVideoPlayUrlCallback iVideoPlayUrlCallback);

    //void moveGroupFile(long j, ArrayList<Integer> arrayList, ArrayList<String> arrayList2, String str, String str2, IMoveGroupFileCallback iMoveGroupFileCallback);

    void onlyDownloadFile(Contact contact, String str, ArrayList<DownloadGroupFileParams> arrayList);

    //void onlyUploadFile(Contact contact, ArrayList<UploadGroupFileParams> arrayList);

    //PicDownParams queryPicDownloadSize(PicReqParams picReqParams);

    void renameGroupFile(long j, int i, String str, String str2, String str3, IRenameGroupFileCallback iRenameGroupFileCallback);

    void renameGroupFolder(long j, String str, String str2, IGroupItemCallback iGroupItemCallback);

    int searchGroupFile(ArrayList<String> arrayList, SearchGroupFileParams searchGroupFileParams, IOperateCallback iOperateCallback);

    void searchGroupFileByWord(ArrayList<Long> arrayList, ArrayList<Long> arrayList2, String str, String str2, int i, ISearchGroupFileCallback iSearchGroupFileCallback);

    void searchMoreGroupFile(int i);

    //void transGroupFile(long j, String str, ITransGroupFileCallback iTransGroupFileCallback);

    //void translateEnWordToZn(ArrayList<String> arrayList, ITranslateWordsCallback iTranslateWordsCallback);

    //void updateOnlineVideoElemStatus(UploadStatusParams uploadStatusParams);

    //void uploadRMFileWithoutMsg(UploadFileWithoutMsgParams uploadFileWithoutMsgParams);

}
