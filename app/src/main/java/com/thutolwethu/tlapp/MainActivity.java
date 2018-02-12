package com.thutolwethu.tlapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.folioreader.util.FolioReader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.folioreader.model.HighLight;
import com.folioreader.ui.base.OnSaveHighlight;
import com.folioreader.util.FolioReader;
import com.folioreader.util.OnHighlightListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private FolioReader bookReader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FolioReader bookReader = new FolioReader(this);


        bookReader.openBook("file:///android_asset/bitcoin.epub");
        bookReader.openBook(R.raw.bitcoin);

    }
}
