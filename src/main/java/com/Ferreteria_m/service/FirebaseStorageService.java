
package com.Ferreteria_m.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    final String BucketName = "ferreteria-m-1efa9.appspot.com";
    final String rutaSuperiorStorage = "Ferreteria";
    final String rutaJsonFile = "firebase";
    final String archivoJsonFile = "ferreteria-m-1efa9-firebase-adminsdk-1ejwc-eb96ba2da7.json";
    
}
