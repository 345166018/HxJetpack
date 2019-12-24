package com.hongx.ppjoke.ui.find;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.hongx.lib_nav_annotation.FragmentDestination;
import com.hongx.ppjoke.R;
import com.hongx.ppjoke.ui.sofa.SofaFragment;

/**
 * @author: fuchenming
 * @create: 2019-12-24 15:12
 */
@FragmentDestination(pageUrl = "main/tabs/find")
public class FindFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        textView.setText("发现");
        return root;
    }

}
