package com.zhangci.system.controller;

import com.zhangci.commons.entity.CodeMsg;
import com.zhangci.commons.entity.Result;
import com.zhangci.commons.exception.SelfException;
import com.zhangci.commons.utils.FileUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * ClassName: FileController
 * Author: ZhangCi
 *
 * @description:
 * @date: 2021/6/17 21:47
 * @version: 0.1
 * @since: 1.8
 */
@RestController
@RequestMapping("fi")
public class FileController {


    @PostMapping("upload")
    public Result doUploadFile(MultipartFile file) {
        Result result = null;
        try {
            result = FileUtil.doUploadFile(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new SelfException(CodeMsg.UPLOAD_FAILED);
        }
        return result;
    }

    @GetMapping("down")
    public ResponseEntity doDownload(String path) throws IOException {
        return FileUtil.doDownload(path);
    }

}
