package com.VB2020.Command;

public class OpenFileCommand implements Command
{
    FileFolder fileFolder;

    public OpenFileCommand(FileFolder fileFolder) {
        this.fileFolder = fileFolder;
    }

    @Override
    public void execute() {
        fileFolder.openFile();
    }
}
