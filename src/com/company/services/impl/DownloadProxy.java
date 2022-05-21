package com.company.services.impl;

import com.company.models.UserType;
import com.company.models.User;
import com.company.services.DownloadService;

public class DownloadProxy implements DownloadService {

    private DownloadManager downloadManager; //Atributo


    public DownloadProxy(DownloadManager documentManager) {
        this.downloadManager = documentManager;
    } //Constructor

    @Override //Sobreescribimos el método
    public void downloadSong(User user, String song) {

        if (user.getTipo().equals(UserType.PREMIUM)){ //Evaluamos si el tipo de usuario es igual a Premium
            this.downloadManager.downloadSong(user, song); //Condición para el true
        }else{
            System.out.println("El usuario "+ user.getId() + " no tiene permiso para descargar esta canción."); //Condición para el false
        }
    }
}
