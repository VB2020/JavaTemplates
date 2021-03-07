package com.VB2020.Momento;

import java.util.Date;

// допустим у файла есть бэкапы!

public class Backup
{
    private String backupVersion;
    private Date backupDate;

    public void setBackupVersionAndbackupDate (String version)
    {
        this.backupVersion = version;
        this.backupDate = new Date();
    }

    public BackupSaver saveBackup()
    {
        return new BackupSaver(backupVersion);
    }

    public void loadByBackup(BackupSaver backupSaver)
    {
        backupVersion = backupSaver.getBackupVersion();
        backupDate = backupSaver.getBackupDate();
    }
    @Override
    public String toString() {
        return "Backup{" +
                "backupVersion='" + backupVersion + '\'' +
                ", backupDate=" + backupDate +
                '}';
    }
}
