package com.vcredit.practiceloadongview.testaddress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import bean.City;
import bean.County;
import bean.Province;
import bean.Street;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private OnAddressSelectedListener listener;
    private BottomDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(this);
//        AddressSelector selector = new AddressSelector(this);
        listener = new OnAddressSelectedListener() {
            @Override
            public void onAddressSelected(Province province, City city, County county, Street street) {

            }
        };
//        selector.setOnAddressSelectedListener(listener);

//        View view = selector.getView();
// frameLayout.addView(view)
// new AlertDialog.Builder(context).setView(view).show()
// ...

    }

    @Override
    public void onClick(View v) {
        List<Province> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Province p = new Province();
            p.id =i;
            p.name=i+"shanghai";
            list.add(p);
        }

        dialog = new BottomDialog(this, list);
        dialog.setOnAddressSelectedListener(listener);
        dialog.show();
    }
}
