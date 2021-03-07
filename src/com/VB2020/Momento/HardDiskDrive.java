package com.VB2020.Momento;

public class HardDiskDrive {
    private String diskName;
    private BackupSaver backupSaver;

    public BackupSaver getBackupSaver() {
        return backupSaver;
    }

    public void setBackupSaver(BackupSaver backupSaver) {
        this.backupSaver = backupSaver;
    }
}
