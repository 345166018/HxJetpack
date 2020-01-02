package com.hongx.paging;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerView);
        adapter = new RecyclerAdapter();
        ConcertViewModel viewModel = ViewModelProviders.of(this).get(ConcertViewModel.class);

//        viewModel.getConvertList().observe(this, concerts -> adapter.submitList(concerts));
        viewModel.getConvertList().observe(this, new Observer<PagedList<Concert>>() {
            @Override
            public void onChanged(@Nullable PagedList<Concert> concerts) {
                adapter.submitList(concerts);
                Log.i("hongx", "数据更新了");
            }
        });

        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }
}