package com.superman.fragmentbestpractice;

import android.app.Activity;
import android.app.Fragment;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Administrator on 2016/2/16.
 */
public class NewsTitleFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView newsTitleListView;
    private List<News> newsList;
    private NewsAdapter adapter;
    private boolean isTwoPane;
    @Override
    public void onAttach(Activity activity){
super.onAttach(activity);
        newsList=getNews;
        adapter=new NewsAdapter(activity,R.layout.news_item,newsList);

    }
    @Override
    
}
