package com.hongx.paging;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.DataSource;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

/**
 * PagedList: 数据源获取的数据最终靠PagedList来承载。
 * 对于PagedList,我们可以这样来理解，它就是一页数据的集合。
 * 每请求一页，就是新的一个PagedList对象。
 */
public class ConcertViewModel extends ViewModel {

    private final LiveData<PagedList<Concert>> convertList;
    private DataSource<Integer, Concert> concertDataSource;

    public ConcertViewModel() {
        ConcertFactory concertFactory = new ConcertFactory();
        concertDataSource = concertFactory.create();
        convertList = new LivePagedListBuilder<>(concertFactory, 20).build();
    }

    public void invalidateDataSource() {
        concertDataSource.invalidate();
    }

    public LiveData<PagedList<Concert>> getConvertList() {
        return convertList;
    }
}
