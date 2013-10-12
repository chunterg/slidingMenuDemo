package com.chunterg.slidingmenudemo;

import android.app.Activity;
import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;


public class MainActivity extends Activity {



    @Override
    public void onCreate(Bundle savedInstanceState) {

        //mListView = this.getListView();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // configure the SlidingMenu
        SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setShadowWidthRes(R.dimen.shadow_width);
        menu.setShadowDrawable(R.drawable.shadow);
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        menu.setFadeDegree(0.35f);
        menu.attachToActivity(this, SlidingMenu.LEFT);
        menu.setMenu(R.layout.menu);
    }


}
