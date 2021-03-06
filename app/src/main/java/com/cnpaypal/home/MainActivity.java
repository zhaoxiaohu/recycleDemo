package com.cnpaypal.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cnpaypal.BlurEffect.BlurEffectMainActivity;
import com.cnpaypal.CrashCatchUtil.CrashHandler;
import com.cnpaypal.ObservableScrollView.ObservableScrollViewActivity;
import com.cnpaypal.ObservableScrollView.ParallaxToolbarScrollViewActivity;
import com.cnpaypal.ObservableScrollView.ScrollStickyActivity;
import com.cnpaypal.StickyNavLayout.StickyNavLayoutActivity;
import com.cnpaypal.activity.CustomExpiredActivity;
import com.cnpaypal.activity.VelocimeterActivity;
import com.cnpaypal.animation.AnimationMainActivity;
import com.cnpaypal.animation.LayoutChange;
import com.cnpaypal.async.ListViewMainActivity;
import com.cnpaypal.fragment.FragmentMainActivity;
import com.cnpaypal.loading.LeafLoadingActivity;
import com.cnpaypal.recyclerView.RecycleMultipleItemActivity;
import com.cnpaypal.recyclerView.RecyclerGridViewActivity;
import com.cnpaypal.recyclerView.RecyclerListViewActivity;
import com.cnpaypal.util.CommentUtil;

import cirmellntent.activity.CrimeActivity;
import cirmellntent.activity.CrimeListActivity;

/**
 * Created by Administrator on 2015/6/8.
 */
public class MainActivity extends Activity{
    private static final String TAG = "TestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_layout);

        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());

        initView();
    }


    /**
     * 保存旋转和activity销毁时候，需要保存的数据保存到bundle当中
     * @param savedInstanceState
     */
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
//        Log.d(TAG," onSaveInstanceState ");
//        savedInstanceState.putString();


    }

    private void initView(){
        TextView showListBtn = (TextView)findViewById(R.id.home_list_btn);
        showListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewMainActivity.class);
                startActivity(intent);
            }
        });

        TextView showFragmentBtn = (TextView)findViewById(R.id.home_fragment_btn);
        showFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FragmentMainActivity.class);
                startActivity(intent);
            }
        });


        TextView loadingBtn = (TextView)findViewById(R.id.home_fragment_loading);
        loadingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LeafLoadingActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.home_layout_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LayoutChange.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.home_animation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, AnimationMainActivity.class);
            }
        });

        findViewById(R.id.home_recyclerView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, RecyclerListViewActivity.class);
            }
        });

        findViewById(R.id.home_recyclerView_gridView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, RecyclerGridViewActivity.class);
            }
        });

        findViewById(R.id.home_recyclerView_multiple).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, RecycleMultipleItemActivity.class);
            }
        });

        findViewById(R.id.home_scrollView_sticky).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, ScrollStickyActivity.class);
            }
        });

        findViewById(R.id.home_scrollView_FlexibleSpaceWithImage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, ObservableScrollViewActivity.class);
            }
        });

        findViewById(R.id.ParallaxToolbarScrollViewActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, ParallaxToolbarScrollViewActivity.class);
            }
        });

        findViewById(R.id.BlurEffect_Activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, BlurEffectMainActivity.class);
            }
        });

        findViewById(R.id.expired_Activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, CustomExpiredActivity.class);
            }
        });

        findViewById(R.id.velocimeter_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, VelocimeterActivity.class);
            }
        });


        findViewById(R.id.obScrollview_viewpager_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, StickyNavLayoutActivity.class);
            }
        });

        //android 权威指南的学习案例
        findViewById(R.id.Android_study_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentUtil.startActivityTranslate(MainActivity.this, CrimeListActivity.class);

            }
        });


    }
}
