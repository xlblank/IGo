package com.ggyd.cmcc.igo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.ggyd.cmcc.igo.bean.Person;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.i("igo", "onCreate...");

        listView = (ListView) this.findViewById(R.id.my_list_view);

        //this.findViewById(R.layout.list_item);

        //listView.addView(item);//必须采用适配器模式来填充数据

        listView.setAdapter(new MyAdapterView());

    }

    private class MyAdapterView extends BaseAdapter {

        private ArrayList<Person> personList = new ArrayList<Person>();

        public MyAdapterView() {
            for (int i = 0; i < 20; i++) {
                personList.add(new Person("布莱克", "188XXXXYYYY", 18));
            }
        }

        @Override
        public int getCount() {
            return personList.size();
        }

        @Override
        public Object getItem(int position) {
            return personList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            View item = View.inflate(MainActivity.this, R.layout.list_item, null);

            Person person = (Person) getItem(position);
            TextView my_title = (TextView) item.findViewById(R.id.my_title);
            my_title.setText(person.getTitle());

            TextView my_msisdn = (TextView) item.findViewById(R.id.my_msisdn);
            my_msisdn.setText(person.getMsisdn());

            TextView my_content = (TextView) item.findViewById(R.id.my_content);
            my_content.setText(person.getSum() + "");

            return item;
        }
    }


}
