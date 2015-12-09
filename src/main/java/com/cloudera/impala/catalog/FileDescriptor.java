package com.cloudera.impala.catalog;

import java.util.List;
import java.util.Map;

/**
 * 控制该类大小，缓存千万级文件，内存占用在1GB以内
 * @author dayutianfei
 *
 */
public class FileDescriptor {

    public String fileName_; // 文件名，逻辑名，副本文件共享该名字
    
    public String filePath_; // 文件访问路径，可以为一个URL地址
    
    public String fileType_; // TODO  {bloomfilter, lucene, unknown}
    
    public byte status_; // 文件状态 {0:in-use, 1:not-in-use, 2:replicating, 3:unknown}
    
    public long createTime_; // 文件创建时间{第一个副本文件产生时间}
    public long lastAccessTime_; // 文件更新时间{最近一个副本文件修改时间}
    
    // 文件副本信息（物理信息）
    public List<FileReplia> fileReplicas_;  // TODO 顺序怎么指定？
    
    public Map<String,String> params; //文件参数 { version:+1,  size:in bytes, record_number:128, ... }
}
