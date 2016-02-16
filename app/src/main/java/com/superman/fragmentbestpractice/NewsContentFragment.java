package com.superman.fragmentbestpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/2/15.
 */
public class NewsContentFragment extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        view =inflater.inflate(R.layout.news_content_frag,container,false);
        return view;
    }
//    刷新方法~
    public void refresh(String newsTitle,String newsContent){
        View visibilityLayout=view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsContentText=(TextView) view.findViewById(R.id.news_content);
        TextView newsTitleText=(TextView)view.findViewById(R.id.news_title);
        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);
    }
}
