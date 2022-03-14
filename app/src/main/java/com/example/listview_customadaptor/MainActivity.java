package com.example.listview_customadaptor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ListView lvGoods;
        CustomGoodsAdapter adt;
        ArrayList<Goods> arrayList;
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            lvGoods = findViewById(R.id.lvGoods);
            arrayList = new ArrayList<>();
            arrayList.add(new Goods("Ca nấu lẩu, nấu mì mini...",
                    "Shop Devang",R.drawable.ca_nau_lau));
            arrayList.add(new Goods("1KG Khô gà bơ tỏi",
                    "Shop LTD Food",R.drawable.ga_bo_toi));
            arrayList.add(new Goods("Xe cần cẩu đa năng",
                    "Shop Thế Giới Đồ Chơi",R.drawable.xa_can_cau));
            arrayList.add(new Goods("Đồ chơi dạng mô hình",
                    "Shop Thế Giới Đồ Chơi",R.drawable.do_choi_dang_mo_hinh));
            arrayList.add(new Goods("Lãnh Đạo Giản Đơn",
                    "Shop Minh Long Book",R.drawable.lanh_dao_gian_don));
            arrayList.add(new Goods("Hiểu Lòng Con Trẻ",
                    "Shop Minh Long Book",R.drawable.hieu_long_con_tre));
            adt = new CustomGoodsAdapter(this, R.layout.itemlistview, arrayList);
            lvGoods.setAdapter(adt);
        }
    }
