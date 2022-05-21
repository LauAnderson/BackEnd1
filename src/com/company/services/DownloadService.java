package com.company.services;

import com.company.models.User;

public interface DownloadService {
    void downloadSong(User user, String song); //Método que vamos a sobreescribir
}
