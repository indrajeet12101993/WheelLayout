package retrofit.com.wheellayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import github.hellocsl.cursorwheel.CursorWheelLayout;
import retrofit.com.wheellayout.adapter.WheelImageAdapter;
import retrofit.com.wheellayout.adapter.WheelTextAdaper;
import retrofit.com.wheellayout.model.MenuImageData;
import retrofit.com.wheellayout.model.MenuItemData;

public class MainActivity extends AppCompatActivity {
    CursorWheelLayout wheeltext, wheelimage;

    private List<MenuItemData> menuitems;
    private List<MenuImageData> menuitemsimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();

        loadData();
        wheeltext.setOnMenuSelectedListener(new CursorWheelLayout.OnMenuSelectedListener() {
            @Override
            public void onItemSelected(CursorWheelLayout parent, View view, int pos) {
                if(parent.getId()== R.id.test_circle_menu_right){
                    Toast.makeText(MainActivity.this, "Selected" + menuitems.get(pos).mtitle, Toast.LENGTH_SHORT).show();

                }


               // Toast.makeText(MainActivity.this, "Top Menu selected position:" + pos, Toast.LENGTH_SHORT).show();
            }
        });
        wheelimage.setOnMenuSelectedListener(new CursorWheelLayout.OnMenuSelectedListener() {
            @Override
            public void onItemSelected(CursorWheelLayout parent, View view, int pos) {
                  if(parent.getId()== R.id.test_circle_menu_right_imgage){
                    Toast.makeText(MainActivity.this, "Selected" + menuitemsimage.get(pos).imagedescription, Toast.LENGTH_SHORT).show();

                }


                // Toast.makeText(MainActivity.this, "Top Menu selected position:" + pos, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadData() {
        menuitems= new ArrayList<>();
        for(int i= 0; i<9; i++)
            menuitems.add(new MenuItemData(""+i));
        menuitems.add(new MenuItemData("Off"));


        WheelTextAdaper textadapter= new WheelTextAdaper(getBaseContext(),menuitems);
        wheeltext.setAdapter(textadapter);


        menuitemsimage= new ArrayList<>();
        menuitemsimage.add(new MenuImageData(R.drawable.ic_bank_bc,"jyoti"));
        menuitemsimage.add(new MenuImageData(R.drawable.ic_bank_china,"preeti"));
        menuitemsimage.add(new MenuImageData(R.drawable.ic_bank_guangda,"deva"));
        menuitemsimage.add(new MenuImageData(R.drawable.ic_bank_guangfa,"indra"));
        menuitemsimage.add(new MenuImageData(R.drawable.ic_bank_jianshe,"nitika"));
        menuitemsimage.add(new MenuImageData(R.drawable.ic_bank_jiaotong,"rachna"));

        WheelImageAdapter imageadapter= new WheelImageAdapter(getBaseContext(),menuitemsimage);
        wheelimage.setAdapter(imageadapter);


    }

    private void initviews() {
        wheeltext= (CursorWheelLayout) findViewById(R.id.test_circle_menu_right);
        wheelimage= (CursorWheelLayout) findViewById(R.id.test_circle_menu_right_imgage);

    }
}
