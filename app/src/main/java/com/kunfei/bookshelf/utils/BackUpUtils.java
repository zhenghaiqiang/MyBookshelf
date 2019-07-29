package com.kunfei.bookshelf.utils;

import android.content.Context;

import com.kunfei.bookshelf.help.DocumentHelper;

import java.io.File;

import androidx.documentfile.provider.DocumentFile;

public class BackUpUtils {

    public static void copyDefaultFile(Context context) {
        copyBook1(context);
        copyBook2(context);
    }

    private static void copyBook1(Context context) {
        try {

            String fileName = "book1.json";
            String backJsonStr = FileUtil.getSdCardPath() + "/YueDu/backup/" + fileName;
            File jsonFile = new File(backJsonStr);
            if (jsonFile.exists()) {
                return;
            }
            DocumentHelper.createDirIfNotExist(FileUtil.getSdCardPath(), "YueDu");
            String dirPath = FileUtil.getSdCardPath() + "/YueDu";
            DocumentHelper.createDirIfNotExist(dirPath, "backup");
            String backDirPath = FileUtil.getSdCardPath() + "/YueDu/backup";
            DocumentFile docFile = DocumentHelper.createFileIfNotExist(fileName, backDirPath);
            DocumentHelper.writeFromInputStream(context.getAssets().open(fileName), docFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void copyBook2(Context context) {
        try {

            String fileName = "book2.json";
            String backJsonStr = FileUtil.getSdCardPath() + "/YueDu/backup/" + fileName;
            File jsonFile = new File(backJsonStr);
            if (jsonFile.exists()) {
                return;
            }
            DocumentHelper.createDirIfNotExist(FileUtil.getSdCardPath(), "YueDu");
            String dirPath = FileUtil.getSdCardPath() + "/YueDu";
            DocumentHelper.createDirIfNotExist(dirPath, "backup");
            String backDirPath = FileUtil.getSdCardPath() + "/YueDu/backup";
            DocumentFile docFile = DocumentHelper.createFileIfNotExist(fileName, backDirPath);
            DocumentHelper.writeFromInputStream(context.getAssets().open(fileName), docFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
