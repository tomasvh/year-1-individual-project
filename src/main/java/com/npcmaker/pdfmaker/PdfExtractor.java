package com.npcmaker.pdfmaker;

import java.io.*;

public class PdfExtractor {
    public PdfExtractor(){}

    public void fileTransfer (File file, String fileName) {
        if (!file.exists()){
            try {
                try (
                        InputStream in = PdfExtractor.class.getResourceAsStream("/pdfTemplate/" + fileName);
                        OutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {

                    byte[] buffer = new byte[1024];
                    int lengthRead;
                    while ((lengthRead = in.read(buffer)) > 0) {
                        out.write(buffer, 0, lengthRead);
                        out.flush();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void extractPDF() {

        String d = System.getProperty("user.home");
        String dbDir = d + File.separator + "NPCmaker" + File.separator;
        File parentDirectory = new File(dbDir);
        if (!parentDirectory.exists()){
            parentDirectory.mkdir();
        }
        String fileName1 = "fullstandigpdfv1.pdf";
        String fileName2 = "mediumpdfv1.pdf";
        String fileName3 = "kompaktpdfv1.pdf";
        String filePath1 = dbDir  + fileName1;
        String filePath2 = dbDir  + fileName2;
        String filePath3 = dbDir  + fileName3;
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);
        File file3 = new File(filePath3);

        fileTransfer(file1, fileName1);
        fileTransfer(file2, fileName2);
        fileTransfer(file3, fileName3);


    }
}
