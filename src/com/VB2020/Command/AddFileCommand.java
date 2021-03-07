package com.VB2020.Command;

public class AddFileCommand implements Command{
    FileFolder fileFolder;

    public AddFileCommand(FileFolder fileFolder) {
        this.fileFolder = fileFolder;
    }

    @Override
    public void execute() {
        fileFolder.addFile();
    }
}
