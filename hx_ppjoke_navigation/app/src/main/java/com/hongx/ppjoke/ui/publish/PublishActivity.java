package com.hongx.ppjoke.ui.publish;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hongx.lib_nav_annotation.ActivityDestination;
import com.hongx.ppjoke.R;

/**
 * @author: fuchenming
 * @create: 2019-12-24 15:10
 */
@ActivityDestination(pageUrl = "main/tabs/publish", needLogin = true)
public class PublishActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_publish);

    }
}
