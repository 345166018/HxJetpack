package com.hongx.paging;


import androidx.annotation.NonNull;
import androidx.paging.PositionalDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * DataSource:顾名思义，数据源，获取数据是通过它实现的。
 * 官方文档上，实现的是ItemKeyedDataSource,而我这里实现的是PositionalDataSource
 */
public class ConcertDataSource extends PositionalDataSource<Concert> {

    /**
     * 加载初始化数据，可以这么来理解，加载的是第一页的数据。
     * 形象的说，当我们第一次打开页面，需要回调此方法来获取数据。
     */
    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull final LoadInitialCallback<Concert> callback) {
        callback.onResult(fetchItems(0, 20), 0, 10000);
    }

    /**
     * 当有了初始化数据之后，滑动的时候如果需要加载数据的话，会调用此方法。
     */
    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull final LoadRangeCallback<Concert> callback) {
        callback.onResult(fetchItems(params.startPosition, params.loadSize));
    }

    private List<Concert> fetchItems(int startPosition, int pageSize) {
        List<Concert> list = new ArrayList<>();
        for (int i = startPosition; i < startPosition + pageSize; i++) {
            Concert concert = new Concert();
            concert.setAuthor("author = " + i);
            concert.setContent("content = " + i);
            concert.setTitle("title = " + i);
            list.add(concert);
        }
        return list;
    }

}
