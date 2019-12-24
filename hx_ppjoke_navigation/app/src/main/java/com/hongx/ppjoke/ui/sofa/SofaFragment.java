package com.hongx.ppjoke.ui.sofa;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.google.android.material.tabs.TabLayout;
import com.hongx.lib_nav_annotation.FragmentDestination;
import com.hongx.ppjoke.R;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@FragmentDestination(pageUrl = "main/tabs/sofa", asStarter = false)
public class SofaFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        textView.setText("沙发");
        return root;
    }


}