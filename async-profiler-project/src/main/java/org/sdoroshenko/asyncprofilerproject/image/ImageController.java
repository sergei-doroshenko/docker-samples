package org.sdoroshenko.asyncprofilerproject.image;

import com.google.common.io.ByteStreams;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class ImageController {

    @GetMapping(value = "/images/{id}")
    public byte[] getImage(@PathVariable("id") String id) throws IOException {
        String fileName = "img" + File.separator + id + ".png";
        File file = ResourceUtils.getFile("classpath*:" + fileName);
        InputStream in = new FileInputStream(file);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteStreams.copy(in, out);
        return out.toByteArray();
    }

}
