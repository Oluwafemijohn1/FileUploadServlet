package org.example.fileupload;

import java.io.*;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet(name = "helloServlet", value = "/upload")
public class UploadFileServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, RuntimeException, ServletException {
        ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
        List<FileItem> multiFile;
        try {
            multiFile = sf.parseRequest((RequestContext) request);
            for (FileItem item : multiFile) {
                item.write(new File("/Users/abiodunonitiju/Desktop/Projects/FileUpload" + item.getName()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("File Uploaded");

        /* Receive file uploaded to the Servlet from the HTML5 form */
//        Part filePart = request.getPart("file");
//        String fileName = filePart.getSubmittedFileName();
//        for (Part part : request.getParts()) {
//            part.write("/Users/abiodunonitiju/Desktop/Projects/FileUpload" + fileName);
//        }
//        response.getWriter().print("The file uploaded sucessfully.");
    }
}
