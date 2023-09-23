package com.example.i_am_rich_app_android_java;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /// メインのイメージビュー
    ImageView imageView;

    /// View全体
    View rootView;

    /// アクションバー(Androidではアクションバーと言う)
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// UIのセットアップ
        setupUI();
    }

    /// 画像の設置
    private void setImage() {

        /// imageViewの割り当て
        imageView = findViewById(R.id.imageView);

        /// 画像の設定
        imageView.setImageResource(R.drawable.diamond);
    }

    /// NavigationBar(アクションバー)の構築
    private void configureNavigationBar() {
        if (actionBar != null) {
            /// ActionBarにカスタムビューを表示するオプションを設定
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

            /// カスタムActionBarのレイアウトをセット
            actionBar.setCustomView(R.layout.custom_actionbar);

            /// ActionBarの背景色をダークグレイに設定
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF263238")));
        }
    }

    /// UIのセットアップ
    private void setupUI() {
        /// アクションバー オブジェクト
        actionBar = getSupportActionBar();

        /// ルートビュー
        rootView = getWindow().getDecorView().getRootView();
        rootView.setBackgroundColor(0xFFCFD8DC);

        /// 画像の設定
        setImage();

        /// ナビゲーションバーの設定
        configureNavigationBar();
    }
}