package com.VB2020.Command;

public class FileFolderRunner {
    public static void main(String[] args) {

        FileFolder fileFolder = new FileFolder();

        User user = new User(
                new AddFileCommand(fileFolder),
                new OpenFileCommand(fileFolder),
                new CloseFileCommand(fileFolder),
                new DeleteFileCommand(fileFolder));

        user.addFile();
        user.openFile();
        user.closeFile();
        user.deleteFile();

    }
}
