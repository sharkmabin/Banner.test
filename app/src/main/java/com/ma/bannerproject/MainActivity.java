package com.ma.bannerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MyBannerView vp_banner;

    ArrayList<String> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageList = new ArrayList<>();
        imageList.add("http://dynamic-image.yesky.com/220x165/uploadImages/2016/338/16/Z8DL07254RZR.JPG");
        imageList.add("http://dynamic-image.yesky.com/220x165/uploadImages/2016/338/16/Z8DL07254RZR.JPG");
        imageList.add("http://dynamic-image.yesky.com/220x165/uploadImages/2016/338/16/Z8DL07254RZR.JPG");
        imageList.add("http://dynamic-image.yesky.com/220x165/uploadImages/2016/338/16/Z8DL07254RZR.JPG");
        imageList.add("http://dynamic-image.yesky.com/220x165/uploadImages/2016/338/16/Z8DL07254RZR.JPG");
        imageList.add("http://dynamic-image.yesky.com/220x165/uploadImages/2016/338/16/Z8DL07254RZR.JPG");
        imageList.add("http://dynamic-image.yesky.com/220x165/uploadImages/2016/338/16/Z8DL07254RZR.JPG");


        vp_banner = (MyBannerView) findViewById(R.id.vp_banner);
        vp_banner.initShowImageForNet(this, imageList);
    }

    @Override
    public void onResume() {
        super.onResume();
        //开始轮播
        vp_banner.startBanner();
    }

    @Override
    public void onPause() {
        super.onPause();
        //停止轮播
        vp_banner.endBanner();
    }
}
