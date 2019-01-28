package com.kunfei.bookshelf.utils;

import android.content.Context;

import com.kunfei.bookshelf.help.DocumentHelper;

import java.io.File;

import androidx.documentfile.provider.DocumentFile;

public class BackUpUtils {

    public static void copyDefaultFile(Context context) {
        copyBook899(context);
        copyBook14(context);
        copyBook54(context);
        copyBook768(context);
        copyBookN(context);
    }

    private static void copyBook899(Context context) {
        try {

            String fileName = "book_899.txt";
            String backJsonStr = FileUtil.getSdCardPath() + "/YueDu/backup/" + fileName;
            File jsonFile = new File(backJsonStr);
            if(jsonFile.exists()) {
                return;
            }
            DocumentHelper.createDirIfNotExist(FileUtil.getSdCardPath(), "YueDu");
            String dirPath = FileUtil.getSdCardPath() + "/YueDu";
            DocumentHelper.createDirIfNotExist(dirPath, "backup");
            String backDirPath = FileUtil.getSdCardPath() + "/YueDu/backup";
            DocumentFile docFile = DocumentHelper.createFileIfNotExist(fileName, backDirPath);
            DocumentHelper.writeFromInputStream(context.getAssets().open(fileName),docFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void copyBook14(Context context) {
        try {

            String fileName = "book_14.txt";
            String backJsonStr = FileUtil.getSdCardPath() + "/YueDu/backup/" + fileName;
            File jsonFile = new File(backJsonStr);
            if(jsonFile.exists()) {
                return;
            }
            DocumentHelper.createDirIfNotExist(FileUtil.getSdCardPath(), "YueDu");
            String dirPath = FileUtil.getSdCardPath() + "/YueDu";
            DocumentHelper.createDirIfNotExist(dirPath, "backup");
            String backDirPath = FileUtil.getSdCardPath() + "/YueDu/backup";
            DocumentFile docFile = DocumentHelper.createFileIfNotExist(fileName, backDirPath);
            DocumentHelper.writeFromInputStream(context.getAssets().open(fileName),docFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void copyBook54(Context context) {
        try {

            String fileName = "book_54.xml";
            String backJsonStr = FileUtil.getSdCardPath() + "/YueDu/backup/" + fileName;
            File jsonFile = new File(backJsonStr);
            if(jsonFile.exists()) {
                return;
            }
            DocumentHelper.createDirIfNotExist(FileUtil.getSdCardPath(), "YueDu");
            String dirPath = FileUtil.getSdCardPath() + "/YueDu";
            DocumentHelper.createDirIfNotExist(dirPath, "backup");
            String backDirPath = FileUtil.getSdCardPath() + "/YueDu/backup";
            DocumentFile docFile = DocumentHelper.createFileIfNotExist(fileName, backDirPath);
            DocumentHelper.writeFromInputStream(context.getAssets().open(fileName),docFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void copyBook768(Context context) {
        try {

            String fileName = "book_768.txt";
            String backJsonStr = FileUtil.getSdCardPath() + "/YueDu/backup/" + fileName;
            File jsonFile = new File(backJsonStr);
            if(jsonFile.exists()) {
                return;
            }
            DocumentHelper.createDirIfNotExist(FileUtil.getSdCardPath(), "YueDu");
            String dirPath = FileUtil.getSdCardPath() + "/YueDu";
            DocumentHelper.createDirIfNotExist(dirPath, "backup");
            String backDirPath = FileUtil.getSdCardPath() + "/YueDu/backup";
            DocumentFile docFile = DocumentHelper.createFileIfNotExist(fileName, backDirPath);
            DocumentHelper.writeFromInputStream(context.getAssets().open(fileName),docFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void copyBookN(Context context) {
        try {

            String fileName = "book_n.txt";
            String backJsonStr = FileUtil.getSdCardPath() + "/YueDu/backup/" + fileName;
            File jsonFile = new File(backJsonStr);
            if(jsonFile.exists()) {
                return;
            }
            DocumentHelper.createDirIfNotExist(FileUtil.getSdCardPath(), "YueDu");
            String dirPath = FileUtil.getSdCardPath() + "/YueDu";
            DocumentHelper.createDirIfNotExist(dirPath, "backup");
            String backDirPath = FileUtil.getSdCardPath() + "/YueDu/backup";
            DocumentFile docFile = DocumentHelper.createFileIfNotExist(fileName, backDirPath);
            DocumentHelper.writeFromInputStream(context.getAssets().open(fileName),docFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
