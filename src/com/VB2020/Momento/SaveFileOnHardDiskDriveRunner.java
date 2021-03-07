package com.VB2020.Momento;

public class SaveFileOnHardDiskDriveRunner {
    public static void main(String[] args) throws InterruptedException {
        Backup backup = new Backup();
        HardDiskDrive systemDrive = new HardDiskDrive();

        System.out.println("Creating new backup, version 1.0\n");
        backup.setBackupVersionAndbackupDate("version 1.0");

        System.out.println(backup);

        System.out.println("Saving this backup version to HDD...\n");
        systemDrive.setBackupSaver(backup.saveBackup());

        System.out.println("Updating to version 1.1\n");
        System.out.println("Some changes...\n");
        backup.setBackupVersionAndbackupDate("version 1.1");

        System.out.println(backup);

        System.out.println("We have some errors...\n");
        Thread.sleep(3000);
        System.out.println("Rolling to another backup version 1.0\n");
        backup.loadByBackup(systemDrive.getBackupSaver());

        System.out.println("File after rollback: ");
        System.out.println(backup);





    }
}
