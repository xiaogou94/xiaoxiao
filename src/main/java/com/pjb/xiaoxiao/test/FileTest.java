package com.pjb.xiaoxiao.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @program: xiaoxiao
 * @description: 上传文件
 * @author: xiao gou
 * @create: 2022-02-13 09:19
 */
public class FileTest {
  public static void main(String[] args) {
    //
  }

  @RequestMapping("/upload")
  @ResponseBody
  public static String handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
    if (file.isEmpty()) {
        return "上传的文件为空";
    }
    //获取文件名
      String fileName = file.getOriginalFilename();
    System.out.println("上传的文件名:" + fileName);
    // 获取文件的后缀名
      String suffixName = fileName.substring(fileName.lastIndexOf("."));
    System.out.println("上传的后缀名为:" + suffixName);
    // 文件上传后的路径
      String filePath = "D://";
      File dest = new File(filePath + fileName);
    // 监测该目录是否还存在
    if (!dest.getParentFile().exists()) {
        dest.getParentFile().mkdirs();
    }
    file.transferTo(dest);
    return "上传成功";
  }
}
