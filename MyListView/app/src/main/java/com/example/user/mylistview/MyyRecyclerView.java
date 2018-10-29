 package com.example.user.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

 public class MyyRecyclerView extends AppCompatActivity {
    RecyclerView rvCategory;
    private ArrayList<Pemain> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myy_recycler_view);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(PemainData.getListData());
        showRecyclerList();
    }

     private void showRecyclerList(){
         rvCategory.setLayoutManager(new LinearLayoutManager(this));
         ListPemainAdapter listPemainAdapter = new ListPemainAdapter(this);
         listPemainAdapter.setListPemain(list);
         rvCategory.setAdapter(listPemainAdapter);
     }
}
