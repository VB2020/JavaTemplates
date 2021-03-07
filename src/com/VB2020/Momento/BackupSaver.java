package com.VB2020.Momento;

import java.util.Date;

public class BackupSaver {

    // неизменяемость
    private final String backupVersion;
    private final Date backupDate;


    public BackupSaver(String backupVersion) {
        this.backupVersion = backupVersion;
        this.backupDate = new Date();
    }

    public String getBackupVersion() {
        return backupVersion;
    }

    public Date getBackupDate() {
        return backupDate;
    }
}
