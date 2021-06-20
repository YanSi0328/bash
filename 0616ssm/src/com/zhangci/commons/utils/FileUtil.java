package com.zhangci.commons.utils;

import com.zhangci.commons.entity.Result;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: FileUtil
 * Author: ZhangCi
 *
 * @description: 工具类：文件的上传与下载
 * @date: 2021/6/17 21:26
 * @version: 0.1
 * @since: 1.8
 */
public class FileUtil {

    public static Result doUploadFile(MultipartFile file) throws IOException {
        // 0 获取文件相关信息
        byte[] bytes = file.getBytes();                     // 字节数据，适用于小文件
        InputStream fileStream = file.getInputStream();     // 输入流，适合大文件
        String fileName = file.getOriginalFilename();   // 获取文件名
        long size = file.getSize(); // 获取文件的大小

        // 1 获取当前项目地址
        String realPath = ServletUtil.getServletContext().getRealPath("/");
        // 2 指明文件路径
        String path = "/upload/" + fileName;
        // 3 文件输入流
        IOUtils.write(bytes, new FileOutputStream(new File(realPath, path)));
        // 4 封装返回前台的数据
        Map<String, Object> map = new HashMap<>(16);
        map.put("path", path);
        map.put("fileName", fileName);
        map.put("realName", fileName);
        map.put("uploadTime", System.currentTimeMillis());
        map.put("size", size);
        return Result.success(map);
    }

    /**
     * 文件下载
     *
     * @param path 文件的路径
     * @return 必须给返回响应体对象ResponseEntity
     * @throws IOException
     */
    public static ResponseEntity<byte[]> doDownload(String path) throws IOException {
        String realPath = ServletUtil.getServletContext().getRealPath("/");// 当前的项目地址
        // 读取文件
        File file = new File(realPath, path);
        String name = file.getName();
        byte[] bytes = FileUtils.readFileToByteArray(file);
        // 设置响应头，并指定编码格式(防止文件名的乱码)
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=" + URLEncoder.encode(name, "UTF-8"));

        // 返回
        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
    }

}
