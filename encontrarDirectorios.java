package com.wjm.parcial;

import java.io.File;

public class encontrarDirectorios {
	public static void main(String[] args) {
        String path = "C:\\Users\\Public";
        File dir = new File(path);
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles((file) -> file.isDirectory() || file.getName().endsWith(".java"));
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directorio si existe: " + file.getAbsolutePath());
                } else {
                System.out.println("Archivo Java: " + file.getAbsolutePath());
                }
            }
        } else {
            System.out.println("Error: Directorio no existe");
        }
    }
}
