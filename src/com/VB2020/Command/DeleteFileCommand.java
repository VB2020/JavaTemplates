package com.VB2020.Command;

public class DeleteFileCommand implements Command {
    FileFolder fileFolder;

    public DeleteFileCommand(FileFolder fileFolder) {
        this.fileFolder = fileFolder;
    }

    @Override
    public void execute() {
        fileFolder.deleteFile();
    }
}
