package com.toolkit.web;

import com.toolkit.api.enums.ResponseMessageEnum;
import com.toolkit.api.vo.ToolkitResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * <p>文件管理控制器：包括文件的上传和下载</p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/16 16:05
 */
@Controller
@RequestMapping("/file")
public class FileManageController {
    private Logger logger = LoggerFactory.getLogger(FileManageController.class);

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody ToolkitResponseBody processFileUpload(@RequestPart("fileName") MultipartFile multipartFile) {
        if (multipartFile.isEmpty()) {
            logger.error("file data is empty");
            return new ToolkitResponseBody(ResponseMessageEnum.FILE_UPLOAD_EMPTY.getMessage());
        }
        try {
            String fileName = "E://toolkit_file//"+String.valueOf(new Date().getTime())+"_"+multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File(fileName));
        } catch (IOException e) {
            logger.info("upload file has exception:", e);
            e.printStackTrace();
        }
        return new ToolkitResponseBody("HELLO");
    }

}
