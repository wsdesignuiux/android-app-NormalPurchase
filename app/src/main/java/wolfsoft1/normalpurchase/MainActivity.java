package wolfsoft1.normalpurchase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ModelClass> homeListModelClassArrayList;
    private RecyclerView recyclerView;
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String iteamName[]={"Orange and Rosemerry","Cool Water-Rebel","Flat White"};
        String quantity[]={"1","1","1"};
        String price[]={"1.95","2.90","3.00"};
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        homeListModelClassArrayList = new ArrayList<>();

        for (int i = 0; i < iteamName.length; i++) {
            ModelClass beanClassForRecyclerView_contacts = new ModelClass(iteamName[i],quantity[i],price[i]);
            homeListModelClassArrayList.add(beanClassForRecyclerView_contacts);
        }
        mAdapter = new RecyclerAdapter(MainActivity.this,homeListModelClassArrayList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);


    }
}
