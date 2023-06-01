package ru.mirea.astaevka.yandexmaps;

import android.app.Application;
import android.os.Bundle;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String MAPKIT_API_KEY = "d9a3b608-fcee-4ce3-800a-4e77a0485e67";
    @Override
    public void onCreate() {
        super.onCreate();
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
