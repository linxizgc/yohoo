package com.yohoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by kaikentule on 2018/10/19.
 */

@Controller
@RequestMapping("/upload")
public class UploadController {



    @RequestMapping(value = "/singleUpload", method = RequestMethod.POST)
    @ResponseBody
    public String singleUpload(@RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
            out.write(file.getBytes());
            out.flush();
            out.close();
        }
        return "success";
    }
}
