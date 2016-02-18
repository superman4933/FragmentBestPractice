package com.superman.fragmentbestpractice;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
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
    public void onAttach(Context context){
super.onAttach(context);
        newsList=getNews();
        adapter=new NewsAdapter(context,R.layout.news_item,newsList);

    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view =inflater.inflate(R.layout.news_title_frag,container,false);
        newsTitleListView=(ListView)view.findViewById(R.id.news_title_list_view);
        newsTitleListView.setAdapter(adapter);
        newsTitleListView.setOnItemClickListener(this);
        return view;
    }
@Override
    public void onActivityCreated(Bundle savedInstanceState){
    super.onActivityCreated(savedInstanceState);
    if(getActivity().findViewById(R.id.news_content_layout)!=null){
        isTwoPane=true;
    }else{
        isTwoPane=false;
    }
}
    @Override
    public void onItemClick(AdapterView<?>parent,View view,int position,long id){
        News news=newsList.get(position);
        if (isTwoPane){
            NewsContentFragment newsContentFragment=(NewsContentFragment)getFragmentManager().
                    findFragmentById(R.id.news_content_fragment);
            newsContentFragment.refresh(news.getTitle(),news.getContent());
        }else {NewsContentActivity.actionStart(getActivity(),news.getTitle(),news.getContent());
        }

    }
    private List<News> getNews(){
        List<News> newsList=new ArrayList<News>();
        News news1=new News();
        news1.setTitle("标题哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈1");
        news1.setContent("内容，哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈" +
                "的点点滴滴" +
                "dddddd 的");
        newsList.add(news1);
        News news2=new News();
        news2.setTitle("标题2");
        news2.setContent("内容2 顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶d" +
                "弟弟顶顶顶顶顶" +
                "的点点滴滴" );
        newsList.add(news2);
        return newsList;
    }
}
