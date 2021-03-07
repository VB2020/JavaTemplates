package com.VB2020.Command;

public class CloseFileCommand implements Command{
    FileFolder fileFolder;

    public CloseFileCommand(FileFolder fileFolder) {
        this.fileFolder = fileFolder;
    }

    @Override
    public void execute() {
        fileFolder.closeFile();
    }
}
